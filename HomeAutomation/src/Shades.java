
public class Shades implements Observer, ObserverDisplayElement{

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
	
	ShadeState shadesUp;
	ShadeState shadesHalfway;
	ShadeState shadesDown;
	
	ShadeState state = shadesDown;
		
	// Set the hours for when the shades are moved (values are inclusive)
	// Shades down does not have value as the shades will default to 'Down' if not specified
	
	final int SHADESUPSTART = 10;
	final int SHADESUPEND = 16;
	final int SHADESHALFWAYSTART1 = 7;
	final int SHADESHAFLWAYEND1 = 9;
	final int SHADESHALFWAYSTART2 = 17;
	final int SHADESHALFWAYEND2 = 19;
	
	public Shades(ObserverSubject observerData) {
		this.observerData = observerData;
		observerData.registerObserver(this);
		
		shadesUp = new ShadesUp(this);
		shadesHalfway = new ShadesHalfway(this);
		shadesDown = new ShadesDown(this);
		
		state = shadesDown;
	}
	
	public void execute() {
		if (hour >= SHADESUPSTART && hour <= SHADESUPEND) {
			shadesUp();
		}else if (hour >= SHADESHALFWAYSTART1 && hour <= SHADESHAFLWAYEND1) {
			shadesHalfway();
		}else if (hour >= SHADESHALFWAYSTART2 && hour <= SHADESHALFWAYEND2) {
			shadesHalfway();
		}else {
			shadesDown();
		}
		
	}

	public void update(float externalTemperature, float internalTemperature, float desiredInternalTemp, int hour) {
		this.externalTemperature = externalTemperature;
		this.internalTemperature = internalTemperature;
		this.desiredInternalTemp = desiredInternalTemp;
		this.hour = hour;
		execute();
		
	}
	
	void setState(ShadeState state) {
		this.state = state;
	}
	
	
	public void shadesUp() {
		state.shadesUp();
		testValue = 1;
		
	}
	
	public void shadesHalfway() {
		state.shadesHalfway();
		testValue = 2;
	}
	
	public void shadesDown() {
		state.shadesDown();
		testValue = 3;
	}

	public ShadeState getShadesUpState() {return shadesUp;}
	public ShadeState getShadeHalfwayState() {return shadesHalfway;}
	public ShadeState getShadesDownState() {return shadesDown;}

	public static void staticShadesUp(Shades object) {
		object.shadesUp();
	}
	
	public int testValue() {
		return testValue;
	}
	
	public void setTestValue(int testValue) {
		this.testValue = testValue;
	}
}
