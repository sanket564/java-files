package vector;

import java.util.Vector;

public class Sample5{

    public static void main(String[] args) {
        // Create a Vector of Integer type
        Vector v1 = new Vector();
        v1.add(10);
        v1.add(20);
        v1.add(30);
        v1.add(40);
        v1.add(50);
        System.out.println("Before adding elements from v2: " + v1);
        v1.remove(2);
        System.out.println("After adding elements from v2: " + v1);


    }
}
