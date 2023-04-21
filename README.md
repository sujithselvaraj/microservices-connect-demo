# microservices-connect-demo

Creating the project refer https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html

Creating a maven module inside the parent project 

Use a docker-compose file and route to the https://localhost:5050 to host the pg admin4 in the safari or your browser .Before that make sure that you have 
your docker running in the local machine.

create a database in pgadmin or postgres in local machine and connect via aplication.yml in the terminal

Refer to the pom.xml for the dependencies and refersh the maven folder to check the dependencies if they are installed

After the completion of the project go and hit the postman with http://localhost:8080/api/v1/customers with the post request with the raw body 

{
    "firstName":"Sujith",
    "lastName":"Selva",
    "email":"sujith@gmail.com"
} 

and check the tables in both customer and fraud table.


Use the https://devops.datenkollektiv.de/banner.txt/index.html to generate a banner.txt file .
