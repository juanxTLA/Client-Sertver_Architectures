When deploying to a servlet container, a JAX-RS/Jersey application is typically packaged as a war file.

From Jersey, Chapter 4. Application Deployment and Runtime Environments
https://jersey.java.net/documentation/latest/deployment.html

accessed February 19, 2016

4.7.2.3.1. JAX-RS application without an Application subclass
If no Application (or ResourceConfig) subclass is present, Jersey will dynamically add a Jersey container Servlet and set its name to javax.ws.rs.core.Application. The web application path will be scanned and all the root resource classes (the classes annotated with @Path annotation) as well as any providers that are annotated with @Provider annotation packaged with the application will be automatically registered in the JAX-RS application. The web application has to be packaged with a deployment descriptor specifying at least the mapping for the added javax.ws.rs.core.Application Servlet:

Example 4.17.  web.xml of a JAX-RS application without an Application subclass
	
<web-app version="3.0"
    xmlns="http://java.sun.com/xml/ns/javaee"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
 
    <!-- Servlet declaration can be omitted in which case
         it would be automatically added by Jersey -->
    <servlet>
        <servlet-name>javax.ws.rs.core.Application</servlet-name>
    </servlet>
 
    <servlet-mapping>
        <servlet-name>javax.ws.rs.core.Application</servlet-name>
        <url-pattern>/myresources/*</url-pattern>
    </servlet-mapping>
</web-app>
