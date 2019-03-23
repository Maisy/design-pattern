package noticeboard.command;

import noticeboard.Request;

public interface Command {
	public void execute(Request req);
}
