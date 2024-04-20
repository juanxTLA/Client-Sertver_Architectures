import java.io.*;

import javax.ws.rs.core.Response;  
import javax.ws.rs.core.MediaType;  

import javax.ws.rs.client.Client;  
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.Entity;  
      // This entity class encapsulates message entities 
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.MediaType;

public class myClient {  
  
   public static void main(String [] args) throws Exception {  


      Client client=ClientBuilder.newClient();
      WebTarget theURL = client.target("http://localhost:8080/myrestful/restful/hello");

      InputStreamReader r = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(r);

      String mediaType="";
      String thestuff= "";

      System.out.println("Enter (G)ET,(P)UT,or P(O)ST");
      String message=br.readLine();
      if (message.equals("G") )
        {
          System.out.println("Enter (P)lainText, (H)tml, (X)ML");
          message=br.readLine();
          if (message.equals("X") ) // XML
             mediaType=MediaType.TEXT_XML;
          else if (message.equals("H")  )  // HTML
            mediaType=MediaType.TEXT_HTML;
          else // default to plain text
          {
             mediaType=MediaType.TEXT_PLAIN;
          }
         Response theGetResponse=theURL.request(mediaType).get();
         thestuff = theGetResponse.readEntity(String.class);
        }
      else if ( message.equals("P") )
        {    // PUT
        }
      else if ( message.equals("O") )
         {   // POST
         File f = new File("./mydata");
         mediaType=MediaType.APPLICATION_JSON;
         
         Response thePostResponse=theURL.request().post(Entity.entity(f,mediaType));
         thestuff = thePostResponse.readEntity(String.class);
        }
      else
          System.out.println("error in input\n");


      System.out.println(thestuff);

  }  
}  
