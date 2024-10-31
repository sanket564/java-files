package jdbc1.demo;
import java.sql.*;

public class Jdbc3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc1","root","root");
        CallableStatement  p=c.prepareCall("create table employeedetails(eid int primary key,ename varchar(20),salary double ,phone bigint)");
        
        boolean e=p.execute();
        System.out.println(e);
        c.close();
        
	}

}
