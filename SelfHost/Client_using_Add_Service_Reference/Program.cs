using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ServiceModel;
using System.ServiceModel.Description;

namespace Client_using_Add_Service_Reference
{
    class Program
    {
        static void Main(string[] args)
        {
            Hello_Service_Reference.ImyHelloWorldServiceClient myclient = new Hello_Service_Reference.ImyHelloWorldServiceClient();

            Console.WriteLine("this is what I have = {0}", myclient.HelloWorld("John Doe"));
            Console.ReadLine(); // just to pause the console screen, don't really want to read anything

            myclient.Close(); // close it just because it's a good idea

        }
    }
}