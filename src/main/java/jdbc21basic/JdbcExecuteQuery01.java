package jdbc21basic;
import java.sql.*;
public class JdbcExecuteQuery01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/ORCLCDB.localdomain", "mrscenik","Hkc780081");
		Statement st = con.createStatement();
		String q1 ="SELECT * FROM my_companies";
		ResultSet r1 = st.executeQuery(q1);
		
		while(r1.next()) {
			System.out.println(r1.getInt(1)+"-"+r1.getString(2));		
		}
		con.close();	
		st.close();
		r1.close();
	}
}