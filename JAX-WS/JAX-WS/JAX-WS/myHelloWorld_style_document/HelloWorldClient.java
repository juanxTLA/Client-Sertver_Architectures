package myHelloWorld_style_document;
 
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import myHelloWorld_style_document.HelloWorld;

/* This example does not use wsimport. Instead, it
creates a service instance manually. */
 
public class HelloWorldClient{
 
	public static void main(String[] args) throws Exception {
 
	URL location_of_wsdl = new URL("http://localhost:8200/hello?wsdl");
 
        QName name_of_service = new QName("http://myHelloWorld_style_document/", "HelloWorldImplService");
 
        Service service = Service.create(location_of_wsdl, name_of_service);
 
        HelloWorld hello = service.getPort(HelloWorld.class);

	String response = hello.theHelloWorld(args[0]);
 
        System.out.println(response);
 
    }
 
}