
public class InsideLightsOff implements InsideLightState{

	InsideLights insideLights;
	
	public InsideLightsOff(InsideLights insideLights) {
		this.insideLights = insideLights;
	}


	public void nightLight() {
		System.out.println("Inside lights are turned on");
		insideLights.setState(insideLights.getInsideLightsOnState());
	}


	public void morningLight() {
		System.out.println("Inside lights are turned on");
		insideLights.setState(insideLights.getInsideLightsOnState());
	}


	public void switchOn() {
		System.out.println("Inside lights are turned on");
		insideLights.setState(insideLights.getInsideLightsOnState());
	}


	public void switchOff() {
		System.out.println("Inside lights are already off");
	}


}
