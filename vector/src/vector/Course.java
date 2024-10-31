package vector;

import java.util.Vector;

class Admin5 {
    String course_name;
    String univr_name;
    int exam_cost;

    Admin5(String course_name, String univr_name, int exam_cost) {
        this.course_name = course_name;
        this.univr_name = univr_name;
        this.exam_cost = exam_cost;
    }
}

public class Course {

    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add(new Admin5("Computer Science", "MIT", 1500));
        v1.add(new Admin5("Mechanical Engineering", "Stanford", 1300));
        v1.add(new Admin5("Physics", "Harvard", 1400));
        v1.add(new Admin5("Economics", "Yale", 1200));

        for (int i = 0; i < v1.size(); i++) {
            Object a1 = v1.get(i);
            Admin5 x1 = (Admin5) a1;
            System.out.println("Course Name: " + x1.course_name);
            System.out.println("University Name: " + x1.univr_name);
            System.out.println("Exam Cost: " + x1.exam_cost);
            System.out.println("-----------------------------------------");
        }
    }
}