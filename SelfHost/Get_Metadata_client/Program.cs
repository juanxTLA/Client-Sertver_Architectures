using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;
//using System;
//using System.Collections.Generic;
//using System.IO;
//using System.Linq;
//using System.Net;
//using System.Text;
//using System.Threading.Tasks;

namespace Get_Metadata_client
{
    class Program
    {
        static void Main(string[] args)
        {
            string current_url;
            string CurrentLine = "";                        // Set the input line to empty to begin with
            Stream return_from_request_Stream;              // to hold the output of the request
            StreamReader return_from_request_Reader;        // to  read the response from the request

            current_url = "http://localhost:8731/HelloWorldService?wsdl";

            WebRequest my_request = WebRequest.Create(current_url);


            return_from_request_Stream = my_request.GetResponse().GetResponseStream();

            return_from_request_Reader = new StreamReader(return_from_request_Stream);
            CurrentLine = return_from_request_Reader.ReadLine();  // All the metadata comes out at once, in one ReadLine


            Console.WriteLine(CurrentLine);
            Console.ReadLine(); // Pause so the console can be read (so the console won't disappear)

        }
    }
}