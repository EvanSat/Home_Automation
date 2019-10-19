
public class ShadesUp implements ShadeState{

	Shades shades;
	
	public ShadesUp (Shades shades) {
		this.shades = shades;
	}
	
	public void shadesUp() {
		System.out.println("Window shades are already all the way up");
		
	}

	public void shadesHalfway() {
		System.out.println("Window shades were moved down halfway");
		shades.setState(shades.getShadeHalfwayState());
	}

	public void shadesDown() {
		System.out.println("Window shades were moved down all the way");
		shades.setState(shades.getShadesDownState());
		
	}

}
