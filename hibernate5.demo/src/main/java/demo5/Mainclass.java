package demo5;

import java.io.FileInputStream;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Mainclass {
	private void psvm() {
		// TODO Auto-generated method stub
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("tuesday");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();

Employee employee=new Employee();
//employee.seteId(0);
employee.seteAge(28);
employee.setEname("vishal");
employee.seteSalary(7565.25);
FileInputStream fileInputStream=new FileInputStream(path);
byte[] arr=new byte[fileInputStream.available()];


	}

}
