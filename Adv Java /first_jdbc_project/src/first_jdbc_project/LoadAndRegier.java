
package first_jdbc_project;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class LoadAndRegier {
    public static void main(String[] args) {
        try {
            Driver d = new Driver();
            DriverManager.registerDriver(d);

            System.out.println("Driver Class Loaded And Regstered Successfully...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
