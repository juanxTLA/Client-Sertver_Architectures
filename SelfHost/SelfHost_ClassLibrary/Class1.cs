using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ServiceModel;
using System.ServiceModel.Description;


namespace SelfHost
{
    [ServiceContract]
    public interface ImyHelloWorldService
    {
        [OperationContract]
        string HelloWorld(string name);
    }

    public class myHelloWorldService : ImyHelloWorldService
    {
        public string HelloWorld(string yourname)
        {
            string mymsg = "Hello, world, especially hello to " + yourname;
            return mymsg;
        }
    }
}
