package example.restful;  
import javax.ws.rs.GET;  
import javax.ws.rs.POST;  
import javax.ws.rs.PUT;  
import javax.ws.rs.Path;  
import javax.ws.rs.QueryParam;  
import javax.ws.rs.core.Response;  
import javax.ws.rs.Produces;  
import javax.ws.rs.Consumes;  
import javax.ws.rs.core.MediaType;  

@Path("/hello")  
public class Hello {  
  // called when request sends a POST with data in format "variable=value"  
  @POST
  @Path("/postpath")
  public String received_POST(@QueryParam("mystring") String mystring,
                              @QueryParam("myint") String myint) {  
    System.out.println("Data string received was "+mystring+"\n");  
    System.out.println("Data int received was "+myint+"\n");  
    return "data received was "+mystring+" and "+myint+"\n"; 

  }  
}  
