package noticeboard.command;

import noticeboard.BBS;
import noticeboard.Request;

public class ReadCommand implements Command {
	private BBS bbs;

	public ReadCommand(BBS bbs) {
		this.bbs = bbs;
	}

	@Override
	public void execute(Request req) {
		bbs.displayItem(req);
	}

}
