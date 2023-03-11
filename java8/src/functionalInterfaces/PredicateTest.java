package functionalInterfaces;

import java.util.function.Predicate;
import java.util.Arrays;
import java.util.List;

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>strings =Arrays.asList("Andhra Pradesh","Tamil Nadu","Telgana","Kerala","Karnataka");
		
		Predicate<String> p = (String str) ->{
 		                            return str.length()>5;
 		                            };
 		      System.out.println(p.test("Hola!"));
 		    desiredLength(strings,p);

	}
	
	public static void desiredLength(List<String> strings, Predicate<String>p)
	{
	   for(String str: strings)	
		   System.out.println(p.test(str));
	}

}
