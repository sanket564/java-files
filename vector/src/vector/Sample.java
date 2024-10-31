package vector;

import java.util.Vector;

public class Sample {

	public static void main(String[] args) {
	 Vector<Integer> v=new Vector<Integer>();
	 v.add(10);
	 v.add(20);
	 v.add(30);
	 v.add(40);
	 v.add(50);
	 System.out.println("*****b4*****"+v);
	 v.add(1,60);
	 System.out.println("*****a4*****"+v);

	 
	}

}
