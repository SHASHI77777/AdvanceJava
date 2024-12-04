package first_jdbc_project;

import java.sql.*;

public class InsertApp {
    public static void main(String[] args) {
        // 2nd Way
       
            // step 1 -> Load And Register The Driver Class
            try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			
            System.out.println("Driver Class Loaded and Registered successfully");

            // step 2 -> Create The Connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava", "root","Shashi@23");
                   
              Statement s = con.createStatement();
              
              s.execute("insert into emp values(103,'James',3000,30)") ;   
              
              int row = s.getUpdateCount();
              
              System.out.println(row +" row is get affected ");
              
              s.close();
              con.close();              
             
            }
            
            catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
    }
}

