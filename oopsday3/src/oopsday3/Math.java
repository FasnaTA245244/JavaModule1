package oopsday3;

public class Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Math2 result = new Math2(3,4,6);
		 int fac = result.Factorial(6);
		 System.out.println("Factorial of 6 =" + fac);
		 int a = result.Add(3,4);
		 System.out.println("AddResult =" + a);
		 int s = result.Sub(3,4);
		 System.out.println("SubResult =" + s);
		 int m = result.Mul(3,4);
		 System.out.println("MulResult =" + m);
		 result.EvenOrOdd();
		 
				

	}

}
