package myHelloWorld_SOAP12;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

 
//Service Endpoint Interface

@WebService(name = "HelloWorldService")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
public interface HelloWorld{
 
	public String HelloWorld(@WebParam(name = "name") String name);
 
}