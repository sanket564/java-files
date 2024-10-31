package programming;

import java.util.HashMap;
import java.util.Map;

public class arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,2,1};		
HashMap<Integer,Integer> h1=new HashMap<Integer,Integer>();
for(int s:arr)
{
	h1.put(s,h1.getOrDefault(s,0)+1);
}
for(Map.Entry<Integer, Integer> map:h1.entrySet())
{
	System.out.println(map.getKey()+" "+map.getValue());
}
	

}
}
