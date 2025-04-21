package task12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcInsertEmployee {

    public static void main(String[] args) throws SQLException {
        // Database connection details
        String URL = "jdbc:mysql://localhost:3306/mycompany";  // DB name: mycompany
        String username = "root";  // Replace with your DB username
        String password = "root";  // Replace with your DB password

        // Establish connection to MySQL
        Connection conObj = DriverManager.getConnection(URL, username, password);
        
        // Create a Statement object to execute SQL queries
        Statement stmt = conObj.createStatement();
        
        // Delete all records from the employees table before inserting new ones
        String deleteSQL = "DELETE FROM employees";
        stmt.executeUpdate(deleteSQL);
        
        // Create the `employees` table if it doesn't exist (fixed column name)
        String createTableSQL = "CREATE TABLE IF NOT EXISTS employees ("
                + "empcode INT PRIMARY KEY, "
                + "empname VARCHAR(50), "
                + "empage INT, "  // Fixed column name (empage instead of emmpage)
                + "esalary DOUBLE)";
        
        // Execute the SQL statement to create the table
        stmt.executeUpdate(createTableSQL);
        
        // SQL query to insert employee records into the `employees` table
        String insertSQL = "INSERT INTO employees (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";
        
        // Create PreparedStatement to execute the insert
        PreparedStatement pstmt = conObj.prepareStatement(insertSQL);
        
        // Insert employee records into the database
        pstmt.setInt(1, 101);
        pstmt.setString(2, "JENNY");
        pstmt.setInt(3, 25);
        pstmt.setDouble(4, 10000);
        pstmt.executeUpdate();  // Execute insert for JENNY

        pstmt.setInt(1, 102);
        pstmt.setString(2, "JACKY");
        pstmt.setInt(3, 30);
        pstmt.setDouble(4, 20000);
        pstmt.executeUpdate();  // Execute insert for JACKY

        pstmt.setInt(1, 103);
        pstmt.setString(2, "JOE");
        pstmt.setInt(3, 20);
        pstmt.setDouble(4, 40000);
        pstmt.executeUpdate();  // Execute insert for JOE

        pstmt.setInt(1, 104);
        pstmt.setString(2, "JOHN");
        pstmt.setInt(3, 40);
        pstmt.setDouble(4, 80000);
        pstmt.executeUpdate();  // Execute insert for JOHN

        pstmt.setInt(1, 105);
        pstmt.setString(2, "SHAMEER");
        pstmt.setInt(3, 25);
        pstmt.setDouble(4, 90000);
        pstmt.executeUpdate();  // Execute insert for SHAMEER

        System.out.println("All employee records have been inserted into the `employees` table.");
        
        // Now, display the employee data from the `employees` table
        System.out.println("\nDisplaying employee data:");

        // SQL query to fetch all records from the employees table
        String selectSQL = "SELECT * FROM employees";

        // Execute the SELECT query and get the result set into console
        ResultSet rs = stmt.executeQuery(selectSQL);

        // Iterate through the result set and display the data in the console
        while (rs.next()) {
            int empcode = rs.getInt("empcode");
            String empname = rs.getString("empname");
            int empage = rs.getInt("empage");
            double esalary = rs.getDouble("esalary");

            // Print the employee details in the console
            System.out.println("EmpCode: " + empcode + ", EmpName: " + empname + ", Age: " + empage + ", Salary: " + esalary);
        }

        // Closing the resources
        rs.close();
        pstmt.close();
        stmt.close();
        conObj.close();
    }
}
