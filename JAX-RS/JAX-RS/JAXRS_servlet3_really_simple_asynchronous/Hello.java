package example.restful;  
import javax.ws.rs.GET;  
import javax.ws.rs.POST;  
import javax.ws.rs.PUT;  
import javax.ws.rs.Path;  
import javax.ws.rs.PathParam;  
import javax.ws.rs.core.Response;  
import javax.ws.rs.Produces;  
import javax.ws.rs.Consumes;  
import javax.ws.rs.core.MediaType; 

import javax.ws.rs.core.Response;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

@Path("/hello")  
public class Hello {  

  @GET  
  public void asyncGet(@Suspended final AsyncResponse asyncResponse) {  
     new Thread (new Runnable() {
     @Override
     public void run() {
     String result = "Received the GET, doing asynchronous response";
     asyncResponse.resume(result);
     }
    } ).start(); 
  }  
}  
