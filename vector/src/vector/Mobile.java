package vector;

import java.util.Vector;
class Admin1
{
	int mob_cost;
	String mob_name;
	String mob_color;
	
	Admin1(int mob_cost,String mob_name,String mob_color)
	{
		this.mob_cost=mob_cost;
		this.mob_name=mob_name;
		this.mob_color=mob_color;
	}
}
public class Mobile {

	public static void main(String[] args) {
Vector v1=new Vector();
v1.add(new Admin1(50055,"hp","red"));
v1.add(new Admin1(5940,"moto","black"));
v1.add(new Admin1(5036,"ok","pink"));
v1.add(new Admin1(50840," lg","white"));

for(int i=0;i<v1.size();i++)
{
	Object a1=v1.get(i);
	Admin1 x1=(Admin1)a1;
	System.out.println(x1.mob_cost);
	System.out.println(x1.mob_name);
	System.out.println(x1.mob_color);
	System.out.println("-----------------------------------------");
	
}
	}
}


