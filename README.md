This is a simple TODO list application that has backend services, web and mobile front-ends.

It serves as a template project for building RESTful services, with Web and Mobile front-ends using best practices implemented in each of the technology stacks.

Web SPA (Single Page Application) front-end is written using Angularjs framework. RESTful service is written using Oracle Jersey (JAX-RS implementation) and Google Guice.

Building backend needs Gradle. Backend Main class starts embedded Jetty to serve up REST resources.

Building web front-end requires Grunt and Bower. npm install, grunt install followed by grunt dev should start the front-end to be accessible at http://localhost:8080. Since backend is served up from Jetty at http://localhost:9090, CORS need to be disabled in your browser (For Chrome passing "--args --disable-web-security" should start Chrome with disable CORS check, please check your browser documentation if different)
