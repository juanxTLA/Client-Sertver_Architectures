This version uses Style.RPC

Note that, in HelloWorldImpl.java, when it says:

@WebService(endpointInterface = "myHelloWorld_style_RPC.HelloWorld")

What it is telling you is which package (myHellOWorld_style_RPC) and which
interface (HelloWorld)  contains the interface that the
HelloWorldImpl class connects to

"A service endpoint interface or service endpoint implementation (SEI) is a Java interface or class, 
respectively, that declares the methods that a client can invoke on the service. An interface is 
not required when building a JAX-WS endpoint. The web service implementation class implicitly defines
 an SEI.

You may specify an explicit interface by adding the endpointInterface element to the @WebService annotation 
in the implementation class. You must then provide an interface that defines the public methods made 
available in the endpoint implementation class."

this quote from http://docs.oracle.com/cd/E19226-01/820-7627/6nisfjmjh/index.html