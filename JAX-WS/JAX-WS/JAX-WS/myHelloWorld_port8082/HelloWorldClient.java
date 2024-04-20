package myHelloWorld_port8082;
 
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import myHelloWorld_port8082.HelloWorld;

/* This example does not use wsimport. Instead, it
creates a service instance manually. */
 
public class HelloWorldClient{
 
	public static void main(String[] args) throws Exception {
 
	URL location_of_wsdl = new URL("http://localhost:8080/hello?wsdl");
 
        QName name_of_service = new QName("http://myHelloWorld_port)8082/", "HelloWorldImplService");
 
        Service service = Service.create(location_of_wsdl, name_of_service);
 
        HelloWorld hello = service.getPort(HelloWorld.class);


	String response = hello.HelloWorld(args[0]);
 
        System.out.println(response);
 
    }
 
}