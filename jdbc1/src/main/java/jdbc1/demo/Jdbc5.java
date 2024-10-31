//insert the values dynamically
package jdbc1.demo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Jdbc5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/monday","root","root");
        CallableStatement  p=c.prepareCall("insert into employee values(?,?,?)");
        Scanner sc=new Scanner(System.in);
        p.setInt(1,sc.nextInt());
        p.setString(2,sc.next());
        p.setLong(3,sc.nextLong());
        int e=p.executeUpdate();
        System.out.println(e);
        c.close();
	}

}
