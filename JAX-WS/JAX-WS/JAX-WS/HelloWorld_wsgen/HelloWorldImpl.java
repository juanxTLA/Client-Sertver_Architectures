package HelloWorld_wsgen;

import javax.jws.WebService;
 
//Service Implementation
@WebService(endpointInterface = "HelloWorld_wsgen.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
 
	@Override
	public String HelloWorld(String name) {

		System.out.println(name+" says hello");
		return "Hello World " + name;
	}
 
}