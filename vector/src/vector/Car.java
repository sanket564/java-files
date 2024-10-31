package vector;

import java.util.Vector;
class Admin2 {
    int car_cost;
    String car_modelname;
    String car_type;

    Admin2(int car_cost, String car_modelname, String car_type) {
        this.car_cost = car_cost;
        this.car_modelname = car_modelname;
        this.car_type = car_type;
    }
}

public class Car {

    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add(new Admin2(25000, "Toyota", "SUV"));
        v1.add(new Admin2(18000, "Honda", "Sedan"));
        v1.add(new Admin2(35000, "BMW", "Coupe"));
        v1.add(new Admin2(50000, "Mercedes", "Convertible"));

        for (int i = 0; i < v1.size(); i++) {
            Object a1 = v1.get(i);
            Admin2 x1 = (Admin2) a1;
            System.out.println("Car Cost: " + x1.car_cost);
            System.out.println("Car Model Name: " + x1.car_modelname);
            System.out.println("Car Type: " + x1.car_type);
            System.out.println("-----------------------------------------");
        }
    }
}

