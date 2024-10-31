package objectclass;

public class Univ {

	int cost;
	String name;
	int grade;
		Univ(int cost,String name,int grade)
		{
		this.cost=cost;
		this.name=name;
		this.grade=grade;
		}
		public boolean equals(Object obj)
		{
			Univ u2=(Univ)obj;
			return this.cost==u2.cost;
		}
	public static void main(String[] args) {
		Univ u1=new Univ(7,"vvps",8);
		Univ u2=new Univ(7,"vvps",8);
System.out.println(u1.equals(u2));
		// TODO Auto-generated method stub

	}

}
