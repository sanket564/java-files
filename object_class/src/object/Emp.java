package objectclass;

public class Emp {
	int id;
	int sal;
	char grade;
		Emp(int a,int b,char c)
		{
		id=a;
		sal=b;
		grade=c;
		}
		public boolean equals(Object obj)
		{
			Emp e2=(Emp)obj;
			return this.grade==e2.grade;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Emp e1=new Emp(7,70,'a');
	Emp e2=new Emp(7,70,'a');
	System.out.println(e1.equals(e2));

	}

}
