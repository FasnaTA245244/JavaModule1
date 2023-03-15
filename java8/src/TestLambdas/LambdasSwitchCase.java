package TestLambdas;

public class LambdasSwitchCase {
	
	static  double calculate(String operator, double x, double y)
	{
		return switch(operator)
				{
             		case "+" -> x + y;
             		case "-" -> x - y;
             		case "*" -> x * y;
             		case "/" ->{
             			if(y == 0)
             			{
             				throw new IllegalArgumentException("Can't divide by zero");
             			}
             			yield x/y;
             		}
             		default -> throw new IllegalArgumentException("Unknown operator");
				};
	}
	
	
	public static void main(String[] args) {
		LambdasSwitchCase lsc = new LambdasSwitchCase();
		lsc.calculate("+", 5, 8);
		System.out.println(lsc);
		
		
	}

}


