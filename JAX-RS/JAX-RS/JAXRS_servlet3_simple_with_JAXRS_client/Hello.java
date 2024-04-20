package example.restclient;  
import javax.ws.rs.GET;  
import javax.ws.rs.POST;  
import javax.ws.rs.PUT;  
import javax.ws.rs.Path;  
import javax.ws.rs.PathParam;  
import javax.ws.rs.core.Response;  
import javax.ws.rs.Produces;  
import javax.ws.rs.Consumes;  
import javax.ws.rs.core.MediaType;  

@Path("/hello")  
public class Hello {  
  // called when request has accept text/plain header 
  @GET  
  @Produces(MediaType.TEXT_PLAIN)  
  public String return_plaintext() {  
    return "Hello World\n\n";  
  }  
  
  // called when request has accept text/html header  
  @GET  
  @Produces(MediaType.TEXT_HTML)  
  public String return_html() {  
    return "<html> " + "<body>" + "<h1>" + "Hello" +"</h1>"+"<h2>"+"to" + "</h2>"  
        + "<h2>" + "all the World" + "</h2>"+"</body>" + "</html> "+"\n";  
  }  
  
  // called when request has accept text/xml header  
  @GET  
  @Produces(MediaType.TEXT_XML)  
  public String return_XML() {  
    return "<?xml version=\"1.0\"?>" + "<thedata> Hello World" + "</thedata>"+"\n";  
  }  
  // called when request sends a POST with data in format "variable=value"  
  @POST
  public String received_POST(String msg) {  
    return "POST: got a string "+msg+"\n";  
  }  
  // called when request sends a PUT with JSON data  
  @PUT
  @Consumes(MediaType.APPLICATION_JSON)  
  public String received_JSON_PUT(String msg) {  
    return "PUT: got a JSON file "+msg+"\n";  
  }  
  // called when request sends a POST with JSON data and 
  // must return more interesting response
  @POST
  @Consumes(MediaType.APPLICATION_JSON)  
  public Response received_JSON_POST(String msg) { 
    if (!msg.isEmpty()) 
    {
      String mymessage = "POST: got a JSON file " + msg + "\n";
      return Response.status(200).entity(mymessage).build();
    }
   else {
      return Response.status(Response.Status.NOT_FOUND).entity("Null String Received\n\n").build();
   }
  }  
}  
