Uses Soap 1.2

This example creates a web service using SOAP 1.2

Then we use wsimport to create a SOAP 1.2 client that can call the web service.

***************************************************************************************************
NOTE: If you clean up (delete) the old wsimport stuff from the 
HelloWorld_class_only\helloworld_class_only directory, then 
the HelloWorldClient.java won't compile until after you do
the wsimport. But you have to go ahead and publish the web service so you can
get the url to do the wsimport.
Clarification:  if you delete all the stuff in the
HelloWorld_class_only\helloworld_class_only directory, you will
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


First publish the web service:  open a command prompt, go to the
current directory, and type runpublisher.bat.


The wsimport utility will read the published wsdl in order to automatically
create the client. (So here we are accessing the
wsdl by accessing the url where the wsdl has been previously published.)

Open another command prompt, go to the current directory, and type the following:


wsimport -extension -keep http://localhost:8080/hello?wsdl -d .
(Note the "." after the -d  !!!)

(NOTE that with SOAP 1.2 you must specify "-extension" in the wsimport   !!!!!!!!!)


runclient.bat
