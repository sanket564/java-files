import java.sql.*;
package mock3;

public class Mock3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
        CallableStatement  p=c.prepareCall("create table Employee(empid int primary key,empname varchar(20),emphone bigint,empage int");
        boolean e=p.execute();
        System.out.println(e);
        c.close();

}
}
