Works with published service from myHelloWorld directory


This is the top down approach, where you create a WSDL document that
defines the interface, then use wsimport to generate the client using
the previously created WSDL file.

In this particular case, we will access the wsd through a local file that contains. 
the wsdl. There are several ways we could have created the wsdl file: we could have 
used a text editor like Notepad and just typed it in, we could have used
an RDE that gave us a WSDL editor, we could have used an RDE that
allowed us to automatically generate the WSDL file from our previously
written Java code.

However, we will cheat a bit :-) and grab a known good wsdl to put in our file. 
What we will do is open a command prompt, go to the myHelloWorld directory
and follow instructions to publish the web service.
Then display http://localhost:8080/hello?wsdl file in a web browser, and do a copy/paste 
and stored this wsdl into a file called mywsdl.wsdl.

Put mywsdl.wsdl in the current directory.

Then STOP THE web service from running because we want to prove to ourselves
that we're actually starting this up from a .wsdl file and not from the url itself !!!!!

Then use the following:
wsimport -d . -keep -wsdllocation http://localhost:8080/hello mywsdl.wsdl


Now we have to start the web service all over again, so we can connect to it :-)

Open a command prompt and publish the web service again,
typing your commands in that command prompt to do so.
(You will go to the myHelloWorld directory and follow directions there 
again to do this)

Open another command prompt to run the client from this directory, then type:

cd myhelloworld

javac *.java

runclient.bat
