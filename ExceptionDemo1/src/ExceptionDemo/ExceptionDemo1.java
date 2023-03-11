package ExceptionDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {
	public static void main(String[] args) {

		System.out.println("Program Task Begins");

		try {
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Cannot / by 0");

		}catch(InputMismatchException e)
		{
			System.out.println("Invalid input format");
		}
			
		System.out.println("Program completed task");
		
	}

}
