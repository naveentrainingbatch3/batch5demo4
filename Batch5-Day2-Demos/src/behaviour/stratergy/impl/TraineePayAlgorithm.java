package behaviour.stratergy.impl;

import behaviour.stratergy.PayAlgorithm;

public class TraineePayAlgorithm implements PayAlgorithm {

	@Override
	public double getpay(double salary) {
		// TODO Auto-generated method stub
		return salary+(salary*0.12);
	}

}
