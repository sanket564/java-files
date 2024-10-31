package jdbc1.demo;
import java.sql.*;

public class Jdbc1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
        CallableStatement  p=c.prepareCall("create table details(id int primary key,name varchar(20),age int)");
        
        boolean e=p.execute();
        System.out.println(e);
        c.close();
        
	}

}
