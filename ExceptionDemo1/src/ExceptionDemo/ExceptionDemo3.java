package ExceptionDemo;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program Task Begins...");
		try {
			System.out.println("Entered Try...");
			int c= 10/0;
			System.out.println("From Try After Exception...");
			
		}catch(Exception e)
		{
		// System.out.println("From Catch...");	
		}
//		catch(ArithmeticException e)
//		{
//			e.printStackTrace();
//		}
		finally
		{ 
			System.out.println("From Finally...");
		}
        System.out.println("Program Completed Task...");
	}

}
