This example provides a Client using the JAVA EE Client RESTful
api that is a Java application and runs independently.

First, to make the server type:
./make_JAXRS_server

THis is the same server we've been using, it's just
in this same directory for convenience.

You can make sure it's running correctly by typing in your browserL
http://localhost:8080/restful/restful/hello

Now we will make the client.  Type;
./compile_myClient 

Now to run the client, type:
./run_myClient

References
https://docs.oracle.com/cd/E19798-01/821-1841/gipzh/index.html
http://docs.oracle.com/javaee/7/api/javax/ws/rs/client/package-summary.html
https://jersey.java.net/documentation/latest/client.html#d0e4257
www.oracle.com/technetwork/articles/java/jaxrs20-1929352.html

