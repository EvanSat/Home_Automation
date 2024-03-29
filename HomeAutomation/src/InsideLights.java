
public class InsideLights implements Observer, ObserverDisplayElement{

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
	
	InsideLightState insideLightsOn;
	InsideLightState insideLightsOff;
	
	InsideLightState state = insideLightsOff;
	
	// Set the hours for inside morning light and inside night light 
	final int MORNINGLIGHTONHR = 6;
	final int MORNINGLIGHTOFFHR = 8;
			
	final int NIGHTLIGHTONHR = 19;
	final int NIGHTLIGHTOFFHR = 23;
	
	public InsideLights(ObserverSubject observerData) {
		this.observerData = observerData;
		observerData.registerObserver(this);
		
		insideLightsOn = new InsideLightsOn(this);
		insideLightsOff = new InsideLightsOff(this);
		
		state = insideLightsOff;		
	}
	
	public void execute() {
		if (hour >= MORNINGLIGHTONHR && hour <= MORNINGLIGHTOFFHR) {
			morningLight();
		}
		else if(hour >= NIGHTLIGHTONHR && hour <= NIGHTLIGHTOFFHR){
			nightLight();
		}
		else {
			switchOff();
		}
		
	}

	public void update(float externalTemperature, float internalTemperature, float desiredInternalTemp, int hour) {
		this.externalTemperature = externalTemperature;
		this.internalTemperature = internalTemperature;
		this.hour = hour;
		execute();
		
	}

	void setState(InsideLightState state) {
		this.state = state;
	}
	
	public void nightLight() {
		state.nightLight();
		testValue = 1;
	}
	
	public void morningLight() {
		state.morningLight();
		testValue = 1;
	}
	
	public void switchOn() {
		state.switchOn();
		testValue = 1;
	}
	
	public void switchOff() {
		state.switchOff();
		testValue = 2;
	}

	public InsideLightState getInsideLightsOnState() {return insideLightsOn;}
	public InsideLightState getInsideLightsOffState() {return insideLightsOff;}
	
	public static void staticSwitchOn(InsideLights object) {
		object.switchOn();
	}

	public static void staticSwitchOff(InsideLights object) {
		object.switchOff();
	}
	
	public int testValue() {
		return testValue;
	}
	
	public void setTestValue(int testValue) {
		this.testValue = testValue;
	}

}
