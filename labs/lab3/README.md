# CMPE 172 - Lab #3 Notes
In this lab, we will be building a Spring Gumball App and exploring deployment on Docker and Google Cloud with Load Balancers. We will be looking at the Session State and the Session Affinity. 

# Table of Contents
[Spring Gumball on Docker](#spring-gumball-on-docker)
[Spring Gumball on Google Cloud](#spring-gumball-on-google-cloud)

# Spring Gumball on Docker
We generated a Spring Boot Project using https://start.spring.io/ using the following parameters.
* Project: Gradle Project
* Language: Java Language (JDK 11)
* Spring Boot Version: 2.4.2
* Group: com.example
* Artifact: spring-gumball
* Name: spring-gumball
* Package Name: come.example.spring-gumball
* Packaging: Jar
* Dependencies: Spring Web, Thymeleaf, Spring Boot DevTools, Testcontainers, Lombok, Validation

We added the following files:
* GumballModel.java
* GumballCommand.java
* GumballMachineController.java
* gumball.html
* docker-compose.yaml

The following commands were ran in Ubuntu:
* make docker-build
* make compose-up

![Docker](172.3.docker)

When the page was reloaded, the server host/ip on the bottom right would alternate.. The IP value comes from localhost ip address. When I add a quarter and purchase, an error message would appear. To avoid this error, I would have to enable cookies. 

![Docker2](172.3.1)

# Spring Gumball on Google Cloud

In Google Cloud, we created a cluster and connected it with the terminal. We added the following files to the editor:
* pod.yaml
* jumpbox.yaml
* service.yaml
* ingress.yaml
* deployment.yaml

We ran the following commands in the terminal:
* kubectl create -f deployment.yaml --save-config
* kubectl create -f service.yaml

# Deployment
![Deployment](172.3.d1)
![Deployment2](172.3.d2)

# Ingress
![Ingress](172.3.i1)

# Service
![Service](172.3.s1)
![Service2](172.3.s2)

# Jumpbox
We ran the following functions into the terminal:
* kubectk create -f jumpbox.yaml
* kubectl exec -it jumpbox -- /bin/bash
* apt-get update
* apt-get install curl
* apt-get install iputils-ping

![Jumpbox](172.3.j)

When the page was reloaded, the service host/ip address would change. The IP value comes from Kubernetes. When I tried to add quarters, an error message would appear. This could be solved by using the feature Session Affinity under Load Balancer. You would need to set it to ClientIP. 
