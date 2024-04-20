using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ServiceModel;
using System.ServiceModel.Description;
using SelfHost;

namespace client_using_ChannelFactory
{
    class Program
    {
        static void Main(string[] args)
        {
            BasicHttpBinding binding = new BasicHttpBinding();
            EndpointAddress address = new EndpointAddress("http://localhost:8731/HelloWorldService/helloService");

            ChannelFactory<SelfHost.ImyHelloWorldService> myChannelFactory = new ChannelFactory<ImyHelloWorldService>(binding, address);

            ImyHelloWorldService current_channel = myChannelFactory.CreateChannel();

            string msg;
            msg = "Hi to all, just received:   " + current_channel.HelloWorld("Jane Doe") + "\n";
            Console.WriteLine(msg);
            Console.ReadLine(); // Make console pause so we can read it

            myChannelFactory.Close();

        }
    }
}
