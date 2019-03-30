package member;

import java.io.Serializable;

public class Member implements Serializable {

	private String id, name, sid;
	private int gender;

	public Member(String id, String name, String sid, int gender) {
		super();
		this.id = id;
		this.name = name;
		this.sid = sid;
		this.gender = gender;
	}

}
