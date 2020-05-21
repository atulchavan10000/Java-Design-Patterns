package observers;

import interfaces.DisplayElement;
import interfaces.Observer;
import interfaces.Subject;

public class ForecastDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	
	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Improving weather on the way! ");		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature =temp;
		this.humidity= humidity;
		this.pressure = pressure;
		display();
	}

}
