package objectclass;

public class Mobile {

	
		int cost;
		String name;
		String colour;
			Mobile(int a,String b,String c)
			{
			cost=a;
			name=b;
			colour=c;
			}
			public boolean equals(Object obj)
			{
				Mobile m2=(Mobile)obj;
				return this.cost==m2.cost;
				
			}
			public static void main(String[] args) {
				Mobile m1=new Mobile(7000,"mi","blue");
				Mobile m2=new Mobile(70000,"mi","blue");
				System.out.println(m1.equals(m2));
		// TODO Auto-generated method stub

	}

}
