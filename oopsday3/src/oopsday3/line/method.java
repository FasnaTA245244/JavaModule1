package oopsday3.line;
import java.awt.Point;

import java.util.Scanner;

public class method 
{
	
	public static void main(String args[])
	{
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the coordinate of 1st point: ");
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	point p1 = new point(a,b);
	System.out.println("Enter the coordinate of 2nd point: ");
	a = scanner.nextInt();
	b = scanner.nextInt();
	point p2 = new point(a,b);
	System.out.println("Horizontal Line");
	int x = p1.getX();
	int y = p2.getX();
	
	line m1 = new line();
	m1.call(x,y);
	
	}

}
