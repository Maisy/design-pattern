package noticeboard.command;

import noticeboard.Request;
import noticeboard.UserManager;

public class LoginCommand implements Command {
	private UserManager usermanager;

	public LoginCommand(UserManager userMan) {
		this.usermanager = userMan;
	}

	@Override
	public void execute(Request req) {
		usermanager.checkPasswd(req);
	}

}
