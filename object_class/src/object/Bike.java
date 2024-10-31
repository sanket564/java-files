package object;

public class Bike {
	String model;
	int rate;
	int cost;
		Bike(String a,int b,int c)
			{
	model=a;
	rate=b;
	cost=c;
	}
		public boolean equals(Object obj)
		{
			Bike b2=(Bike)obj;
			return this.cost==b2.cost;
		}


	public static void main(String[] args) {
		Bike b1=new Bike("abc",7,8);
		Bike b2=new Bike("abc",7,8);
		System.out.println(b1.equals(b2)); 
		// TODO Auto-generated method stub

	}

}
