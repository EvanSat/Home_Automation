
public class Windows implements Observer, ObserverDisplayElement {

	@SuppressWarnings("unused")
	private float externalTemperature;
	private float internalTemperature;
	private float desiredInternalTemp;
	@SuppressWarnings("unused")
	private int hour;
	@SuppressWarnings("unused")
	private ObserverSubject observerData;
	
	WindowState windowsFullOpen;
	WindowState windowsHalfwayOpen;
	WindowState windowsClose;
	
	WindowState state = windowsClose;
	
	//Sets when windows will be halfway open
	final float HALFWAYDEGREEPOINT = 5;
	float InternalTempDesiredTempDiff = Math.abs(internalTemperature-desiredInternalTemp);
	
	
	public Windows(ObserverSubject observerData) {
		this.observerData = observerData;
		observerData.registerObserver(this);
		
		windowsFullOpen = new WindowsFullOpen(this);
		windowsHalfwayOpen = new WindowsHalfwayOpen(this);
		windowsClose = new WindowsClose(this);
		
		state = windowsClose;
	}
	
	
	public void execute() {
		if ((externalTemperature < internalTemperature) && (desiredInternalTemp < internalTemperature) && (HALFWAYDEGREEPOINT >= InternalTempDesiredTempDiff)) {
			windowsHalfwayOpen();
		} else if (externalTemperature < internalTemperature && desiredInternalTemp < internalTemperature) {
			windowsFullOpen();
		} else if ((externalTemperature > internalTemperature) && (desiredInternalTemp > internalTemperature) && (HALFWAYDEGREEPOINT >= InternalTempDesiredTempDiff)) {
			windowsHalfwayOpen();
		} else if (externalTemperature > internalTemperature && desiredInternalTemp > internalTemperature) {
			windowsFullOpen();
		} else {
			windowsClose();
		}
		
	}

	public void update(float externalTemperature, float internalTemperature, float desiredInternalTemp, int hour) {
		this.externalTemperature = externalTemperature;
		this.internalTemperature = internalTemperature;
		this.desiredInternalTemp = desiredInternalTemp;
		this.hour = hour;
		execute();
		
	}

	void setState(WindowState state) {
		this.state = state;
	}
	
	public void windowsFullOpen() {
		state.windowsFullOpen();
	}
	
	public void windowsHalfwayOpen() {
		state.windowsHalfwayOpen();
	}
	
	public void windowsClose() {
		state.windowsClose();
	}
	
	public WindowState getWindowsFullOpen() {return windowsFullOpen;}
	public WindowState getWindowsHalfwayState() {return windowsHalfwayOpen;}
	public WindowState getWindowCloseState() {return windowsClose;}
	
}
