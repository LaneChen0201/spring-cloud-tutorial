### A sample project for spring cloud
~~~
Author: Lane Chen
Create Date: 2017
~~~

- eureka-service

  a sample service based on Spring Cloud Eureka
  ```
      1. run ./gradlew :eureka-service:build
      2. find jar under build/lib folder
      3. start eureka servers with command  
         java -jar eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1
         java -jar eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2
  ```

- sample-service

  a sample service based on Spring Boot
  ```
      1. run ./gradlew :sample-service:build
      2. start service on specific ports
         java -jar sample-service-0.0.1-SNAPSHOT.jar --server.port=8888 --management.port=9000
      3. service will be registered on eureka server
      4. provide gretting service on localhost:port/greeting?name=***
  ```
  
  consumer-service
  
  a consumer service based on Ribbon & Hystrix
  ```
      1. run ./gradlew :consumer-service:bootRun
      2. ribbon client serves on http://localhost:port/ribon-greeting
      3. ribbon-hystrix client serves on http://localhost:port/hystrix-greeting
  ```
  
  feign-consumer-service
  a consumer service based on Spring Cloud Feign
  ```
      1. run ./gradlew :feign-consumer-service:boorRun
      2. feign client serves on http://localhost:port/feign-greeting
  ```
  
  security-service
  a consumer service based on Spring Security
  ```
      1. run ./gradlew :security-service:boorRun
      2. login page on http://localhost:8080/login
      3. greeting page http://localhost:8080/greeting
      3. rest greeting response http://localhost:8080/rest-greeting
  ```