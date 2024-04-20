This project illustrates asynchronous JAX-RS.

The web.xml in this project is different from in the earlier servlet3
web.xml files. To do asychronous operation, you have to add:

<async-supported>true</async-supported> 

If you forget to put this line in the file, you'll get an error message something like:

Server encountered an internal error that prevented it from fulfilling this request.</p><p><b>exception</b> <pre>javax.servlet.ServletException: javax.ws.rs.ProcessingException: Attempt to suspend a connection of an asynchronous request failed in the underlying container

Ask me how I know this :-)

To compile the JAX-RS resource, do:
./compile_hello

To create the war file, do:
./create_the_war

Then you can send a command to call it as follows:

curl -X GET http://localhost:8080/myrestful/restful/hello

References

Bien, A. Java EE 7 and JAX-RS 2.0. 2013. http://www.oracle.com/technetwork/articles/java/jaxrs20-1929352.html accessed March 2, 2016

Java Jasks. async operation throws processing exception.2015.http://java.jasks.org/async_operation_throws_processingexception accessed March 2, 2016

Jersey. Chapter 11. Asynchronous Services and Clients. Jersey 2.22.2 User Guide.2015. https://jersey.java.net/documentation/latest/async.html accessed March 2, 2016.
