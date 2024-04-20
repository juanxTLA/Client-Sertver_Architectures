package project;

import java.util.Random;
import java.util.Scanner;
import javax.xml.namespace.QName;
import java.net.URL;
import javax.xml.ws.Service;


public class Simulate {



    public static void main (String[] args) throws Exception {
        URL doorServerURL = new URL("http://localhost:8080/doors?wsdl");
        QName doorServiceName = new QName("http://project/", "DoorServerService");

        URL windowServerURL = new URL("http://localhost:8080/windows?wsdl");
        QName windowServiceName = new QName("http://project/", "WindowServerService");

        Service doorService = Service.create(doorServerURL,doorServiceName);
        DataGetter doorStatus = doorService.getPort(DataGetter.class);

        Service windowService = Service.create(windowServerURL,windowServiceName);
        DataGetter windowStatus = windowService.getPort(DataGetter.class);
        Random rand = new Random();

        Scanner scan = new Scanner(System.in);

        String[] possibleDoorStates = {"Closed but not locked", "Closed and locked", "Open"};
        String[] possibleWindowStates = {"Closed and locked", "Half Open", "Closed but not locked", "Open"};

        System.out.println("Press any key + enter to simulate");
        while(true){
            String s = scan.next();

            int rand1 = rand.nextInt(3);
            int rand2 = rand.nextInt(3);
            int rand3 = rand.nextInt(4);
            int rand4 = rand.nextInt(4);

            doorStatus.setStatus(possibleDoorStates[rand1],0);
            doorStatus.setStatus(possibleDoorStates[rand2],1);

            windowStatus.setStatus(possibleWindowStates[rand3],0);
            windowStatus.setStatus(possibleWindowStates[rand4],1);


            System.out.println("Press any key + enter to simulate");
        }



    }

}
