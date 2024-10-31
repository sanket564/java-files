package hashset;

import java.util.*;

class ShoeCollection{
	int index;
	Object[] arr;
	ShoeCollection(){
		index=0;
		arr=new Object[10];
	}
	void resize() {
		Object[] temp=new Object[index*2];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr=temp;
	}
	
	Object remove(int i) {
		Object temp=arr[i];
		arr[i]=null;
		System.arraycopy(arr,i+1,arr,i,arr.length-i-1);
		index--;
		return temp;
	}
	Object remove(Object obj) {
		Object temp=obj;
		for(int i=0;i<index;i++) {
			if(temp.equals(arr[i])) {		
				temp=remove(i);
			}
		}
		return temp;
	}
	void add(Object obj) {
		if(index==arr.length) {
			resize();
		}
		arr[index]=obj;
		index++;
	}
	void add(int i,Object obj) {
		if(index==arr.length) {
			resize();
		}
		System.arraycopy(arr, i-1, arr, i,arr.length-i-1 );
		
		arr[i]=obj;
		index++;
	}
	public String toString() {
		StringBuilder s1=new StringBuilder();
		s1.append("[");
		for(int i=0;i<index;i++) {
			s1.append(arr[i]+" ");
		}
		s1.append("]");
		return s1.toString();
	}
	int size() {
		return index;
	}
	void addall(ShoeCollection temp) {
		Object[] abb = temp.arr;
		try {
			for(int i=0;i<temp.size();i++) {
				add(abb[i]);
			}
			}
		catch(Exception e) {
			System.out.println(e+" "+abb[0]);
		}
	}
	void removeAll(ShoeCollection temp) {
		Object[] abb=temp.arr;
		for(int i=0;i<temp.size();i++) {
			remove(abb[i]);
		}
	}
	
}
public class ShoeShop {
	
	public static void main(String[] args) {
	ShoeCollection l1=new ShoeCollection();
	l1.add(1);
	l1.add(2);
	l1.add(3);
	l1.add(4);
	l1.add(5);
	l1.add(6);
	l1.add(7);
	l1.add(8);
	l1.add(9);
	l1.add(10);
	l1.add(11);
	l1.add(12);
	l1.add(13);
	l1.add(14);
	l1.add(15);
	l1.add(16);
	ShoeCollection l2=new ShoeCollection();
	l2.add("hi");
	l2.add("bye");
	ShoeCollection l3=new ShoeCollection();
	l3.add(10.00);
	l3.add(20.9);
	l3.add(40.45);
	ShoeCollection l4=new ShoeCollection();
	l4.add(1);
	l4.add(2);
	l4.add(3);
	l4.add(4);
	l4.add(5);
	l4.add(6);
	l4.add(7);
	l4.add(8);
	System.out.println(l1);
	l1.removeAll(l4);
	System.out.println(l1);
	}

}