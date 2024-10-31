package vector;

import java.util.Vector;

public class Sample3 {

    public static void main(String[] args) {
        // Create a Vector of Integer type
        Vector<Integer> v1 = new Vector<Integer>();
        v1.add(10);
        v1.add(20);
        v1.add(30);
        v1.add(40);
        v1.add(50);
        System.out.println("Before adding elements from v2: " + v1);

        // Create another Vector of Integer type
        Vector<Integer> v2 = new Vector<Integer>();
        v2.add(60); // Adding integer values
        v2.add(70);
        v2.add(80);
        System.out.println("v2 elements: " + v2);

        // Insert all elements of v2 into v1 at index 3
        v1.addAll(3, v2);  // This will insert v2 elements starting at index 3 in v1
        System.out.println("After adding elements from v2 at index 3: " + v1);
    }
}
