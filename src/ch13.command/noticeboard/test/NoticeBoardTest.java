package noticeboard.test;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import noticeboard.BBS;
import noticeboard.Request;
import noticeboard.UserManager;
import noticeboard.command.Command;
import noticeboard.command.ListCommand;
import noticeboard.command.LoginCommand;
import noticeboard.command.ReadCommand;

public class NoticeBoardTest {
	private BBS bbs;
	private UserManager userman;
	private HashMap<String, Command> reqCmd;

	private String CMD_LOGIN = "LOGIN";
	private String CMD_BBS_LIST = "BBS_LIST";
	private String CMD_BBS_READ = "BBS_READ";

	@Test
	public void test() {
		userman = new UserManager();
		bbs = new BBS();
		registerCommand();

		ArrayList<String> cmdList = new ArrayList<>();
		cmdList.add(CMD_LOGIN);
		cmdList.add(CMD_BBS_LIST);
		cmdList.add(CMD_BBS_READ);

		cmdList.stream().forEach(cmdStr -> {
			Request req = new Request();
			Command cmd = reqCmd.get(cmdStr);
			if (cmd != null) {
				cmd.execute(req);
			} else {
				System.out.println("Not available command " + cmdStr);
			}
		});

	}

	private void registerCommand() {
		reqCmd = new HashMap<>();
		reqCmd.put(CMD_LOGIN, new LoginCommand(userman));
		reqCmd.put(CMD_BBS_LIST, new ListCommand(bbs));
		reqCmd.put(CMD_BBS_READ, new ReadCommand(bbs));
	}

}
