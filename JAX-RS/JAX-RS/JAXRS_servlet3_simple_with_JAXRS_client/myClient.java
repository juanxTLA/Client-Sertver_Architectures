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

import javax.ws.rs.client.Client;  
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.MediaType;

@Path("/theclient")  
public class myClient {  
  // called when request has accept text/plain header 
  @GET  
  @Produces(MediaType.TEXT_PLAIN)  
  public String return_plaintext() {  

     // do a "generic invocation"
      Client client=ClientBuilder.newClient();
      WebTarget theURL = client.target("http://localhost:8080/myrestclient/restclient/hello");

      final String mediaType=MediaType.TEXT_PLAIN;
      Invocation theInvoke = theURL.request(mediaType).buildGet();


      Response theresponse = theInvoke.invoke();

      String thestuff = theresponse.readEntity(String.class);
      System.out.println(thestuff);

      return thestuff;  
  }  
}  
