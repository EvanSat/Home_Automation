import java.util.ArrayList;

public class ObserverData implements ObserverSubject{
	
	private ArrayList<Observer> observers;
	private float externalTemperature;
	private float internalTemperature;
	private float desiredInternalTemp;
	private int hour;
	
	public ObserverData() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer newObserver) {
		observers.add(newObserver);
		
	}

	public void removeObserver(Observer newObserver) {
		int i = observers.indexOf(newObserver);
		if (i >= 0) {
			observers.remove(i);
		}
		
	}

	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(externalTemperature, internalTemperature, desiredInternalTemp, hour);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float externalTemperature,float internalTemperature, float desiredInternalTemp, int hour) {
		this.externalTemperature = externalTemperature;
		this.internalTemperature = internalTemperature;
		this.desiredInternalTemp = desiredInternalTemp;
		this.hour = hour;
		measurementsChanged();
	}
	
	public float getExternalTemperature() {
		return externalTemperature;
	}
	
	public float getInternalTemperature() {
		return internalTemperature;
	}
	
	public int getHour() {
		return hour;
	}
}
