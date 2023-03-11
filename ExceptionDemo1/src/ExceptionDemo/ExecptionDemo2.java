package ExceptionDemo;

public class ExecptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub=
		
		System.out.println("Program Task Begins......");
		try {
		int a = Integer.parseInt(args[1]);                       //args command line argument
		int b = Integer.parseInt(args[0]);
		int c = b/a;
		String namen= args[2];
		int data[] = {a,b};}
		catch (ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}catch  (NumberFormatException e)
		{
			e.printStackTrace();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Program Task Completed......");

	}

}
