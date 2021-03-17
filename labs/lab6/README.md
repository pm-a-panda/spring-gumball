# CMPE 172 - Lab #6 Notes

# Table of Contents
[Spring Rest](#spring-rest)

[Spring Starbucks](#spring-starbucks)

# Spring Rest
We generated a Spring Boot Project using https://start.spring.io/ using the following parameters.
* Project: Gradle Project
* Language: Java Language (JDK 11)
* Spring Boot Version: 2.4.2
* Group: com.example
* Artifact: spring-rest
* Name: spring-rest
* Package Name: come.example.spring-rest
* Packaging: Jar
* Dependencies: Spring Web, Spring Data JPA, Spring HATEOAS, H2 Database

We added the following files:
* Employee.java
* EmployeeController.java
* EmployeeModelAssembler.java
* EmployeeNotFoundAdvice.java
* EmployeeNotFoundException.java
* EmployeeRepository.java
* LoadDatebase.java
* Order.java
* OrderController.java
* OrderModelAssembler.java
* OrderNotFoundException.java
* OrderRepository.java
* Status.java

We took the following file and imported it into postman:
* postman-collection.json

We ran the following function in Ubuntu:
* gradle build
* gradle bootRun

![1](172.6/172.6.1.png)
![2](172.6/172.6.2.png)
![3](172.6/172.6.3.png)
![4](172.6/172.6.4.png)
![5](172.6/172.6.5.png)
![6](172.6/172.6.6.png)
![7](172.6/172.6.7.png)
![8](172.6/172.6.8.png)
![9](172.6/172.6.9.png)
![10](172.6/172.6.10.png)
![11](172.6/172.6.11.png)
![12](172.6/172.6.12.png)

# Spring Starbucks
We retrieved the starbucks-nodejs folder from https://github.com/paulnguyen/cmpe172/tree/main/labs/lab6

We ran the following functions in Ubuntu:
* sdk install gradle 4.9
* sdk use gradle 4.9
* sdk list java
* sdk install java 8.0.282.j9-adpt
* docker network create --driver bridge starbucks
* docker run --network starbucks --name starbucks-api -p 3000:3000 -td paulnguyen/starbucks-api:v1.0

A Login with Pin is shown in the Ubuntu. The following functions were used to input the pin (1234) in:
* touch(1,5)
* touch(2,5)
* touch(3,5)
* touch(1,6)

In a separate Ubuntu, we ran the following function:
* docker run --network starbucks --name starbucks-nodejs -p 8080:8080 -e "api_endpoint=http://starbucks-api:3000" -td paulnguyen/starbucks-nodejs:v1.0

We imported the following file to Insomnia:
* insomnia-project.json

By interacting with localhost:8080 and Ubuntu, we are able to place orders and pay for them. 
* First, we would click place order on localhost:8080
* Second, we would input the following three commands to confirm the payment into Ubuntu:
* touch(3,3) to switch to the payment screen
* touch(2,2)
* touch(3,2)

![13](172.6/172.6.13.png)
![14](172.6/172.6.14.6png)
![15](172.6/172.6.15.png)
![16](172.6/172.6.16.png)
![17](172.6/172.6.17.png)
![18](172.6/172.6.18.png)
![19](172.6/172.6.19.png)
![20](172.6/172.6.20.png)
![21](172.6/172.6.21.png)
![22](172.6/172.6.22.png)
![23](172.6/172.6.23.png)
![24](172.6/172.6.24.png)
![25](172.6/172.6.25.png)
