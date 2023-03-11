package oopsday1.setgetconstructors;

public class Carfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Car jag = new Car("Rose",350000,"Toyota","Innova");
		  
			/*
			 * jag.setColor("Blue"); jag.setPrice(3000000); jag.setBrand("Jagar");
			 * jag.setModel("Premium Sedan");
			 */
		  System.out.println(jag.hashCode());
		  System.out.println(Integer.toHexString(jag.hashCode()));
		  System.out.println(jag);
		  
		  System.out.println(jag.getColor());
		  System.out.println(jag.getPrice());
		  System.out.println(jag.getBrand());
		  System.out.println(jag.getModel());
			/*
			 * jag.color= "Black"; jag.price = 900000; jag.brand ="Woxwagon"; jag.model =
			 * "polo"; System.out.println(jag.color); System.out.println(jag.price);
			 * System.out.println(jag.brand); System.out.println(jag.model);
			 */
		Car bmw = new Car("Red",670000,"BMW","XUV");
		
		/*
		 * bmw.setColor("White"); bmw.setPrice(7500000); bmw.setBrand("BMW");
		 * bmw.setModel("Luxury SUV");
		 */
		  System.out.println(bmw.hashCode());
		  System.out.println(Integer.toHexString(bmw.hashCode()));
		  System.out.println(bmw);
		  
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
