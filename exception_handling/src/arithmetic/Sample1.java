package arithmetic;

						// TODO Auto-generated method stub
				public class Sample1{
					static void disp4()
					{
						int i=1/0;
						
					}
					static void disp3()
					{
						disp4();
					}
					static void disp2()
					{
						disp3();
						
					}
					static void disp1()
					{
						disp2();
					}
					public static void main(String[] args) {
						System.out.println("main starts ");
						try
						{
							disp1();
						}
						catch(ArithmeticException e)
						{
							e.printStackTrace();
						}
					}
				}
					




