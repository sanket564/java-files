package arithmetic;


public class Sample4 {

	public static void main(String[] args) {
		System.out.println("start");
		try
		{
			int i=18/2;
			int arr[] = {10,20,30,40};
			System.out.println(arr[i]);
 			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bounds Exception");
		}
		finally
		{
			System.out.println("hey its finally");
		}
		System.out.println("ends");

	}

}
