
public class InsideLightsOn implements InsideLightState {
	
	InsideLights insideLights;

	public InsideLightsOn(InsideLights insideLights) {
		this.insideLights = insideLights;
	}

	public void nightLight() {
		System.out.println("Inside lights are already on");
		
	}

	public void morningLight() {
		System.out.println("Inside lights are already on");
		
	}

	public void switchOn() {
		System.out.println("Inside lights are already on");
		
	}


	public void switchOff() {
		System.out.println("Outside Lights are turned off");
		insideLights.setState(insideLights.getInsideLightsOffState());
	}

	
}
