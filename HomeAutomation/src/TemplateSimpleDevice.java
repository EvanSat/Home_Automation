// Unused Class as the Template did not work out

public abstract class TemplateSimpleDevice {
	
	private float externalTemperature;
	private float internalTemperature;
	private float desiredInternalTemp;
	private int hour;
	private int testValue;

	abstract void setState();
	
	public void setTestValue(int testValue) {
		this.testValue = testValue;
	}
	
}
