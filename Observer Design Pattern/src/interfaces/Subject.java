package interfaces;

public interface Subject {
	
	// Both of these methods take an
	// Observer as an argument, that is the
	// Observer to be registered or removed
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	
	// this method is called to notify all observers
	// when the subjects state has changed.
	public void notifyObservers();
}
