package myHelloWorld_port8082;

import javax.jws.WebService;
 
//Service Implementation
@WebService(endpointInterface = "myHelloWorld_port8082.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
 
	@Override
	public String HelloWorld(String name) {

		System.out.println(name+" says hello");
		return "Hello World " + name;
	}
 
}