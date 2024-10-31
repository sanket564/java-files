package vector;

import java.util.Vector;

class Admin9 {
    String cloth_color;
    String cloth_size;
    int cloth_cost;

    Admin9(String cloth_color, String cloth_size, int cloth_cost) {
        this.cloth_color = cloth_color;
        this.cloth_size = cloth_size;
        this.cloth_cost = cloth_cost;
    }
}

public class Cloth {

    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add(new Admin9("Red", "M", 500));
        v1.add(new Admin9("Blue", "L", 700));
        v1.add(new Admin9("Green", "S", 600));
        v1.add(new Admin9("Black", "XL", 800));

        for (int i = 0; i < v1.size(); i++) {
            Object a1 = v1.get(i);
            Admin9 x1 = (Admin9) a1;
            System.out.println("Cloth Color: " + x1.cloth_color);
            System.out.println("Cloth Size: " + x1.cloth_size);
            System.out.println("Cloth Cost: " + x1.cloth_cost);
            System.out.println("-----------------------------------------");
        }
    }
}