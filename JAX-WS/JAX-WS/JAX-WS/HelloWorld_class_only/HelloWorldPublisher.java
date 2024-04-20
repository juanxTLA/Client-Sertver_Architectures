package HelloWorld_class_only;

import javax.xml.ws.Endpoint;

import HelloWorld_class_only.HelloWorld;
 
//Endpoint publisher
public class HelloWorldPublisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:8082/helloanother", new HelloWorld());
    }
 
}