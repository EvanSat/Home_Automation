
public class ShadesDown implements ShadeState{

	Shades shades;
	
	public ShadesDown (Shades shades) {
		this.shades = shades;
	}
	
	public void shadesUp() {
		System.out.println("Window shades are moved up all the way");
		shades.setState(shades.getShadesUpState());
		
	}

	public void shadesHalfway() {
		System.out.println("Window shades were moved up halfway");
		shades.setState(shades.getShadeHalfwayState());
	}

	public void shadesDown() {
		System.out.println("Window shades are already all the way down");
	}

}
