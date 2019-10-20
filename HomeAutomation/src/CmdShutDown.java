
public class CmdShutDown implements Command{

	Windows windows;
	Shades shades;
	OutsideLights outsideLights;
	InsideLights insideLights;
	
	public CmdShutDown(Windows windows, Shades shades, OutsideLights outsideLights, InsideLights insideLights) {
		
		this.windows = windows;
		this.shades = shades;
		this.outsideLights = outsideLights;
		this.insideLights = insideLights;
		
	}
	
	
	@Override
	public void cmdExecute() {
		windows.windowsClose();
		shades.shadesDown();
		outsideLights.switchOff();
		insideLights.switchOff();
		
		
	}
	
}
