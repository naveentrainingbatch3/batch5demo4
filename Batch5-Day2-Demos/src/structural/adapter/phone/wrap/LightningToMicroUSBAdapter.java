package structural.adapter.phone.wrap;

import structural.adapter.phone.LightningPhone;
import structural.adapter.phone.MicroUSbPhone;

public class LightningToMicroUSBAdapter implements MicroUSbPhone {

	private final LightningPhone lightningPhone;

	public LightningToMicroUSBAdapter(LightningPhone lightningPhone) {
		this.lightningPhone = lightningPhone;
	}

	public void recharge() {
		lightningPhone.recharge();

	}

	public void useMicroUSB() {
		System.out.println("MicroUSB connected");
		lightningPhone.useLightning();
	}

}
