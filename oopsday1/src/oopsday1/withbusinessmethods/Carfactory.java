package oopsday1.withbusinessmethods;

public class Carfactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   Car jag = new Car("Rose",350000,"Toyota","Innova");
		  
			jag.start();
			jag.changeGear(1);
			jag.stop();
			
		Car bmw = new Car("Red",670000,"BMW","XUV");
		
		     bmw.start();
		     bmw.changeGear(1);
		     bmw.stop();
	}

}
