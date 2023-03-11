package functionalInterfaces;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>strings = Arrays.asList("Andhra Pradesh","Tamil Nadu","Telgana","Kerala","Karnataka");
		Function<String,Integer>f =(str)->{
			                             return str.length();
		                                  };
		     
		     // printLength(strings,f);
	
	
		      
		       
		       Function<String,String> f1 = (str)->{
                   return str.toUpperCase();
                            };

                            
               Function<String,String> f2 = (str)->{
		            return str.toLowerCase();
	                                     };
	                                     
	          Function<String, String> f3=(str)->{
	        	  StringBuilder sb=new StringBuilder(str);
	        	  sb.reverse();
	        	  String str1=sb.toString();
	        	  return str1;
	          };
	         upper(strings,f1);
	         lower(strings,f2);
	         reverse(strings,f3);
	         
	}

	private static void print(List<String>strings,Function<String,Integer> f) {
		for(String str:strings)
		{
			System.out.println(f.apply(str));
		}
	}
	
	private static void upper(List<String>strings,Function<String,String> f1) {
		for(String str:strings)
		{
			System.out.println(f1.apply(str));
		}
	}
		private static void lower(List<String>strings,Function<String,String> f1) {
			for(String str:strings)
			{
				System.out.println(f1.apply(str));
			}
			
	}
		private static void reverse(List<String>strings,Function<String,String> f1) {
			for(String str:strings)
			{
				System.out.println(f1.apply(str));
			
			}
		}
	
}
