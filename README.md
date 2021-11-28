# Land Route Teste

 This demo project can calculate any possible land route from one country to another.
 
 # Building this Project
 
 Clean modules before running application using command below:
 
 ``` mvn clean install ```

Run the application using command below:

``` mvn spring-boot:run ```

# How to use the REST application

To check if the application is running, please try access the following URL:

```http://localhost:8080/```

To check possible land route from one counry to another, use the REST endpoint exposed: 

```/routing/{origin}/{destination}```

```e.g: http://localhost:8080/routing/AFG/KAZ```

The ORIGIN and DESTINATION code can be easily found in [DATA Link Page](https://raw.githubusercontent.com/mledoze/countries/master/countries.json)

NOTE: Countries code are identified by **cca3** field in data link
