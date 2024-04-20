Works with published service from myHelloWorld directory


This is the top down approach, where you create a WSDL document that
defines the interface.

In this particular case, we will access the wsdl through a url where 
the wsdl was previously published.


BEGIN EXAMPLE
Open a command prompt and make sure that the web service has already been published,
typing your commands in that command prompt to do so.
(You will go to the myHelloWorld directory and follow directions there 
to do this)


Next, you will use the wsimport utility to read the url and create the
files to access the web service. 

To do this, open another command prompt.
In this command prompt, cd to the current directory, then type the following:


wsimport -keep http://localhost:8080/hello?wsdl -d .
(Note the "." after the -d  !!!)


javac *.java


runclient.bat
