package behaviour.stratergy.impl;

import behaviour.stratergy.PayAlgorithm;

public class WebDesignerAlgorithm implements PayAlgorithm {

	@Override
	public double getpay(double salary) {
		// TODO Auto-generated method stub
		return salary+(salary*0.15);
	}

}
