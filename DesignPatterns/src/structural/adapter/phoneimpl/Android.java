package structural.adapter.phoneimpl;

import structural.adapter.phoneifaces.MicroUsbphone;

public class Android implements MicroUsbphone {
	
	private boolean connector;

	@Override
	public void recharge() {
		// TODO Auto-generated method stub
		if(connector)
		{
			System.out.println("Recharge Started");
			System.out.println("Recharge finished");
		}
		else 
		{
			System.out.println("Connect MicroUsb first");
		}

	}

	@Override
	public void useMicroUsb() {
		
		// TODO Auto-generated method stub
		connector = true;
		System.out.println("MicroUsb connected");

	}

}
