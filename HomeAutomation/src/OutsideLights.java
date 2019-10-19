
public class OutsideLights implements Observer, ObserverDisplayElement{

	@SuppressWarnings("unused")
	private float externalTemperature;
	@SuppressWarnings("unused")
	private float internalTemperature;
	@SuppressWarnings("unused")
	private float desiredInternalTemp;
	private int hour;
	@SuppressWarnings("unused")
	private ObserverSubject observerData;
	private int testValue;
	
	OutsideLightState outsideLightsOn;
	OutsideLightState outsideLightsOff;
	
	OutsideLightState state = outsideLightsOff;
	
	// Set the hours for the beginning of night time and day time
	final int NIGHTTODAYHR = 7;
	final int DAYTONIGHTHR = 19;
	
	public OutsideLights(ObserverSubject observerData) {
		this.observerData = observerData;
		observerData.registerObserver(this);
		
		outsideLightsOn = new OutsideLightsOn(this);
		outsideLightsOff = new OutsideLightsOff(this);
		
		state = outsideLightsOff;		
	}
	
	public void execute() {
		if (hour <= NIGHTTODAYHR || hour >= DAYTONIGHTHR) {
			nighttime();
		}else {
			daytime();
		}
		
	}

	public void update(float externalTemperature, float internalTemperature, float desiredInternalTemp, int hour) {
		this.externalTemperature = externalTemperature;
		this.internalTemperature = internalTemperature;
		this.desiredInternalTemp = desiredInternalTemp;
		this.hour = hour;
		execute();
		
	}

	void setState(OutsideLightState state) {
		this.state = state;
	}
	
	public void nighttime() {
		state.nighttime();
		testValue = 1;
	}
	
	public void daytime() {
		state.daytime();
		testValue = 2;
	}
	
	public void switchOn() {
		state.switchOn();
		testValue = 1;
	}
	
	public void switchOff() {
		state.switchOff();
		testValue = 2;
	}

	public OutsideLightState getOutsideLightsOnState() {return outsideLightsOn;}
	public OutsideLightState getOutsideLightsOffState() {return outsideLightsOff;}
	
	public int testValue() {
		return testValue;
	}
	
	public void setTestValue(int testValue) {
		this.testValue = testValue;
	}
	
}
