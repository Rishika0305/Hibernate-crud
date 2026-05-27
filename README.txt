Hibernate CRUD Operations Using Java and MySQL

Project Description:
This project is a console-based Hibernate CRUD application developed using Java, Hibernate ORM, MySQL, and Maven. The project demonstrates how Hibernate performs Create, Read, Update, and Delete (CRUD) operations using ORM (Object Relational Mapping).

Technologies Used:
- Java
- Hibernate ORM
- MySQL
- Maven
- Eclipse IDE
- XAMPP

Project Features:
- Insert Employee
- Display Employee by ID
- Update Employee Details
- Delete Employee
- Display All Employees
- Hibernate Configuration using XML
- Database connectivity with MySQL

Project Structure:
- Employee.java
- EmpSave1.java
- Emp.hbm.xml
- hibernate.cfg.xml
- pom.xml

Database:
- MySQL Database using XAMPP

Database Name:
employee-db

Table Name:
emp

Sample Table Structure:

CREATE TABLE emp (
    eid INT PRIMARY KEY,
    ename VARCHAR(100),
    esal DOUBLE,
    desig VARCHAR(100)
);

Software Requirements:
- Java JDK
- Eclipse IDE
- Apache Maven
- XAMPP Server
- MySQL JDBC Connector

How to Run the Project:
1. Install Java JDK
2. Install Eclipse IDE
3. Install XAMPP
4. Start Apache and MySQL from XAMPP Control Panel
5. Create database 'employee-db' in phpMyAdmin
6. Import project into Eclipse
7. Update Hibernate configuration if required
8. Run EmpSave1.java as Java Application

Hibernate Configuration:
hibernate.cfg.xml contains:
- MySQL connection details
- Hibernate dialect
- Mapping resource
- hbm2ddl.auto property

Important Notes:
- MySQL service must be running
- Database credentials must match Hibernate configuration
- Maven dependencies must be downloaded properly
- Hibernate mapping file should be configured correctly

Project Operations:
1. Insert Employee
2. Display Employee by ID
3. Delete Employee
4. Update Employee
5. Display All Employees
6. Exit
