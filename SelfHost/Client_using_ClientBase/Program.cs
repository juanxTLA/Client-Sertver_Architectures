using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ServiceModel;
using SelfHost;


namespace Client_using_ClientBase
{
    class ServiceClient : ClientBase<ImyHelloWorldService>, ImyHelloWorldService
    {  //ClientBase is a wrapper for the System.ServiceModel.ChannelFactory<TChannel> class
        //ClientBase is also a wrapper for the System.ServiceModel.IClient.Channel interface

        //When ClientBase is used, this is what is really happening:
        //  Instantiate ClientBase object--> create a channel factory, use channel factory
        //                                   to create a channel

        //  Call your function on ClientBase --> call the function on the current channel
        
        //  Destruct ClientBase object --> destruct current channel, destruct current channel factory


        public ServiceClient(BasicHttpBinding binding, EndpointAddress address
            )
            : base(binding, address)
            //calling base(binding,address) here means, call the appropriate constructor of the
            //parent ChannelFactory class
        {
        }

        public string HelloWorld(string value)
        {
            return base.Channel.HelloWorld(value);
            // calling the HelloWorld function as accessed by the current channel
            // that was previously defined by the ChannelFactory
        }
    }


    class Program
    {
        static void Main(string[] args)
        {
            BasicHttpBinding binding = new BasicHttpBinding();
            EndpointAddress address = new EndpointAddress("http://localhost:8731/HelloWorldService/helloService");

            ServiceClient client = new ServiceClient(binding, address);

            Console.WriteLine(client.HelloWorld("Joe Blow"));
            Console.ReadLine();
        }
    }
}

