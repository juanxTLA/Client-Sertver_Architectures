package myHelloWorld_style_document;

import javax.xml.ws.Endpoint;

import myHelloWorld_style_document.HelloWorldImpl;
 
//Endpoint publisher
public class HelloWorldPublisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:8080/hello", new HelloWorldImpl());
    }
 
}