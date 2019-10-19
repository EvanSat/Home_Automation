
public class WindowsFullOpen implements WindowState{

	Windows windows;
	
	public WindowsFullOpen(Windows windows) {
		this.windows = windows;
	}
	
	public void windowsFullOpen() {
		System.out.println("Windows are already open");
		
	}

	public void windowsHalfwayOpen() {
		System.out.println("Windows were closed halfway");
		windows.setState(windows.getWindowsHalfwayState());
		
	}

	public void windowsClose() {
		System.out.println("Windows were closed all the way");
		windows.setState(windows.getWindowCloseState());
		
	}

}
