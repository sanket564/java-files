package demo5;
import java.sql.Date;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Employee {
@Id
@GeneratedValue
private int eId;
@Column(nullable=false)
private String ename;
@Column(unique=true)
private double eSalary;
@CreationTimestamp
private Date objectCreationTimeStamp;
@Lob
private byte[] image;
private int eAge;
@UpdateTimestamp
private Date objectupdatedtime;
public int geteId() {
	return eId;
}
public void seteId(int eId) {
	this.eId = eId;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double geteSalary() {
	return eSalary;
}
public void seteSalary(double eSalary) {
	this.eSalary = eSalary;
}
public Date getObjectCreationTimeStamp() {
	return objectCreationTimeStamp;
}
public void setObjectCreationTimeStamp(Date objectCreationTimeStamp) {
	this.objectCreationTimeStamp = objectCreationTimeStamp;
}
public byte[] getImage() {
	return image;
}
public void setImage(byte[] image) {
	this.image = image;
}
public int geteAge() {
	return eAge;
}
public void seteAge(int eAge) {
	this.eAge = eAge;
}
public Date getObjectupdatedtime() {
	return objectupdatedtime;
}
public void setObjectupdatedtime(Date objectupdatedtime) {
	this.objectupdatedtime = objectupdatedtime;
}

}
