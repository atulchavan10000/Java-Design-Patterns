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

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);		
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i >= 0) {
			observers.remove(o);			
		}
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}
	
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
