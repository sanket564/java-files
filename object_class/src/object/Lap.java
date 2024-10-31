package objectclass;

public class Lap {
	int cost;
	String name;
	String colour;
		Lap(int a,String b,String c)
		{
		cost=a;
		name=b;
		colour=c;
		}
		public boolean equals(Object obj)
		{
			Lap l2=(Lap)obj;
			return this.cost==l2.cost;
		}

	public static void main(String[] args) {
		Lap l1=new Lap(7,"xyz","black");
		Lap l2=new Lap(7,"xyz","black");
System.out.println(l1.equals(l2));
		// TODO Auto-generated method stub

	}

}
