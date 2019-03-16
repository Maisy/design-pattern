package image;

public class FileInfo {
	String fileName;
	long lastReadTime;
	String data;

	public FileInfo(String fn, long lastReadTime) {
		super();
		this.fileName = fn;
		this.lastReadTime = lastReadTime;
	}

}
