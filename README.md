# Financial Advisor Portfolio Management System

## 📋 Project Overview
A Spring Boot application for managing financial advisors, their clients, portfolios, and securities.

## 🎯 Features
- Manage multiple financial advisors
- Track clients for each advisor
- Manage client portfolios
- Track securities (stocks, bonds, etc.) in portfolios

## 🗃️ Data Model

### Entities

#### 1. FinancialAdvisor
- **id** (Primary Key, auto-generated)
- **firstName**, **lastName**
- **email** (unique)
- **phone**
- **licenseNumber** (unique)
- **createdAt** (timestamp)

#### 2. Client
- **id** (Primary Key, auto-generated)
- **advisor_id** (Foreign Key → FinancialAdvisor)
- **firstName**, **lastName**
- **email** (unique)
- **phone**
- **dateOfBirth**
- **createdAt**, **updatedAt** (timestamps)

#### 3. Portfolio
- **id** (Primary Key, auto-generated)
- **client_id** (Foreign Key → Client, UNIQUE)
- **name**
- **createdAt**, **updatedAt** (timestamps)

#### 4. Security
- **id** (Primary Key, auto-generated)
- **portfolio_id** (Foreign Key → Portfolio)
- **name**
- **category**
- **purchaseDate**
- **purchasePrice**
- **quantity**
- **createdAt**, **updatedAt** (timestamps)

### Relationships
- **FinancialAdvisor** (1) ↔ (Many) **Client**
- **Client** (1) ↔ (1) **Portfolio**
- **Portfolio** (1) ↔ (Many) **Security**

## 🛠️ Technologies Used
- Java 17
- Spring Boot 3.2.x
- Spring Data JPA
- H2 Database (in-memory)
- Lombok
- Maven

## ▶️ How to Run

### Prerequisites
- Java 17 or higher
- Maven (included via wrapper)

### Steps
1. Clone the repository:
```bash
   git clone https://github.com/KrishnaBegur/financial-advisor-system.git
   cd financial-advisor-system
```

2. Run the application:
```bash
   ./mvnw spring-boot:run
```
(Windows: `mvnw.cmd spring-boot:run`)

3. Access H2 Console:
    - URL: http://localhost:8081/h2-console
    - JDBC URL: `jdbc:h2:mem:testdb`
    - Username: `sa`
    - Password: (leave empty)

## ✅ Requirements Satisfied

All requirements from the assignment have been met:

- [x] Each entity annotated with `@Entity`
- [x] Each id is auto-generated using `@GeneratedValue(strategy = GenerationType.IDENTITY)`
- [x] All instance variables have `@Column` or relationship annotations
- [x] All classes have required constructors (via `@AllArgsConstructor` and custom constructors)
- [x] All getters and setters exposed (via Lombok's `@Data`)

## 📁 Project Structure
```
financial-advisor/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/financialadvisor/
│   │   │       ├── FinancialAdvisorApplication.java
│   │   │       ├── entity/
│   │   │       │   ├── Client.java
│   │   │       │   ├── FinancialAdvisor.java
│   │   │       │   ├── Portfolio.java
│   │   │       │   └── Security.java
│   │   │       ├── repository/
│   │   │       ├── service/
│   │   │       ├── controller/
│   │   │       └── dto/
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
└── README.md
```

## 👤 Author
[ShriKrishna Begur]

## 📅 Date
16-January-2025