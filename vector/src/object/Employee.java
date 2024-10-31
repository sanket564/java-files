package object;

public class Employee {
	Object [] arr;
	int size;
	Employee()
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
		Employee e1=new Employee();
		e1.add("Suresh");
		e1.add(101);
		e1.add(50000);
		System.out.println(e1);
	}
}

