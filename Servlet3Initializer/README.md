Source: http://blog.coralic.nl/2010/03/09/how-to-use-embedded-glassfish-maven-plugin/

To start the embedded glassfish server do

mvn package embedded-glassfish:run

If you change something to hello.html while the embedded server is running 
you need to package and redeploy the application. How to do so, leave the 
embedded server running. Change something to hello.html. 
Open another commandline and fire up the following maven comamnd
	
mvn package

Now go back to your commandline where the embedded server is running and 
press enter. Your application will be re-deployed.

To test your hello.html brows to http://localhost:8888/server