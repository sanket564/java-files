package hibernate4.demo;
import javax.persistence.*;

@Entity
public class Hero {

	long phNO;
	String name;
	@Id
	int Age;
	public long getPhNO() {
		return phNO;
	}
	public void setPhNO(long phNO) {
		this.phNO = phNO;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
}
