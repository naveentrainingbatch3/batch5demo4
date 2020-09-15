package structural.adapter.phone.impl;

import structural.adapter.phone.LightningPhone;

public class Iphone implements LightningPhone {

	private boolean connector;
	public void recharge() {
		// TODO Auto-generated method stub
		if(connector)
		{
			System.out.println("Recharge Started");
			System.out.println("Recharge Finished");
		}
		else
		{
			System.out.println("Connect Lightning first");
		}
	}

	public void useLightning() {
		connector=true;
		System.out.println("Lightning Connected");

	}

}
