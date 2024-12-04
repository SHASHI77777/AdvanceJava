package filpkart;

import java.sql.*;

public class ProductDetails {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava", "root", "Shashi@23");

			Statement st = con.createStatement();

			st.execute(
					"insert into flipkart values(3,'Shoe',30000,'brand is Jordan ' ),(4,'Mobile',13000,'brand is Oneplus' ),(5,'Laptop',73000,'brand is Apple' )");

			int row = st.getUpdateCount();

			System.out.println(row + " row is get affected ");

			st.close();
			con.close();

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
	}
}
