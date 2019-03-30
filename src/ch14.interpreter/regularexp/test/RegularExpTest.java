package regularexp.test;

import java.io.IOException;

import regularexp.AndExp;
import regularexp.LiteralExp;
import regularexp.OrExp;
import regularexp.RegularExp;

public class RegularExpTest {

	public static void main(String[] args) throws IOException {
		String searchStr = "(Bindings&IDEAA)";
		RegularExp pRegExp = createRegularExp(searchStr);
		if (pRegExp == null) {
			System.out.println("search pattern error");
			return;
		}
		if (pRegExp.match("Use IntelliJ IDEA Key Bindings Use Eclipse Key Bindings")) {
			System.out.println("found the search string");
		} else {
			System.out.println("Not exist the search string");
		}

	}

	public static RegularExp createRegularExp(String searchStr) {
		int len = searchStr.length();
		if (len == 0)
			return null;
		else {
			System.out.println("==> " + searchStr);
		}

		int pos = searchStr.indexOf("(");
		if (pos > -1) {
			int parentCnt = 1;

			for (int i = pos + 1; i < len; i++) {
				if (searchStr.charAt(i) == '(')
					parentCnt++;
				else if (searchStr.charAt(i) == ')')
					parentCnt--;

				if (parentCnt == 0) {
					int nextOpPos = searchStr.indexOf("&");
					int nextOpPos2 = searchStr.indexOf("|");
					if (nextOpPos > -1) {
						return new AndExp(createRegularExp(searchStr.substring(pos + 1, nextOpPos)),
								createRegularExp(searchStr.substring(nextOpPos + 1, len - 1)));
					} else if (nextOpPos2 > -1) {
						return new OrExp(createRegularExp(searchStr.substring(pos + 1, nextOpPos2)),
								createRegularExp(searchStr.substring(nextOpPos2 + 1, len - 1)));
					}
				}
			}
			return null;
		} else if (pos > -1 && searchStr.charAt(pos) == '&') {
			if (pos >= len - 1)
				return null;

			return new AndExp(createRegularExp(searchStr.substring(0, pos)),
					createRegularExp(searchStr.substring(pos + 1, len - 1)));
		} else if (pos > -1 && searchStr.charAt(pos) == '|') {
			if (pos >= len - 1)
				return null;

			return new OrExp(createRegularExp(searchStr.substring(0, pos)),
					createRegularExp(searchStr.substring(pos + 1, len - 1)));
		} else {
			return new LiteralExp(searchStr);
		}
	}
}
