
public class OutsideLightsOn implements OutsideLightState {
	
	OutsideLights outsideLights;

	public OutsideLightsOn(OutsideLights outsideLights) {
		this.outsideLights = outsideLights;
	}

	public void nighttime() {
		System.out.println("Outside lights are already on");
		
	}

	public void daytime() {
		System.out.println("Outside lights are turned off");
		outsideLights.setState(outsideLights.getOutsideLightsOffState());
		
	}

	public void switchOn() {
		System.out.println("Outside lights are already on");
		
	}


	public void switchOff() {
		System.out.println("Outside Lights are turned off");
		outsideLights.setState(outsideLights.getOutsideLightsOffState());
	}

	
}
