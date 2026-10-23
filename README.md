# Student Management REST API

## Overview
A REST API built using Java and Spring Boot to manage student records. It demonstrates CRUD operations using HTTP methods.

## Technologies Used
- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | `/students` | Add a student |
| GET | `/students` | Retrieve all students |
| GET | `/students/{id}` | Retrieve a student by ID |
| PUT | `/students/{id}` | Update a student |
| DELETE | `/students/{id}` | Delete a student |

## How to Run

1. Clone or download this repository.
2. Open the project folder in VS Code.
3. Run `.\mvnw.cmd spring-boot:run` in the terminal.
4. Access the API at `http://localhost:8080/students`.

## Project Status
The basic CRUD endpoints are implemented. Database persistence and API testing can be extended as needed.# week3-springboot-rest-api
Student Management REST API using Java and Spring Boot
