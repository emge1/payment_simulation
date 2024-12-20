# Overview

This project is a simulation payment microservice, working with Allegro Clone ([backend](https://github.com/emge1/allegro-clone-api), 
[frontend](https://github.com/emge1/allegro-clone-frontend)).

# Table of contents

* [Prerequisites](#prerequisites)
* [Dependencies](#dependencies)
* [Project Setup](#project-setup)
---

## Prerequisites
- Java 21
- Maven
- MySQL

## Dependencies

The project includes the following dependencies:
- **Spring Boot Starter Web**
- **Spring Boot Starter Data JPA**
- **Spring Boot Starter AMQP**
- **MySQL Connector**
- **Lombok**
- **Spring Boot Starter Test**


## Project Setup

Clone the Repository
```bash
git clone https://github.com/emge1/payment_simulation
cd payment-service
```

Configure Database

Run RabbitMQ

Build the Project
```bash
mvn clean install
```

Run the Application
```bash
mvn spring-boot:run
```

