package vector;

import java.util.Vector;
class Admin
{
	String sc_name;
	int sc_strength;
	char sc_grade;
	
	Admin(String sc_name,int sc_strength,char sc_grade)
	{
		this.sc_name=sc_name;
		this.sc_strength=sc_strength;
		this.sc_grade=sc_grade;
	}
}
public class School {

	public static void main(String[] args) {
Vector v1=new Vector();
v1.add(new Admin("st_ans",500,'A'));
v1.add(new Admin("st_hs",590,'B'));
v1.add(new Admin("st_toh",50,'c'));
v1.add(new Admin("st_a",5080,'A'));

for(int i=0;i<v1.size();i++)
{
	Object a1=v1.get(i);
	Admin x1=(Admin)a1;
	System.out.println(x1.sc_grade);
	System.out.println(x1.sc_name);
	System.out.println(x1.sc_strength);
	System.out.println("-----------------------------------------");
	
}
	}
}


