package notepad;

import java.awt.MenuItem;
import java.awt.TextArea;

public class NewMenuItem extends MenuItem implements Command {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1133525692503025906L;
	private TextArea text;

	public NewMenuItem(String s, TextArea text) {
		super(s);
		this.text = text;
	}

	@Override
	public void execute() {
		text.setText(null);
	}

}
