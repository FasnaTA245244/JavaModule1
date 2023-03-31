package structural.adapter.wrap;

import structural.adapter.phoneifaces.LightningPhone;
import structural.adapter.phoneifaces.MicroUsbphone;

public class LightningToMicroUsbAdapter implements MicroUsbphone {
	
	 private final LightningPhone lightningPhone;

	    public LightningToMicroUsbAdapter(LightningPhone lightningPhone) {
	        this.lightningPhone = lightningPhone;
	    }

	@Override
	public void recharge() {
		// TODO Auto-generated method stub
		 lightningPhone.recharge();

	}

	@Override
	public void useMicroUsb() {
		// TODO Auto-generated method stub
		 System.out.println("MicroUsb connected");
	        lightningPhone.useLightning();

	}

}
