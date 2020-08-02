package interfaces;

// this interface is implemented by all
// observers so they all have to implement
// the update() method. here we're 
// passing the measurements to the observers
public interface Observer {
	
	// temp, humidity, pressure are the state values that observers
	// get from the subject when a weather measurement changes
	public void update(float temp, float humidity, float pressure);
}
