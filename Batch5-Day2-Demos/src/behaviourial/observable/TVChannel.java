package behaviourial.observable;

import behaviourial.observer.WeatherObserver;

public class TVChannel implements WeatherObserver {

	@Override
	public void doUpdate(int temperature) {
		// TODO Auto-generated method stub
		System.out.println("TVChannels are updating temperature as"+temperature);
	}

}
