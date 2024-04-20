import myhelloworld.HelloWorld;
import myhelloworld.HelloWorldImplService;

public class HelloWorldClient {
	public static void main(String[] args) {

	HelloWorldImplService myHelloWorld = new HelloWorldImplService();

	HelloWorld myinterface = myHelloWorld.getHelloWorldImplPort();

        //Note the format of the operation call "helloWorld".  This
	//matches the format in the wsimport-generated HelloWorld.java file.
	String response = myinterface.helloWorld(args[0]);
 
        System.out.println(response);
   }
}
