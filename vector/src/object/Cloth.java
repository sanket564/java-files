package object;

public class Cloth {
	Object [] arr;
	int size;
	Cloth()
	{
		arr=new Object [10];
		size=0;
	}
	public void add(Object obj)
	{
		arr[size]=obj;
		size++;
	}
	public String toString()
	{
		StringBuilder s1=new StringBuilder();
		s1.append("[");
		for (int i=0;i<size;i++)
		{
			s1.append(arr[i] + " ");
		}
		s1.append("]");
		return s1.toString();
	}
	public static void main(String[] args) {
		Cloth c1=new Cloth();
		c1.add("White");
		c1.add(1000);
		c1.add("Xl");
		System.out.println(c1);
	}
}

