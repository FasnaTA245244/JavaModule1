package optional;

import java.util.Optional;

public class TestOptional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = null;
		String str2 = "Hello";
		//Optional<String> optional = Optional.of(str);
		
		//System.out.println(optional.get()); 
		
		Optional<String> optional2 = Optional.ofNullable(str);  //when str is used else part will execute and no such exception occurs.
		if(optional2.isPresent())            // when str1 is used if part is executed.
			System.out.println("Value is present " + optional2.get());
		else 
			//System.out.println("Is null "+optional2.get());
			System.out.println("Is null " +optional2.orElse("This str is not initialized"));
		     
		
		//System.out.println(optional2.get());

	}

}
