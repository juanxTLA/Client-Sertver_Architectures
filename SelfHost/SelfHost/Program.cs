using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ServiceModel;
using System.ServiceModel.Description;


using SelfHost;
 
    class Program
    {
        static void Main(string[] args)
        {
            // Note that you HAVE to use port 8731 with Design_Time_Addresses. Net 3.5 and above set up
            // an Access Control List (ACL) when Visual Studio is installed, this allows users without
            // admin privilegest to develop WCF services.  This also allows users to user the WCF
            // Service Auto Host (wcfSvcHost.exe) without being administrators
            
            Uri baseAddress = new Uri("http://localhost:8731/HelloWorldService");



            // Create the ServiceHost.
           // ServiceHost host = new ServiceHost(typeof(myHelloWorldService), baseAddress);
   
            ServiceHost host = new ServiceHost(typeof(myHelloWorldService), baseAddress);
            try
            {
                BasicHttpBinding current_binding = new BasicHttpBinding();
                host.AddServiceEndpoint(typeof(ImyHelloWorldService), current_binding, "helloService");
                   // So to be clear, the actual endpoint now is:
                  // http: //localhost:8731/Design_Time_Addresses/HelloWorldService/helloService
                  // So for a client to call it, the client must have a proxy pointing to this endpoint
                  //  let's call that "myproxy"
                  // then you call myproxy.HelloWorld("yourname")



                // Publish the metadata so it is accessable through http. This is not secure metadata, this allows the whole world to see it.
                ServiceMetadataBehavior smb = host.Description.Behaviors.Find<ServiceMetadataBehavior>();
                if (smb == null)
                    smb = new ServiceMetadataBehavior();

                smb.HttpGetEnabled = true;          // This allows access of the metadata via http

                //        smb.MetadataExporter.PolicyVersion = PolicyVersion.Policy15;  // Policy15 corresponds to WS-Policy 1.5

                host.Description.Behaviors.Add(smb);


                host.Open();    // With host.Open there will be one endpoint per base address for each service contract
                // by default, but we configured an endpoint instead

                Console.WriteLine("The service is running and is located at \n {0}. \n Call it and pass it your name: {1} \n", baseAddress, "someone's name");
                Console.WriteLine("To stop the service hit enter");
                Console.ReadLine();  // Keep the console window from disappearing so you can see it (by making it wait for input)

                // Close the ServiceHost.
                host.Close();
            }
            catch (CommunicationException ce_exception)
            {
                Console.WriteLine("Exception {0} occurred.  Will abort\n", ce_exception.Message);
                host.Abort();
            }
        }
    }


