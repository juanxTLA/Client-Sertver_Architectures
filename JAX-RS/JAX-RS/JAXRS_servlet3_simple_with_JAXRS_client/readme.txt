This example uses the Client RESTful API that is provided in
Java EE to access the JAX-RS annotated server.

In this particular case, the client is treated as a JAX-RS server
itself, so activating the client can be done from the
browser (note that a curl command could be used instead,
if desired.)

Note that this client employs a "Generic invocation."


To make this example, type:
./makeitall

This will create a .war file that contains both the server
and the client.

Then deploy this war file as usual using the Glassfish
admin console.

After the war file is deployed, to make sure the server is working,
you can type in your browser the following:
http://localhost:8080/myrestclient/restclient/hello

This will call the JAX-RS server directly from the browser, sending a "GET".  
The following will then be printed in the browser:
Hello
to 
all the World

Next, to call the client, type the following in your browser (remember
that in this example the Client is acting as a JAX-RS server for the
purpose of being activated):
http://localhost:8080/myrestclient/restclient/theclient

The following will be printed in the browser:
Hello World

If you want to send requests to different parts of the server,
in the client you just change the media type in the following
statement:

final String mediaType=MediaType.TEXT_PLAIN;


References

https://docs.oracle.com/javaee/7/api/javax/ws/rs/client/package-summary.html


