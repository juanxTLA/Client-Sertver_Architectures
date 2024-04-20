package thehello;

import javax.jws.WebMethod;
import javax.jws.WebService;


import javax.xml.ws.soap.Addressing;




@WebService
@Addressing(required = true)
public class HelloWorld {

  @WebMethod
   public String HelloWorld(String name) { 

	System.out.println(name+" says hello");
	return "Hello World " + name;

  }


}
