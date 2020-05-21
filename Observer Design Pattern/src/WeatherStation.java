import observers.CurrentConditionsDisplay;
import observers.ForecastDisplay;
import observers.StatisticsDisplay;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		weatherData.setMeasureMents(80, 65, 30.4f);
		weatherData.setMeasureMents(82, 70, 29.4f);
		weatherData.setMeasureMents(78, 90, 29.2f);
	}
}
