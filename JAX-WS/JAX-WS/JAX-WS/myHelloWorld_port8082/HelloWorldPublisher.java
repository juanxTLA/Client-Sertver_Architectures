package myHelloWorld_port8082;

import javax.xml.ws.Endpoint;

import myHelloWorld_port8082.HelloWorldImpl;
 
//Endpoint publisher
public class HelloWorldPublisher{
 
	public static void main(String[] args) {
	   Endpoint.publish("http://localhost:8082/helloanother", new HelloWorldImpl());
    }
 
}