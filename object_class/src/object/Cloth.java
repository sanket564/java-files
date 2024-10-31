package objectclass;

public class Cloth {
	int cost;
	char size;
	String colour;
		Cloth(int a,char b,String c)
		{
		cost=a;
		size=b;
		colour=c;
		}
		public boolean equals(Object obj)
{
			Cloth c2=(Cloth)obj;
			return this.cost==c2.cost;
			
}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cloth c1=new Cloth(5000,'x',"black");
		Cloth c2=new Cloth(500,'L',"black");
		System.out.println(c1.equals(c2));
	}

}
