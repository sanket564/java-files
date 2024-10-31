package object;

public class Home {
	Object [] arr;
	int size;
	Home()
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
		Home h1=new Home();
		h1.add("Amritha Nilaya");
		h1.add(3000000);
		h1.add("White");
		System.out.println(h1);
	}
}

 