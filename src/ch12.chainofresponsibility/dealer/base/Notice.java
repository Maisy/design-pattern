package dealer.base;

import java.io.Serializable;

public class Notice implements Serializable {

	private static final long serialVersionUID = -5219849862984936060L;
	
	private String code;

	public Notice(String code) {
		super();
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
