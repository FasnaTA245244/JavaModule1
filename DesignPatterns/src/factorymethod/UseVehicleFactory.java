package factorymethod;

public class UseVehicleFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle seltos = VehicleFactory.newInstance("Seltos");
		seltos.honk();
		
		Vehicle xcross = VehicleFactory.newInstance("XCross");
		xcross.move();
		

	}

}
