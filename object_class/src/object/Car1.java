package object;

public class Car1 {
	int cost;
	String name;
	String type;
		Car1(int a,String b,String c)
		{
		cost=a;
		name=b;
		type=c;
		};
		public boolean equals(Object obj)
		{
			Car1 c2=(Car1)obj;
			return this.cost==c2.cost;
			
		}

	public static void main(String[] args) {

		Car1 c1=new Car1(79,"san","petrol");
		Car1 c2=new Car1(79,"san","petrol");
		System.out.println(c1.equals(c2));
		// TODO Auto-generated method stub

	}

}
