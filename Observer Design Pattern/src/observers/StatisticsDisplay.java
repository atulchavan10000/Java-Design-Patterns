package observers;

import interfaces.DisplayElement;
import interfaces.Observer;
import interfaces.Subject;

//This display implements Observer so it can get
//changes from the WeatherData object

//It also implements Display Element, because our 
//API is going to require all display elements
//to implement this interface
public class StatisticsDisplay implements Observer, DisplayElement {
	public float temperature;
	public float humidity;
	Subject weatherData;
	
	// the constructor is passed the
	// weatherData object(the Subject)
	// and we use it to register the
	// display as an observer
	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature");
		
	}

	// when update() is called, we
	// save the temp and humidity and call display()
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature =temp;
		this.humidity = humidity;
		display();
	}
	
}
