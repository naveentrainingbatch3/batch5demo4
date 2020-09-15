package behaviourial.observable;

import behaviourial.observer.WeatherObserver;

public interface Observable {

	void addObserver(WeatherObserver weatherobserver );
	void removeObserver(WeatherObserver weatherobserver );
	void doNotify();
}
