package jb2;

import java.util.Arrays;
import java.util.Comparator;

final class Student1  {
    int stdid;
    String sname;
    int marks;

    // Constructor with parameter types
    Student1(int stdid, String sname, int marks) {
        this.stdid = stdid;
        this.sname = sname;
        this.marks = marks;
    }

    // Override toString method for display
    public String toString() {
        return stdid + " " + sname + " " + marks;
    }

    // Implementing compareTo method to compare based on empid
}

class Student implements Comparator<Student1>{
    public static void main(String[] args) {
        // Corrected declaration of std objects
        Student1 s1 = new Student1(7, "sanket",100);
        Student1 s2 = new Student1(8, "suresh", 78);
        Student1 s3 = new Student1(11, "mahesh", 80);
        Student1 s4 = new Student1(10, "srivatsa", 45);
        Student1 s5 = new Student1(9, "manisha", 47);

        // Array of Emp objects
       Student1[] arr = {s1,s2,s3,s4,s5};

        // Sorting the array
        Arrays.sort(arr,new Student());

        // Loop to print sorted employees
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public int compare(Student1 o1, Student1 o2)
    {
    	return o1.stdid-o2.stdid;
    }
    
    
}

