package myHelloWorld_style_document;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
 
//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.DOCUMENT, parameterStyle=SOAPBinding.ParameterStyle.BARE)
//@SOAPBinding(style = Style.DOCUMENT)

public interface HelloWorld{
 
	@WebMethod String theHelloWorld(String name);
 
}