# 📚 Library Management API

A complete RESTful API to manage a collection of books, allowing all CRUD (Create, Read, Update, Delete) operations. This project was developed with **Java 17** and **Spring Boot**, following best practices for API development.

## ✨ Features

-   **Create Books:** Add new books to the collection.
-   **List Books:** Get the complete list of books or retrieve a specific book by its ID.
-   **Update Books:** Modify the information of an existing book.
-   **Delete Books:** Remove a book from the collection.

## 🛠️ Technologies Used

-   **Language:** Java 17
-   **Framework:** Spring Boot
-   **Data Access:** Spring Data JPA / Hibernate
-   **Database:** H2 Database (in-memory, for development)
-   **Build Tool:** Maven
-   **Utilities:** Lombok (Optional)

## ▶️ How to Run the Project

### Prerequisites

-   Java Development Kit (JDK) 17 or higher.
-   Apache Maven 3.8 or higher.

### Steps to Run

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/limajoaohs/api-library-java-spring.git](https://github.com/limajoaohs/api-library-java-spring.git)
    ```
2.  **Navigate to the project directory:**
    ```bash
    cd api-library-java-spring
    ```
3.  **Compile and run the application using Maven:**
    ```bash
    ./mvnw spring-boot:run
    ```
4.  The API will be available at `http://localhost:8080`.

## 📝 API Endpoints

| Method | Endpoint         | Description                          |
| ------ | ---------------- | ------------------------------------ |
| `POST` | `/livros`        | Creates a new book                   |
| `GET`  | `/livros`        | Lists all registered books           |
| `GET`  | `/livros/{id}`   | Retrieves a specific book by its ID  |
| `PUT`  | `/livros/{id}`   | Updates a book's data                |
| `DELETE`| `/livros/{id}`  | Deletes a book                       |
