package behaviourial.observable;

import behaviourial.observable.impl.WeatherStation;

public class TestMain {
public static void main(String[] args) {
	TVChannel observer1=new TVChannel();
	Newspaper observer2=new Newspaper();
	
	WeatherStation weatherStation=new WeatherStation(33);
	weatherStation.addObserver(observer1);
	weatherStation.addObserver(observer2);
	
	weatherStation.setTempearture(40);
	weatherStation.removeObserver(observer1);
	weatherStation.setTempearture(32);
}
}
