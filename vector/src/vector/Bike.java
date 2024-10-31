package vector;

import java.util.Vector;

class Admin4 {
    int bike_cost;
    String bike_brand;
    String bike_color;

    Admin4(int bike_cost, String bike_brand, String bike_color) {
        this.bike_cost = bike_cost;
        this.bike_brand = bike_brand;
        this.bike_color = bike_color;
    }
}

public class Bike {

    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add(new Admin4(12000, "Yamaha", "Blue"));
        v1.add(new Admin4(15000, "Honda", "Red"));
        v1.add(new Admin4(10000, "Suzuki", "Black"));
        v1.add(new Admin4(18000, "Kawasaki", "Green"));

        for (int i = 0; i < v1.size(); i++) {
            Object a1 = v1.get(i);
            Admin4 x1 = (Admin4) a1;
            System.out.println("Bike Cost: " + x1.bike_cost);
            System.out.println("Bike Brand: " + x1.bike_brand);
            System.out.println("Bike Color: " + x1.bike_color);
            System.out.println("-----------------------------------------");
        }
    }
}