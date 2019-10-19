
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
	}
	
	public void daytime() {
		state.daytime();
	}
	
	public void switchOn() {
		state.switchOn();
	}
	
	public void switchOff() {
		state.switchOff();
	}

	public OutsideLightState getOutsideLightsOnState() {return outsideLightsOn;}
	public OutsideLightState getOutsideLightsOffState() {return outsideLightsOff;}
	
}
