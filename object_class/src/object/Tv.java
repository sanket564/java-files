package objectclass;

public class Tv {
	int cost;
	String brand;
	String type;
		Tv(int a,String b,String c)
		{
		cost=a;
		brand=b;
		type=c;
		}
		public boolean equals(Object obj)
		{
			Tv t2=(Tv) obj;
			return this.cost==t2.cost;
		}

	public static void main(String[] args) {
		Tv t1=new Tv(7,"jf","oled");
		Tv t2=new Tv(7,"jf","oled");
System.out.println(t1.equals(t2));
		// TODO Auto-generated method stub

	}

}
