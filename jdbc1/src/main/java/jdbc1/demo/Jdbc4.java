package jdbc1.demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc4 {

	public static void main(String[] args) throws Exception {
		
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/monday","root","root");
		        CallableStatement  p=c.prepareCall("insert into employee values(3,'joker',8827744779)");
		        CallableStatement  p1=c.prepareCall("update employee set ename='manish' where eid=3");
		        CallableStatement  p2=c.prepareCall("delete from employee where eid=2");
		        int e=p2.executeUpdate();
		        System.out.println(e);
		        c.close();

	}

}
