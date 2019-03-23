package notepad;

import java.awt.MenuItem;

public class ExitMenuItem extends MenuItem implements Command {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6722309319894045462L;

	public ExitMenuItem(String s) {
		super(s);
	}

	@Override
	public void execute() {
		System.exit(0);
	}

}
