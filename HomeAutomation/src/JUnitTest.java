//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTest {

	@Test
	void test() {
		System.out.println("\nTesting Shades.....");
		ObserverData observerData = new ObserverData();
		Shades shades = new Shades(observerData);
		observerData.setMeasurements(71, 60, 70, 10);
		assert(shades.testValue()==1);
		observerData.setMeasurements(71, 60, 70, 10);
		
	
	}

}
