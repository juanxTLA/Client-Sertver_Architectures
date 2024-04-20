package myHelloWorld_SOAP12_dispatch_client;

import javax.xml.ws.Endpoint;

import myHelloWorld_SOAP12_dispatch_client.HelloWorldImpl;
 
//Endpoint publisher
public class HelloWorldPublisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:8080/hello", new HelloWorldImpl());
    }
 
}