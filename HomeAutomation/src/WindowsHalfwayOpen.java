
public class WindowsHalfwayOpen implements WindowState{

	Windows windows;
	
	public WindowsHalfwayOpen (Windows windows) {
		this.windows = windows;
	}
	
	public void windowsFullOpen() {
		System.out.println("Windows were opened all the way");
		windows.setState(windows.getWindowsFullOpen());
		
	}

	public void windowsHalfwayOpen() {
		System.out.println("Windows are already halfway open");
				
	}

	public void windowsClose() {
		System.out.println("Windows were closed all the way");
		windows.setState(windows.getWindowCloseState());
		
	}

}
