package object;

public class Bike {
	Object [] arr;
	int size;
	Bike()
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
		Bike b1=new Bike();
		b1.add("Royal Enfield");
		b1.add(400000);
		b1.add("Black");
		System.out.println(b1);
	}
}

