package jdbc.demo;
import java.sql.*;
public class jdbc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mock","root","root");
        CallableStatement  p=c.prepareCall("create table Employee2(empid int primary key,empname varchar(20),emphone bigint,empage int)");
        boolean e=p.execute();
        System.out.println(e);
        c.close();
	}

}


