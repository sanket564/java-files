package vector;

import java.util.Vector;

class Admin6 {
    String laptop_name;
    int laptop_cost;
    String laptop_brand;

    Admin6(String laptop_name, int laptop_cost, String laptop_brand) {
        this.laptop_name = laptop_name;
        this.laptop_cost = laptop_cost;
        this.laptop_brand = laptop_brand;
    }
}

public class Laptop {

    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add(new Admin6("MacBook Air", 999, "Apple"));
        v1.add(new Admin6("ThinkPad X1", 1200, "Lenovo"));
        v1.add(new Admin6("XPS 13", 1100, "Dell"));
        v1.add(new Admin6("Spectre x360", 1300, "HP"));

        for (int i = 0; i < v1.size(); i++) {
            Object a1 = v1.get(i);
            Admin6 x1 = (Admin6) a1;
            System.out.println("Laptop Name: " + x1.laptop_name);
            System.out.println("Laptop Cost: " + x1.laptop_cost);
            System.out.println("Laptop Brand: " + x1.laptop_brand);
            System.out.println("-----------------------------------------");
        }
    }
}
