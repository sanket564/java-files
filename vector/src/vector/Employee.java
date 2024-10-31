package vector;

import java.util.Vector;

class Admin8 {
    int emp_id;
    double emp_sal;
    String emp_grade;

    Admin8(int emp_id, double emp_sal, String emp_grade) {
        this.emp_id = emp_id;
        this.emp_sal = emp_sal;
        this.emp_grade = emp_grade;
    }
}

public class Employee {

    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add(new Admin8(101, 75000, "A"));
        v1.add(new Admin8(102, 65000, "B"));
        v1.add(new Admin8(103, 80000, "A"));
        v1.add(new Admin8(104, 55000, "C"));

        for (int i = 0; i < v1.size(); i++) {
            Object a1 = v1.get(i);
            Admin8 x1 = (Admin8) a1;
            System.out.println("Employee ID: " + x1.emp_id);
            System.out.println("Employee Salary: " + x1.emp_sal);
            System.out.println("Employee Grade: " + x1.emp_grade);
            System.out.println("-----------------------------------------");
        }
    }
}
