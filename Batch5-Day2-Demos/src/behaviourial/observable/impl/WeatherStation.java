package behaviourial.observable.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import behaviourial.observable.Observable;
import behaviourial.observer.WeatherObserver;

public class WeatherStation implements Observable {

	private List<WeatherObserver> weatherObservers;
	private int temperature;

	public void setTempearture(int temperature) {
		System.out.println("Weather Station is updatinh temperature to" + temperature);
		this.temperature = temperature;
		doNotify();
	}

	public WeatherStation(int temperature) {
		weatherObservers = new ArrayList<WeatherObserver>();
		this.temperature = temperature;
	}

	public void addObserver(WeatherObserver weatherobserver) {
		weatherObservers.add(weatherobserver);

	}

	public void removeObserver(WeatherObserver weatherobserver) {
		weatherObservers.remove(weatherobserver);

	}

	public void doNotify() {
		Iterator<WeatherObserver> iterator = weatherObservers.iterator();
		while (iterator.hasNext()) {
			WeatherObserver weatherObserver = iterator.next();
			weatherObserver.doUpdate(temperature);
		}

	}

}
