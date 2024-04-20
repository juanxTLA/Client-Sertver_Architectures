package myHelloWorld_style_RPC;

import javax.jws.WebService;
 
//Service Implementation
@WebService(endpointInterface = "myHelloWorld_style_RPC.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
 
	@Override
	public String HelloWorld(String name) {

		System.out.println(name+" says hello");
		return "Hello World " + name;
	}
 
}