package jb2;

import java.util.Arrays;

class Emp implements Comparable<Emp> {
    int empid;
    String ename;
    double sal;

    // Constructor with parameter types
    Emp(int empid, String ename, double sal) {
        this.empid = empid;
        this.ename = ename;
        this.sal = sal;
    }

    // Override toString method for display
    public String toString() {
        return empid + " " + ename + " " + sal;
    }

    // Implementing compareTo method to compare based on empid
    public int compareTo(Emp o) {
        return Integer.compare(this.empid, o.empid);  // Compare based on empid
    }
}

class jb{
    public static void main(String[] args) {
        // Corrected declaration of Emp objects
        Emp e1 = new Emp(7, "abc", 77.0);
        Emp e2 = new Emp(8, "jkl", 78.0);
        Emp e3 = new Emp(11, "mno", 79.0);
        Emp e4 = new Emp(10, "def", 798.0);
        Emp e5 = new Emp(9, "ghi", 777.0);

        // Array of Emp objects
        Emp[] arr = {e1, e2, e3, e4, e5};

        // Sorting the array
        Arrays.sort(arr);

        // Loop to print sorted employees
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
