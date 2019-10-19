
public class ShadesHalfway implements ShadeState{

	Shades shades;
	
	public ShadesHalfway (Shades shades) {
		this.shades = shades;
	}
	
	public void shadesUp() {
		System.out.println("Window shades are moved up all the way");
		shades.setState(shades.getShadesUpState());
		
	}

	public void shadesHalfway() {
		System.out.println("Window shades are already halfway");
	}

	public void shadesDown() {
		System.out.println("Window shades were moved down all the way");
		shades.setState(shades.getShadesDownState());
		
	}

}
