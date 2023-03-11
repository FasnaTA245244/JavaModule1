package oopsday2;

public class Car implements CarIface {
	
	private double fuel;
	private double battery;
	private double KilometersRun;
	private boolean engineStatus;
	
	public Car() {
		
		
	}

	
	public Car(double fuel, double battery, double kilometersRun, boolean engineStatus) {
		
		this.fuel = fuel;
		this.battery = battery;
		KilometersRun = kilometersRun;
		this.engineStatus = engineStatus;
	}

	
	
	

	public double getFuel() {
		return fuel;
	}


	public void setFuel(double fuel) {
		this.fuel = fuel;
	}


	public double getBattery() {
		return battery;
	}


	public void setBattery(double battery) {
		this.battery = battery;
	}


	public double getKilometersRun() {
		return KilometersRun;
	}


	public void setKilometersRun(double kilometersRun) {
		KilometersRun = kilometersRun;
	}


	public boolean isEngineStatus() {
		return engineStatus;
	}


	public void setEngineStatus(boolean engineStatus) {
		this.engineStatus = engineStatus;
	}


	
	
	@Override
	public void start() {
		
		if(engineStatus== false && fuel > 1000 && battery > 100) {
		System.out.println("Engine Starting...");
		engineStatus = true;
		}


	}

	@Override
	public void honk() {
		
		System.out.println("Bla Blaa Blaaa Blaaaa...");
		
		
	}

	@Override
	public void moove() {
		
		        if(engineStatus) {
		        	
		        	for(int i=0; i<50; i++) {
		        		
		        		System.out.println("Car is Moving");
		        		fuel = fuel - 10;
		        		battery = battery - 2;
		        		KilometersRun++;
		        		
		         try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		         
		         
		         
		    	}
		        	
		        }

	}

	@Override
	public void changeGear() {
		

	}

	@Override
	public void stop() {
		
		System.out.println("Car is Stopping...");
		this.engineStatus = false;
		

	}


	@Override
	public String toString() {
		return "Car [fuel=" + fuel + ", battery=" + battery + ", KilometersRun=" + KilometersRun + ", engineStatus="
				+ engineStatus + "]";
	}
	

}
