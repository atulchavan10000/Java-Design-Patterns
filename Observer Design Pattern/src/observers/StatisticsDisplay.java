package observers;

import interfaces.DisplayElement;
import interfaces.Observer;
import interfaces.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {
	public float temperature;
	public float humidity;
	Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature");
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature =temp;
		this.humidity = humidity;
		display();
	}
	
}
