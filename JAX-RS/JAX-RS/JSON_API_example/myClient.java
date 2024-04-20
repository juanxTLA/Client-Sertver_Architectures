package myJSONAPIexample;
import java.io.*;

import javax.json.Json;
import javax.json.JsonObject;
public class myClient {  

   public static void main(String [] args) throws Exception {  



        JsonObject myobject = Json.createObjectBuilder().add("hi","y'all").add("location",Json.createObjectBuilder().add("city","Huntsville").add("state","Alabama")). build();

        Greeting currentGreeting = new Greeting();
        currentGreeting.whogreeted=myobject.getString("hi");
        JsonObject innerLocation=myobject.getJsonObject("location");

        Location mylocation = new Location();

        mylocation.city=innerLocation.getString("city");
        mylocation.state=innerLocation.getString("state");

        currentGreeting.thelocation=mylocation;

        

      System.out.println("Greeting is : hi "+ currentGreeting.whogreeted+" "+currentGreeting.thelocation.city+" "+currentGreeting.thelocation.state+"\n");

   }

}  
