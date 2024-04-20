Uses SOAP  1.1

This example provides the web interface by annotating the implementation class,
it does not use a separate interface definition


In this particular case, we will access the wsdl through a url where 
the wsdl was previously published.

NOTE:  You can't run wsimport until you have a 

***************************************************************************************************
NOTE: If you clean up (delete) the old wsimport stuff from the 
HelloWorld_using_class_only\helloworld_using_class_only directory, then 
the HelloWorldClient.java won't compile until after you do
the wsimport. But you have to go ahead and publish the web service so you can
get the url to do the wsimport.
Clarification:  if you delete all the stuff in the
HelloWorld_using_class_only\helloworld_using_class_only directory, you will
have compiler errors in HelloWorldClient.java until after you do the wsimport.

NOTE THAT IF YOU DO A:

javac *.java

AND YOU HAVE ERRORS in HelloClient.java, then the rest of the compilation will stop. IT WON'T
CREATE a HelloWorldPublisher.class, and so you can't publish the webservice!!!

An easy way around this would be to temporarily rename your client to: HelloWorldClient.tmpjava

so that the:  javac *.java
wont' find it.

Or you can just compile each file separately.

****************************************************************************************************


First,open a command prompt, go to the current directory and type: runpublisher.bat.

The wsimport utility will read the wsdl from the published url in order to automatically
create the client. (So as I said before, here we are accessing the
wsdl by accessing the url where the wsdl has been previously published.)



Next, open another command prompt, go to the current directory, then type the following:


wsimport -keep http://localhost:8082/helloanother?wsdl -d .
(Note the "." after the -d  !!!)



javac *.java


runclient.bat