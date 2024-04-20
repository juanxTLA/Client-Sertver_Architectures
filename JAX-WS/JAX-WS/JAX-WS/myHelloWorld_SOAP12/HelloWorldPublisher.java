package myHelloWorld_SOAP12;

import javax.xml.ws.Endpoint;

import myHelloWorld_SOAP12.HelloWorldImpl;
 
//Endpoint publisher
public class HelloWorldPublisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:8080/hello", new HelloWorldImpl());
    }
 
}