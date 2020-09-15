package structural.adapter.phone.impl;

import structural.adapter.phone.MicroUSbPhone;

public class Android implements MicroUSbPhone {
	private boolean connector;
	public void recharge() {
		if(connector)
		{
			System.out.println("Recharge Started");
			System.out.println("Recharge Finished");
		}
		else
		{
			System.out.println("Connect MicroUsb first");
		}

	}

	public void useMicroUSB() {
		connector=true;
		System.out.println("MicroUsb Connected");

	}

}
