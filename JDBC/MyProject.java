

import java.sql.Connection;
import java.sql.DriverManager;

public class MyProject {
	
	public static final String url="jdbc:mysql://localhost:3306/test";
	public static final String uName="root";
	public static final String pwd="Shree@04";
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uName,pwd);
		System.out.println("connection established");
	}

}
