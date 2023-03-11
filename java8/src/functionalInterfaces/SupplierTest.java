package functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>strings =Arrays.asList("Andhra Pradesh","Tamil Nadu","Telgana","Kerala","Karnataka");
	     Supplier<String> supplier = ()->{
		            return new String("Hola!");
	                                };
	                                
	         System.out.println(supplier.get());
	}
  }



