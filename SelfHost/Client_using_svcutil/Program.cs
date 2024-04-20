using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ServiceModel;
using System.ServiceModel.Description;

namespace Client_using_svcutil
{
    class Program
    {
        static void Main(string[] args)
        {

            BasicHttpBinding binding = new BasicHttpBinding();

            EndpointAddress address = new EndpointAddress("http://localhost:8731/HelloWorldService/helloService");

            ImyHelloWorldServiceClient myclient = new ImyHelloWorldServiceClient(binding, address); 
   

            string msg = myclient.HelloWorld("Jane Doe");  // call the Hello, World Server
            
            
            Console.WriteLine("msg is {0}\n", msg);

            Console.ReadLine();  // Pause so can read console

        }
    }
}


/* using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ServiceModel;
using System.ServiceModel.Description;

namespace Client_using_svcutil
{
    class Program
    {
        static void Main(string[] args)
        {
            ImyHelloWorldServiceClient myclient;

  //              public ImyHelloWorldServiceClient(string endpointConfigurationName, string remoteAddress) : 
 //       http://localhost:8731/Design_Time_Addresses/HelloWorldService/helloService
    //        myclient = new ImyHelloWorldServiceClient("helloService","HelloWorld");  //"helloService" is the endpoint name
            myclient = new ImyHelloWorldServiceClient("helloService");  //"helloService" is the endpoint name

      //      ImyHelloWorldServiceClient myclient = new ImyHelloWorldServiceClient(binding, address); 
   

            string msg = myclient.HelloWorld("Jane Doe");  // call the Hello, World Server
            
            
            Console.WriteLine("msg is {0}\n", msg);

            Console.ReadLine();  // Pause so can read console

        }
    }
}

*/