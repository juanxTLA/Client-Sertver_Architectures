package example.restful;  
import javax.ws.rs.GET;  
import javax.ws.rs.POST;  
import javax.ws.rs.PUT;  
import javax.ws.rs.Path;  
import javax.ws.rs.PathParam;  
import javax.ws.rs.QueryParam;  
import javax.ws.rs.core.Response;  
import javax.ws.rs.Produces;  
import javax.ws.rs.Consumes;  
import javax.ws.rs.core.MediaType;  

// Note that in this particular example, the mime types are what
// sends the requests to the appropriate query parameter (and no parameter)  routines.
// The differences in query parameters between the routines isn't enough
// to differentiate between the different routines--without the different MIME types
// this would compile but not load into glassfish (because glassfish wouldn't be able
// to tell which one to send the GET request to).  In a production system, having
// no query parameters, one or more would be handled by the multiple parameter
// routine, with individual query parameters checked for validity.
// These are kept separate here for clarity in discussion.

@Path("/hello")  
public class Hello {  
  // called when GET is sent to url with no parameters, Response return type 
  @GET  
  public Response return_plaintext_no_params() {  
 
    return Response.status(200).entity("GET no params \n\n").build();  
  }  
  // called when GET is sent to url with query parameter (?id=45 for example) 
  @GET  
  @Produces(MediaType.TEXT_HTML)  
  public Response return_html_query_param(@QueryParam("id") int id) {  
 
    return Response.status(200).entity("GET query parameter "+id+"\n\n").build();  
  }  
  // called when GET is sent to url with multiple query parameters (?id=45&thestuff=hello for example) 
  @GET  
  @Produces(MediaType.TEXT_XML)  
  public Response return_html_query_param(@QueryParam("id") int id, @QueryParam("thestuff") String thestuff) {  
 
    return Response.status(200).entity("GET multiple query parameters: id is "+ id + " and thestuff is " +thestuff+"\n\n").build();  
  }  
  // called when GET is sent to url with parameter 
  @GET  
  @Path("{id}")  
  public Response return_plaintext_single_param(@PathParam("id") String id) {  
 
    return Response.status(200).entity("GET short path: value passed is "+id+"\n\n").build();  
  }  
  // called when GET is sent to url with parameter, path more fully specified 
  @GET  
  @Path("/more/{id}")  
  @Produces(MediaType.TEXT_PLAIN)  
  public Response return_plaintext_multiple_params(@PathParam("id") String id) {  
    return Response.status(200).entity("GET longer path: value passed is "+id+"\n\n").build();  
  }  
  // called when POST is sent to url with parameter  
  @POST
  @Path("{id}")  
  public Response received_POST_single_param(@PathParam("id") String id) {  
    return Response.status(200).entity("POST: value passed is "+id+"\n\n").build();  
  }  
  // called when GET is sent to url with multiple parameters
  @GET  
  @Path("{id}/{thestuff}")  
  public Response return_plaintext_single_param(@PathParam("id") int id, @PathParam("thestuff") String thestuff) {  
 
    return Response.status(200).entity("GET multiple path parameters: id is "+ id + " and thestuff is " +thestuff+"\n\n").build();  
  }  
}  
