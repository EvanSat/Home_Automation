
public class WindowsClose implements WindowState{

	Windows windows;
	
	public WindowsClose(Windows windows) {
		this.windows = windows;
	}
	
	public void windowsFullOpen() {
		System.out.println("Windows were opened all the way");
		windows.setState(windows.getWindowsFullOpen());
		
	}
	
	public void windowsHalfwayOpen() {
		System.out.println("Windows were opened halfway");
		windows.setState(windows.getWindowsHalfwayState());
		
	}

	public void windowsClose() {
		System.out.println("Windows are already closed");
		
	}

}
