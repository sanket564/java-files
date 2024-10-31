package vector;


import java.util.Vector;

public class Sample6 {

	public static void main(String[] args) {  Vector<Integer> v1 = new Vector<Integer>();
    v1.add(10);
    v1.add(20);
    v1.add(30);
    v1.add(40);
    v1.add(50);
    System.out.println("Before adding elements from v2: " + v1);
    v1.remove(1);
   System.out.println( v1.size());
    System.out.println("After adding elements from v2: " + v1);
    System.out.println( v1.size());
   System.out.println( v1.contains(30));
v1.get(0);
System.out.println(v1.get(0));

		// TODO Auto-generated method stub

	}

}
