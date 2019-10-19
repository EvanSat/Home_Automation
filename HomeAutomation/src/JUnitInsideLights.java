//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitInsideLights {

	@Test
	void test() {
		System.out.println("\nTesting Inside Lights.....");
		ObserverData observerData = new ObserverData();
		InsideLights insideLights = new InsideLights(observerData);
		observerData.setMeasurements(71, 60, 70, 6);
		assert(insideLights.testValue()==1);
		observerData.setMeasurements(71, 60, 70, 12);
		assert(insideLights.testValue()==2);
		observerData.setMeasurements(75, 61, 78, 13);
		assert(insideLights.testValue()==2);
		observerData.setMeasurements(75, 61, 78, 22);
		assert(insideLights.testValue()==1);
	}

}
