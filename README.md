# Student Management API

A RESTful API for managing student records, built with Spring Boot.

## Tech Stack

- Java 17
- Spring Boot 3.3.5
- Spring Data JPA
- MySQL
- Lombok
- Bean Validation

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/students` | Create a new student |
| GET | `/api/students` | Get all students |
| GET | `/api/students/{id}` | Get student by ID |
| PUT | `/api/students/{id}` | Update a student |
| DELETE | `/api/students/{id}` | Delete a student |

## Setup

1. Clone the repo
   ```bash
   git clone https://github.com/Amartyakaushik/student-management-api.git
   cd student-management-api
   ```

2. Create a MySQL database
   ```sql
   CREATE DATABASE student_management;
   ```

3. Copy the example properties file and update with your credentials
   ```bash
   cp src/main/resources/application.properties.example src/main/resources/application.properties
   ```

4. Run the application
   ```bash
   ./mvnw spring-boot:run
   ```

The API will be available at `http://localhost:9090`

## Project Structure

```
src/main/java/com/example/student_management_api/
├── controller/       # REST controllers
├── dto/              # Request & Response DTOs
├── entity/           # JPA entities
├── exception/        # Global exception handling
├── repository/       # Spring Data repositories
├── service/          # Business logic
└── StudentManagementApiApplication.java
```
