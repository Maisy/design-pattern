package noticeboard.command;

import noticeboard.BBS;
import noticeboard.Request;

public class ListCommand implements Command {
	private BBS bbs;

	public ListCommand(BBS bbs) {
		this.bbs = bbs;
	}

	@Override
	public void execute(Request req) {
		bbs.displaylist(req);
	}

}
