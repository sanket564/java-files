package vector;

import java.util.Vector;
class Admin3 {
    int tv_cost;
    String tv_brand;
    String tv_type;

    Admin3(int tv_cost, String tv_brand, String tv_type) {
        this.tv_cost = tv_cost;
        this.tv_brand = tv_brand;
        this.tv_type = tv_type;
    }
}

public class TV {

    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add(new Admin3(1500, "Samsung", "LED"));
        v1.add(new Admin3(1200, "Sony", "OLED"));
        v1.add(new Admin3(1000, "LG", "LCD"));
        v1.add(new Admin3(2000, "Panasonic", "QLED"));

        for (int i = 0; i < v1.size(); i++) {
            Object a1 = v1.get(i);
            Admin3 x1 = (Admin3) a1;
            System.out.println("TV Cost: " + x1.tv_cost);
            System.out.println("TV Brand: " + x1.tv_brand);
            System.out.println("TV Type: " + x1.tv_type);
            System.out.println("-----------------------------------------");
        }
    }
}

