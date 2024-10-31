package objectclass;

public class Car {
	int cost;
	String name;
	String type;
		Car(int a,String b,String c)
		{
		cost=a;
		name=b;
		type=c;
		};
		public boolean equals(Object obj)
		{
			Car c2=(Car)obj;
			return this.cost==c2.cost;
			
		}

	public static void main(String[] args) {

		Car c1=new Car(79,"san","petrol");
		Car c2=new Car(79,"san","petrol");
		System.out.println(c1.equals(c2));
		// TODO Auto-generated method stub

	}

}
