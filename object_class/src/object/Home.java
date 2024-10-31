package objectclass;

public class Home {
	int cost;
	String name;
	String colour;
		Home(int a,String b,String c)
		{
		cost=a;
		name=b;
		colour=c;
		}
		public boolean equals(Object obj)
{
	Home h2=(Home)obj;
	return this.cost==h2.cost;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Home h1=new Home(78,"xyz","white");
Home h2=new Home(78,"xyz","white");
System.out.println(h1.equals(h2));

	}

}
