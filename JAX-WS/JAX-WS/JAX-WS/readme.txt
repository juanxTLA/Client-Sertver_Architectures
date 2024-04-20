
go to 

http://localhost:8080/hello?wsdl”

in a web browser

This shows the edvondWSDL (Web Service Definition Language) document, which
was automatically generated when the hello service started

The client in myHelloWorld/HelloWorldClient.java is a "dynamic proxy client."  This means that
it is invoking a service endpoint interface (SEI) dynamically at runtime without using
automated client generation.

If you want to run the automatically generated (using wsimport) client, instead of the
client included here, go to directory:
client_from_wsimport

and follow directions in the readme.txt file there

There are multiple ways to do automated client generation, these include:
1) wsimport--native to the JAX-WS reference implementation
2) wsconsume--from JBoss
3) clientgen--from WebLogic


From: http://stackoverflow.com/questions/1945618/tracing-xml-request-responses-with-jax-ws:
//This code causes SOAP Request and Response to dump in Text to standard out
System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");


References

https://access.redhat.com/documentation/en-US/JBoss_Enterprise_Application_Platform/6/html/Development_Guide/Develop_a_JAX-WS_Client_Application.html

http://examples.javacodegeeks.com/enterprise-java/jws/jax-ws-hello-world-example-rpc-style/

https://jax-ws.java.net/