package behaviourial.observable;

import java.util.Observable;
import java.util.Observer;

import behaviourial.observer.WeatherObserver;

public class Newspaper implements WeatherObserver{

	@Override
	public void doUpdate(int temperature) {
		
System.out.println("NewsPaper are updating temperature as"+temperature);
		
	}

	

	
	
}
