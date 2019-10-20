
public class CmdButton {

	Command command;
	
	public CmdButton() {}
	
	public void setCmdButton(Command command) {
		this.command = command;
	}
	
	public void press() {
		command.cmdExecute();
	}
}
