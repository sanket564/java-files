package Linkedlist;

import java.util.LinkedHashSet;

public class List3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet s1=new LinkedHashSet();
		s1.add("5");
		s1.add("10");
		System.out.println(s1.size());
		LinkedHashSet s2=new LinkedHashSet();
		s1.add("3");
		s1.add("10");
		s1.addAll(s2);
		
		System.out.println(s1.size());

	}

}
