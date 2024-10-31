package arithmetic;


public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		try
		{
			int i=18/2;
			int arr[] = {10,20,30,40};
			System.out.println(arr[i]);
 			
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds Exception");
		}
		System.out.println("ends");

	}

}
