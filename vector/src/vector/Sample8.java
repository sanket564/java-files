package vector;


import java.util.Vector;

public class Sample8{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Vector<Integer> v1 = new Vector<Integer>();
	        v1.add(10);
	        v1.add(20);
	        v1.add(30);
	        v1.add(40);
	        v1.add(50);
	        v1.add(50);
	        System.out.println("Before adding elements from v2: " + v1);
	        v1.remove(1);
	        Vector<Integer> v2 = new Vector<Integer>();

	        v2.add(70); // Adding integer values
	        v2.add(30);
	        v2.add(50);
	        System.out.println("After adding elements from v2: " + v1);
	      System.out.println(v1.retainAll(v2));
	      System.out.println(v1);
	}

}

