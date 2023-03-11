package oopsday1;

public class Carfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car jag = new Car();
		jag.color= "Black";
		jag.price = 900000;
		jag.brand ="Woxwagon";
		jag.model = "polo";		
		System.out.println(jag.color);
		System.out.println(jag.price);
		System.out.println(jag.brand);
		System.out.println(jag.model);
		
		Car bmw = new Car();
		bmw.color ="Black";
		bmw.brand ="BMW";
		bmw.price = 700000;
		bmw.model = "Luxury SUV";
	    System.out.println(bmw.color);
		System.out.println(bmw.price);
		System.out.println(bmw.brand);
		System.out.println(bmw.model);

	}

}
