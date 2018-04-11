
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


## Swagger documentation
http://localhost:9000/swagger-ui.html

## H2 Console
http://localhost:9000/h2-console/


