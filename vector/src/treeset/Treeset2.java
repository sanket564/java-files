
package treeset;
import java.util.TreeSet;

public class Treeset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet s1=new TreeSet();
		s1.add(5);
		s1.add(10);
		TreeSet s2=new TreeSet();
		s1.add(3);
		s1.add(10);
		s1.addAll(s2);
		
		System.out.println(s1);

	}

}
