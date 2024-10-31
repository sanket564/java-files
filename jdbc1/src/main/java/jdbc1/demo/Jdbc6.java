package jdbc1.demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Jdbc6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/monday","root","root");
        CallableStatement  p=c.prepareCall("update employee set ename=? where eid=?");
        Scanner sc=new Scanner(System.in);
        p.setString(1,sc.next());
        p.setInt(2,sc.nextInt());
        int e=p.executeUpdate();
        System.out.println(e);
        c.close();
	}

}
