
package helloworld_class_only;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "HelloWorld", targetNamespace = "http://HelloWorld_class_only/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWorld {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "HelloWorld")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "HelloWorld", targetNamespace = "http://HelloWorld_class_only/", className = "helloworld_class_only.HelloWorld_Type")
    @ResponseWrapper(localName = "HelloWorldResponse", targetNamespace = "http://HelloWorld_class_only/", className = "helloworld_class_only.HelloWorldResponse")
    public String helloWorld(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
