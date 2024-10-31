package object;

public class School {
	Object [] arr;
	int size;
	School()
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
		School s1=new School();
		s1.add("SVK");
		s1.add(56);
		s1.add('A');
		System.out.println(s1);
	}
}

