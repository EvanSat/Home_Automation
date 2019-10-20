//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitCmd {

	@Test
	void test() {
		System.out.println("Testing Command function to close and turn off");
		ObserverData observerData = new ObserverData();
		OutsideLights outsideLights = new OutsideLights(observerData);
		InsideLights insideLights = new InsideLights(observerData);
		Shades shades = new Shades(observerData);
		Windows windows = new Windows(observerData);
		
		
		CmdButton remote = new CmdButton();
		CmdShutDown cmdShutDown = new CmdShutDown(windows, shades, outsideLights, insideLights);
		remote.setCmdButton(cmdShutDown);
		remote.press();
		// Result should be that lights were closed, 
		// windows were closed, and shades are moved all the way down
		assert(insideLights.testValue()==2);
		assert(outsideLights.testValue()==2);
		assert(windows.testValue()==3);
		assert(shades.testValue()==3);
		
	}

}
