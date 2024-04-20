package HelloWorld_wsgen;

import javax.xml.ws.Endpoint;

import HelloWorld_wsgen.HelloWorldImpl;
 
//Endpoint publisher
public class HelloWorldPublisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:8080/hello", new HelloWorldImpl());
    }
 
}