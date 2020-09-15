package structural.adapter.phone;

import structural.adapter.phone.impl.Android;
import structural.adapter.phone.impl.Iphone;
import structural.adapter.phone.wrap.LightningToMicroUSBAdapter;

public class TestMain {

	public static void rechargeMicroUSBPhone(MicroUSbPhone phone)
	{
		phone.useMicroUSB();
		phone.recharge();
	}
	
	public static void rechargeLightningPhone(LightningPhone phone)
	{
		phone.useLightning();
		phone.recharge();
	}
	public static void main(String[] args) {
		MicroUSbPhone android=new Android();
		LightningPhone iphone=new Iphone();
		System.out.println("Recharging Android with MicroUSB");
		rechargeMicroUSBPhone(android);
		System.out.println("Recharge Iphone with Lightning");
		rechargeLightningPhone(iphone);
		System.out.println("Recharging Iphone with MicroUSB");
		rechargeMicroUSBPhone(new LightningToMicroUSBAdapter(iphone));
	}
}
