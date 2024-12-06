# AdvanceJava

Basics of JDBC
Introduction
JDBC (Java Database Connectivity) is an API (Application Programming Interface) in Java that allows developers to connect and interact with databases. It provides methods to query, update, and manage relational databases using Java.

Key Steps to Use JDBC
1. Load the JDBC Driver
Load the JDBC driver class for the database you are using.

Example for MySQL:
Class.forName("com.mysql.cj.jdbc.Driver");

2. Establish a Connection
Use the DriverManager to create a connection to the database.


Connection connection = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/your_database_name", 
    "your_username", 
    "your_password"
);
Replace your_database_name, your_username, and your_password with actual values.

3. Create a Statement
Use the Connection object to create a Statement for executing SQL queries.

Statement statement = connection.createStatement();
4. Execute SQL Queries
Use the Statement object to execute queries and retrieve results.

For SELECT Queries:

ResultSet resultSet = statement.executeQuery("SELECT * FROM table_name");
while (resultSet.next()) {
    System.out.println("Column Data: " + resultSet.getString("column_name"));
}
For INSERT/UPDATE/DELETE Queries:

int rowsAffected = statement.executeUpdate("INSERT INTO table_name VALUES (value1, value2)");
System.out.println("Rows affected: " + rowsAffected);
5. Close the Resources
Always close the database resources to avoid memory leaks.

resultSet.close();   // Close ResultSet (if applicable)
statement.close();   // Close Statement
connection.close();  // Close Connection
Common JDBC Classes
DriverManager: Manages database drivers and establishes connections.
Connection: Represents a connection to the database.
Statement: Used to execute static SQL queries.
PreparedStatement: Used for precompiled SQL queries to prevent SQL injection.
ResultSet: Holds the data returned by SELECT queries.
Example Program
Here’s a simple example to fetch data from a database:

import java.sql.*;

public class JdbcExample {
    public static void main(String[] args) {
        try {
            // Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password"
            );

            // Create a statement
            Statement statement = connection.createStatement();

            // Execute a query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");

            // Process the results
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Name: " + resultSet.getString("name"));
            }

            // Close resources
            resultSet.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
JDBC Best Practices
Always close database resources (ResultSet, Statement, Connection).
Use PreparedStatement instead of Statement to prevent SQL injection.
Handle exceptions properly using try-catch blocks.
Use connection pooling for better performance in large applications.
References
JDBC Documentation
MySQL Connector/J


