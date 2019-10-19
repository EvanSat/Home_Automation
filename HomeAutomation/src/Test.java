
public class Test {

	public static void main(String[] args) {
		ObserverData observerData = new ObserverData();
		
		@SuppressWarnings("unused")
		OutsideLights outsideLights = new OutsideLights(observerData);
		@SuppressWarnings("unused")
		InsideLights insideLights = new InsideLights(observerData);
		@SuppressWarnings("unused")
		Shades shades = new Shades(observerData);
		@SuppressWarnings("unused")
		Windows windows = new Windows(observerData);
		
		// (Outside Temp., Inside Temp, Desired Inside Temp, Time in Hours)
		observerData.setMeasurements(71, 60, 68, 5);
		System.out.println();
		observerData.setMeasurements(90, 64, 70, 10);
		System.out.println();
		observerData.setMeasurements(103, 75, 65, 13);
		System.out.println();
		observerData.setMeasurements(54, 75, 70, 20);
		System.out.println();
		Shades.staticShadesUp(shades);
		System.out.println();
		observerData.setMeasurements(54, 75, 70, 12);
		System.out.println();
	}
}
