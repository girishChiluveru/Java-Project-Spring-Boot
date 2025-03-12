# Product Management System

A simple Spring Boot application for managing products with basic CRUD operations. This project demonstrates the use of Spring Boot, JPA, Thymeleaf, and H2 Database.

## Features

- View list of all products
- Add new products
- Edit existing products
- Delete products
- H2 in-memory database with web console
- Bootstrap-styled responsive UI

## Prerequisites

- Java 20 or higher
- Maven 3.9.9 or higher
- Any modern web browser

## Project Structure

```
src/main/java/com/example/demo/
├── controller/
│   └── ProductController.java    # Handles web requests
├── model/
│   └── Product.java             # Product entity class
├── repository/
│   └── ProductRepository.java   # Database operations interface
├── service/
│   └── ProductService.java      # Business logic layer
└── DemoApplication.java         # Main application class
```

## Setup and Running

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd Java-Project-Spring-Boot
   ```

2. **Build the project**
   ```bash
   mvn clean install -DskipTests
   ```

3. **Run the application**
   ```bash
   mvn spring-boot:run
   ```

4. **Access the application**
   - Main application: http://localhost:8080/products
   - H2 Database console: http://localhost:8080/h2-console

## Database Configuration

H2 Console credentials:
```
JDBC URL: jdbc:h2:mem:productdb
Username: admin
Password: Girish@09112005
```

## Sample SQL Commands

```sql
-- View all products
SELECT * FROM PRODUCT;

-- Add sample product
INSERT INTO PRODUCT (name, description, price, quantity) 
VALUES ('Laptop', 'High-performance laptop', 999.99, 10);

-- Update product
UPDATE PRODUCT SET price = 899.99 WHERE name = 'Laptop';

-- Delete product
DELETE FROM PRODUCT WHERE name = 'Laptop';
```

## Technologies Used

- Spring Boot 3.2.3
- Spring Data JPA
- Thymeleaf
- H2 Database
- Bootstrap 5
- Maven
- Java 20

## Project Components

1. **Model Layer**
   - `Product.java`: Defines product attributes and database mapping

2. **Repository Layer**
   - `ProductRepository.java`: Handles database operations using Spring Data JPA

3. **Service Layer**
   - `ProductService.java`: Contains business logic and transaction management

4. **Controller Layer**
   - `ProductController.java`: Handles HTTP requests and view management

5. **View Layer**
   - Thymeleaf templates for dynamic HTML generation
   - Bootstrap for responsive styling

## Note

This is a development/practice project using an in-memory H2 database. Data will be reset when the application is restarted. For production use, consider using a persistent database like MySQL or PostgreSQL.

---
*This project was created as a practice exercise with the assistance of AI to demonstrate Spring Boot fundamentals and web application development.* 