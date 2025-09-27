# Student Management System

A Spring Boot–based **Student Management System** for managing student records such as adding, updating, deleting, and viewing details.  
This project follows the standard layered architecture of Spring Boot (Controller, Service, Repository).

---

## 🚀 Features
- Add new student records
- Update existing student details
- Delete student records
- View all students
- Search students by ID/name
- RESTful API endpoints

---

## 🛠️ Tech Stack
- **Java 17+**  
- **Spring Boot**  
- **Spring Data JPA**  
- **Hibernate**  
- **Maven**  
- **MySQL** (or H2 for testing)

---

## ⚙️ Setup & Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/Student_Management_System.git
   cd Student_Management_System
   ```

2. **Configure Database**
   - Open `application.properties` (or `application.yml`)
   - Set your database credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/student_db
     spring.datasource.username=root
     spring.datasource.password=yourpassword
     spring.jpa.hibernate.ddl-auto=update
     ```

3. **Build the project**
   ```bash
   ./mvnw clean install
   ```

4. **Run the application**
   ```bash
   ./mvnw spring-boot:run
   ```

---

## 📌 API Endpoints (Sample)

| Method | Endpoint             | Description            |
|--------|----------------------|------------------------|
| GET    | `/students`          | Get all students       |
| GET    | `/students/{id}`     | Get student by ID      |
| POST   | `/students`          | Add new student        |
| PUT    | `/students/{id}`     | Update student details |
| DELETE | `/students/{id}`     | Delete student         |

---

## 📂 Project Structure
```
Student_Management_System/
 ├── Student_Management_System/
 │   ├── pom.xml              # Maven configuration
 │   ├── src/main/java/...    # Java source code
 │   ├── src/main/resources/  # Config & templates
 │   ├── mvnw, mvnw.cmd       # Maven wrapper
 │   └── HELP.md              # Spring Boot guide
 └── .idea/                   # IntelliJ project files
```

---

## 🧪 Running Tests
```bash
./mvnw test
```

---

## 🤝 Contributing
1. Fork the project  
2. Create a feature branch (`git checkout -b feature-name`)  
3. Commit changes (`git commit -m "Added new feature"`)  
4. Push to branch (`git push origin feature-name`)  
5. Open a Pull Request  

---

## 📜 License
This project is licensed under the **MIT License**.  
You are free to use, modify, and distribute this project.

---

## 👨‍💻 Author
Usha U – [GitHub](https://github.com/USHAU1234)
