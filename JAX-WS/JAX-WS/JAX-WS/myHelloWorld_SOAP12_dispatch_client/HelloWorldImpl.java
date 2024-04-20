package myHelloWorld_SOAP12_dispatch_client;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
 
//Service Implementation


@WebService(endpointInterface = "myHelloWorld_SOAP12_dispatch_client.HelloWorld", serviceName = "HelloWorldService", targetNamespace = "http://myHelloWorld_SOAP12_dispatch_client/")
@BindingType(value = "http://java.sun.com/xml/ns/jaxws/2003/05/soap/bindings/HTTP/")
public class HelloWorldImpl implements HelloWorld{
 
	@Override
	public String HelloWorld(String name) {


		System.out.println(name+" says hello");
		return "Hello World " + name;


	}
 
}