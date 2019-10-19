
public interface ObserverSubject {

	public void registerObserver(Observer newObserver);
	public void removeObserver(Observer newObserver);
	public void notifyObservers();
	
}
