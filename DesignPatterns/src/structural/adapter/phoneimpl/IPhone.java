package structural.adapter.phoneimpl;

import structural.adapter.phoneifaces.LightningPhone;

public class IPhone implements LightningPhone {
	
	private boolean connector;

	@Override
	public void recharge() {
		// TODO Auto-generated method stub
		if(connector)
		{
			System.out.println("Charging Started");
			System.out.println("Charging finished");
		}
		else 
		{
			System.out.println("Connect Lightning first");
		}


	}

	@Override
	public void useLightning() {
		// TODO Auto-generated method stub
		connector = true;
		System.out.println("Lightning connected");


	}

}
