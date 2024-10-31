package vector;

import java.util.Vector;

class Admin7 {
    String home_name;
    int home_cost;
    String home_color;

    Admin7(String home_name, int home_cost, String home_color) {
        this.home_name = home_name;
        this.home_cost = home_cost;
        this.home_color = home_color;
    }
}

public class Home {

    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add(new Admin7("Villa", 500000, "White"));
        v1.add(new Admin7("Cottage", 300000, "Blue"));
        v1.add(new Admin7("Mansion", 1200000, "Gray"));
        v1.add(new Admin7("Bungalow", 400000, "Yellow"));

        for (int i = 0; i < v1.size(); i++) {
            Object a1 = v1.get(i);
            Admin7 x1 = (Admin7) a1;
            System.out.println("Home Name: " + x1.home_name);
            System.out.println("Home Cost: " + x1.home_cost);
            System.out.println("Home Color: " + x1.home_color);
            System.out.println("-----------------------------------------");
        }
    }
}