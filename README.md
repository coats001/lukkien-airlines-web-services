
# lukkien-airlines-web-services



## Installation CentOS 7


* Install Java 9  **https://tecadmin.net/install-java-9-centos-fedora/**
* Install Maven  **yum install maven**
* Install Postman **https://gist.github.com/barlowm/9e3918627dfdd9a06ccd5dec25052c9e**
* Clone repo **git clone repo**
* Go to repo diretcory **lukkien-airlines-web-services**
* Do **mvn clean install**
* Go to the directory where the executable jar is deployed **.m2/repository/com/in28minutes/rest/webservices/restful-web-services/0.0.1-SNAPSHOT**
* Change the permission the jar as root  **sudo chmod  777 restful-web-services-0.0.1-SNAPSHOT.jar**
* Run the appication   **./restful-web-services-0.0.1-SNAPSHOT.jar**
* Application is now available at http://localhost:9000/  (If there was a port conflict the port can be changed in application.porperties)
* A basic set of initial data is loaded from the file **data.sql**. Use the H2 Console to inspect the contect of the database.
* At restart it may happen that the port is in use. See here how to resolve that by killing the proces: https://stackoverflow.com/questions/11583562/how-to-kill-a-process-running-on-particular-port-in-linux




## Swagger documentation
http://localhost:9000/swagger-ui.html

## H2 Console
http://localhost:9000/h2-console/




## Testing the basic happy flow

### Search for fligth using departure or destination Airport 
Search for fligth either by name or code of departure using URI: http://localhost:9000//flight/departure/nameOrCode/{nameOrCode} 
or by destionation name or code http://localhost:9000/flight/destination/nameOrCode/{nameOrCode}. nameOrCode should be one ormore character(s) that is/are contained in either the name or code of and airport (rever to the basic dataset Airport Table). In case up to 3 character are provided both name and code are searched, more than 3 then only name is considered. This search returns a collection of flight that satisfies the search criteria.

### Book flight
Pick the id of on of the flight out of the collection. Use the URI: http://localhost:9000/booking/flightId/{flightId}/passengerName/{passengerName}/price/{price} where the flight is subtitued by the id af the choosen flight and the
paramaters passengerName is a freely determined String and price is a free determined Integer to book a flight using a POST request. A Booking object is return while a passenger is registered. The Booking get the current date and time as as extra field.

### Generate report of Bookings

