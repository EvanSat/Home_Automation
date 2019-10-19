//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitWindows {

	@Test
	void test() {
		System.out.println("\nTesting Windows.....");
		ObserverData observerData = new ObserverData();
		Windows windows = new Windows(observerData);
		observerData.setMeasurements(88, 70, 66, 10);
		assert(windows.testValue()==3);
		observerData.setMeasurements(108, 75, 80, 12);
		assert(windows.testValue()==2);
	}

}
