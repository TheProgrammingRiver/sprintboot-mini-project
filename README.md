# Springboot REST API Mini Project

## Project Description

This project is a RESTful API built with Spring Boot, focusing on backend functionalities for managing a bookstore. It provides a variety of endpoints for CRUD operations on `User`, `Genre`, and `Book` entities. The project also incorporates Spring Security for JWT-based authentication.

## Tools and Technologies

- Java 11
- Spring Boot
- Spring Data JPA
- Spring Security
- H2 Database
- Maven
- JWT for token-based authentication

## Approach

The project was initiated with a focus on building a robust and scalable backend API. We followed the MVC pattern to segregate the layers of the application. We started by defining the data models and their relationships, followed by repositories to interact with the H2 database. Services were implemented to encapsulate the business logic, and controllers were designed to handle incoming HTTP requests and responses.

Spring Security was implemented for authentication and authorization, with JWT tokens used for maintaining session information.

## Challenges and Hurdles

One of the major challenges was setting up Spring Security to work seamlessly with JWT tokens. Customizing the security configurations to allow only authenticated access to specific routes required careful planning and testing.

Another hurdle was handling relational data with Spring Data JPA effectively, ensuring that the relationships between `User`, `Genre`, and `Book` were correctly mapped.


[Link to GitHub Project](https://github.com/TheProgrammingRiver/sprintboot-mini-project)
