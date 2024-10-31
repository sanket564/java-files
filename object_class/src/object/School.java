package objectclass;

public class School {
	int strength;
	String name;
	String grade;
		School(int a,String b,String c)
		{
		strength=a;
		name=b;
		grade=c;
		}
		public boolean equals(Object obj)
		{
			School s2=(School)obj;
			return this.strength==s2.strength;
		}

	public static void main(String[] args) {
		School s1=new School(70,"vvps","a");
		School s2=new School(70,"vvps","a");
		System.out.println(s1.equals(s2));

		// TODO Auto-generated method stub

	}

}
