
public class OutsideLightsOff implements OutsideLightState{

	OutsideLights outsideLights;
	
	public OutsideLightsOff(OutsideLights outsideLights) {
		this.outsideLights = outsideLights;
	}


	public void nighttime() {
		System.out.println("Outside lights are turned on");
		outsideLights.setState(outsideLights.getOutsideLightsOnState());
	}


	public void daytime() {
		System.out.println("Outside lights are already off");
		
	}


	public void switchOn() {
		System.out.println("Outside lights are turned on");
		outsideLights.setState(outsideLights.getOutsideLightsOnState());
	}


	public void switchOff() {
		System.out.println("Outside lights are already off");
		
	}

}
