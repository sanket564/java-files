
package hashset;
import java.util.HashSet;

public class Hashset5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet s1=new HashSet();
		s1.add("5");
		s1.add("10");
		System.out.println(s1.size());
		HashSet s2=new HashSet();
		s1.add("3");
		s1.add("10");
		s1.addAll(s2);
		
		System.out.println(s1.size());

	}

}
