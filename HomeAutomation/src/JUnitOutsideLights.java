//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitOutsideLights {

	@Test
	void test() {
		System.out.println("\nTesting Outside Lights.....");
		ObserverData observerData = new ObserverData();
		OutsideLights outsideLights = new OutsideLights(observerData);
		observerData.setMeasurements(71, 60, 70, 10);
		assert(outsideLights.testValue()==2);
		observerData.setMeasurements(71, 60, 70, 18);
		assert(outsideLights.testValue()==2);
		observerData.setMeasurements(75, 61, 78, 22);
		assert(outsideLights.testValue()==1);
	}

}
