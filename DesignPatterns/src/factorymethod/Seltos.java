package factorymethod;

public class Seltos implements Vehicle {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Started......" + getClass());

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stopped......"+ getClass());

	}

	@Override
	public void honk() {
		// TODO Auto-generated method stub
		System.out.println("Palm Palm......" + getClass());

	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("It's moving......" + getClass());

	}

}
