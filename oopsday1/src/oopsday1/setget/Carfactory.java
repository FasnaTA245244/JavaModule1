package oopsday1.setget;

public class Carfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Car jag = new Car();
		  
		  jag.setColor("Blue");
		  jag.setPrice(3000000);
		  jag.setBrand("Jagar");
		  jag.setModel("Premium Sedan");
		  
		  System.out.println(jag.getColor());
		  System.out.println(jag.getPrice());
		  System.out.println(jag.getBrand());
		  System.out.println(jag.getModel());
			/*
			 * jag.color= "Black"; jag.price = 900000; jag.brand ="Woxwagon"; jag.model =
			 * "polo"; System.out.println(jag.color); System.out.println(jag.price);
			 * System.out.println(jag.brand); System.out.println(jag.model);
			 */
		Car bmw = new Car();
		
		  bmw.setColor("White");
		  bmw.setPrice(7500000);
		  bmw.setBrand("BMW");
		  bmw.setModel("Luxury SUV");
		  
		  System.out.println(bmw.getColor());
		  System.out.println(bmw.getPrice());
		  System.out.println(bmw.getBrand());
		  System.out.println(bmw.getModel());
		/*
		 * bmw.color ="Black"; bmw.brand ="BMW"; bmw.price = 700000; bmw.model =
		 * "Luxury SUV"; System.out.println(bmw.color); System.out.println(bmw.price);
		 * System.out.println(bmw.brand); System.out.println(bmw.model);
		 */
	}

}
