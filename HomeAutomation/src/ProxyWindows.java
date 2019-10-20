
public class ProxyWindows implements ProxyGetWindowState, Observer, ObserverDisplayElement {

	private float externalTemperature;
	private float internalTemperature;
	private float desiredInternalTemp;
	private int hour;
	
	WindowState windowsFullOpen;
	WindowState windowsHalfwayOpen;
	WindowState windowsClose;
	
	WindowState state;
	
	private ObserverSubject observerData;
	
	public WindowState getWindowState() {

		Windows windowsProxy = new Windows(observerData);
		
		return windowsProxy.getWindowState();
	}


	public ProxyWindows(ObserverSubject observerData) {
		this.observerData = observerData;
		observerData.registerObserver(this);
		
		state = windowsFullOpen;
	}

	@Override
	public void execute() {
		// nothing to execute
		
	}

	public void update(float externalTemperature, float internalTemperature, float desiredInternalTemp, int hour) {
		this.externalTemperature = externalTemperature;
		this.internalTemperature = internalTemperature;
		this.desiredInternalTemp = desiredInternalTemp;
		this.hour = hour;
		
	}
}
