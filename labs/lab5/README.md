# CMPE 172 - Lab #5 Notes

# Spring JDBC

# Spring MySQL

# SQL vs MongoDB

# Spring Gumball V3
In this lab, we copied Spring Gumball Version 2 over. We wanted to connect our Spring Gumball to MySQL. 

We edited the following files:
* application.properties
* gumball.html
* GumballModel.java
* GumballMachine.java
* UserRepository.java
* GumballMachineController.java

We did the following commands on Ubuntu:
* make docker-build
* docker network create --driver bridge gumball
* docker run-d --network gumball --name mysql -td -p 3306:3306 -e MYSQL_ROOT_PASSWORD-cmpe172 mysql:8.0

Afterwards, we would go into Docker Desktop and enter the mysql terminal and run the following commands:
* mysql -u root -p
* create database db_gb;

![Gumball V3](172.5/172.5.gb3.1.png)

The following functions were ran in the mysql terminal to observer the table:
* use db_gb;
* show tables;
* select * from gumball_model;

![MySQL Gumball](172.5/172.5.gb3.2.png)
