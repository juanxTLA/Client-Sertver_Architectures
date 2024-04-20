package project;

import javax.xml.namespace.QName;
import java.net.URL;
import javax.xml.ws.Service;


public class VeryImportantCompany {
    
    private Service doorService, windowService;
    private DataGetter doorStatus, windowStatus;
    private URL doorServerURL, windowServerURL;
    private QName doorServiceName, windowServiceName;



    public VeryImportantCompany() throws Exception{

        this.doorServerURL = new URL("http://localhost:8080/doors?wsdl");
        this.doorServiceName = new QName("http://project/", "DoorServerService");
        this.doorService = Service.create(doorServerURL,doorServiceName);
        this.doorStatus = doorService.getPort(DataGetter.class);

        this.windowServerURL = new URL("http://localhost:8080/windows?wsdl");
        this.windowServiceName = new QName("http://project/", "WindowServerService");
        this.windowService = Service.create(windowServerURL,windowServiceName);
        this.windowStatus = windowService.getPort(DataGetter.class);


    }

    public String[][] updateData(){
        String[][] out = new String[2][2];
        for(int i = 0; i < 2; i++) {
            out[0][i] = doorStatus.displayStatus(i);
            out[1][i] = windowStatus.displayStatus(i);
        }

        return out;
    }

}