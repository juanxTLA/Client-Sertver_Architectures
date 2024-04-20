package myHelloWorld_SOAP12_dispatch_client;
 
import javax.xml.namespace.QName;
 
import javax.xml.soap.MessageFactory;
 
import javax.xml.soap.SOAPBody;
 
import javax.xml.soap.SOAPConstants;
 
import javax.xml.soap.SOAPElement;

import javax.xml.soap.SOAPBodyElement;

import javax.xml.soap.SOAPException;
 
import javax.xml.soap.SOAPEnvelope;
 
import javax.xml.soap.SOAPHeader;
 
import javax.xml.soap.SOAPMessage;
 
import javax.xml.soap.SOAPPart;
 
import javax.xml.ws.Dispatch;
 
import javax.xml.ws.Service;
 
import javax.xml.ws.handler.MessageContext;
 
import javax.xml.ws.soap.SOAPBinding;

import javax.xml.ws.BindingProvider;

import javax.xml.ws.soap.AddressingFeature;



import  myHelloWorld_SOAP12_dispatch_client.HelloWorld;



public class HelloWorldClient {
    public static void main(String[] args) throws SOAPException {

/*  Uncomment if needed for debugging

//This code causes SOAP Request and Response to dump in Text to standard out
System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");

*/


System.out.println("arg is"+args[0]);

        QName serviceName=new QName("http://localhost/","HelloWorldService");
        QName portName=new QName("http://localhost/","HelloWorldImplPortBinding");
        Service service = Service.create(serviceName);
        service.addPort(portName, SOAPBinding.SOAP12HTTP_BINDING,"http://localhost:8080/hello");

	Dispatch<SOAPMessage> dispatch = service.createDispatch(portName,SOAPMessage.class,Service.Mode.MESSAGE);

        MessageFactory mf = MessageFactory.newInstance(SOAPConstants.SOAP_1_2_PROTOCOL);
        SOAPMessage message = mf.createMessage();
        SOAPPart part = message.getSOAPPart();
        SOAPEnvelope env = part.getEnvelope();
//	SOAPHeader header = env.getHeader();
        SOAPBody body = env.getBody();


        QName bodyName= new QName("http://myHelloWorld_SOAP12_dispatch_client/","HelloWorld","m");

        SOAPBodyElement bodyElement = body.addBodyElement(bodyName);

        QName symbol = new QName("name");
        SOAPElement name = bodyElement.addChildElement(symbol);
        
        
        name.addTextNode(args[0]);


        message.saveChanges();

//These two statements were required in a SOAP 1.1 dispatch client, but not in a SOAP 1.2 dispatch client.
//	dispatch.getRequestContext().put(BindingProvider.SOAPACTION_USE_PROPERTY,true);
//	dispatch.getRequestContext().put(BindingProvider.SOAPACTION_URI_PROPERTY,"http://myHelloWorld_SOAP12_dispatch_client/HelloWorld/HelloWorldRequest");





        SOAPMessage response=dispatch.invoke(message);
 
	// Get values from SOAP response
	String the_response = response.getSOAPBody().getElementsByTagName("return").item(0).getFirstChild().getNodeValue(); 	
	System.out.println("The response is "+the_response);
   

    }
}