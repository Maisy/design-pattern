package notepad;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.MenuItem;

public class OpenMenuItem extends MenuItem implements Command {

	/**
	 * 
	 */
	private static final long serialVersionUID = 822677318855211935L;
	private Frame frame;

	public OpenMenuItem(String s, Frame frame) {
		super(s);
		this.frame = frame;
	}

	@Override
	public void execute() {
		FileDialog dialog = new FileDialog(frame, "Open", FileDialog.LOAD);
		dialog.setVisible(true);
		String fileName = dialog.getFile();

		System.out.println(fileName);
	}

}
