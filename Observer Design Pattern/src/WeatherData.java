import java.util.ArrayList;
import interfaces.Observer;
import interfaces.Subject;

public class WeatherData implements Subject{
	//we've added an ArrayList to hold the Observer and
	//we create it in the constructor
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	// when an observer registers, we
	// just add it to the end of the list
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);		
	}
	
	// likewise, when an observer wants to
	// unregister, we just take it off the list
	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i >= 0) {
			observers.remove(o);			
		}
	}

	// this is where we tell all the
	// observers about the state. 
	// because they are all observers,
	// we know they all implement update(),
	// so we know how to notify them.
	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}
	
	// we notify the observers when we
	// get updated measurements from
	// the weather station.
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasureMents(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
