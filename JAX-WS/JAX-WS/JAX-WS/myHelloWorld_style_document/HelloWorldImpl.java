package myHelloWorld_style_document;

import javax.jws.WebService;
 
//Service Implementation
@WebService(endpointInterface = "myHelloWorld_style_document.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
 
	@Override
	public String theHelloWorld(String name) {

		System.out.println(name+" says hello");
		return "Hello World " + name;
	}
 
}