import myhelloworld_soap12.HelloWorld;
import myhelloworld_soap12.HelloWorldService;
import myhelloworld_soap12.HelloWorldService_Service;

public class HelloWorldClient {
	public static void main(String[] args) {

	// HelloWorldService_Service is a class
	HelloWorldService_Service myHelloWorld = new HelloWorldService_Service();

	// HelloWorldService is an interface
	HelloWorldService myinterface = myHelloWorld.getHelloWorldImplPort();

	String response = myinterface.helloWorld(args[0]);

        System.out.println(response);
   }
}
