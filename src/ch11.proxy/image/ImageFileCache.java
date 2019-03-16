package image;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.PriorityQueue;

public class ImageFileCache implements FileParent {
	int MAX_CACHE_COUNT = 5;

	PriorityQueue<FileInfo> lruInfoList;
	HashMap<String, Stat> fileStatList;
	HashMap<String, String> fileCache;

	public ImageFileCache() {
		lruInfoList = new PriorityQueue<>((a, b) -> a.lastReadTime > b.lastReadTime ? 1 : -1);
		fileStatList = new HashMap<>();
		fileCache = new HashMap<>();
	}

	@Override
	public String getFile(File file) throws IOException {
		String fileName = file.getName();
		Stat curSt = fileStatList.get(fileName);

		if (curSt == null || curSt.mTime != file.lastModified()) {
			ImageFile f = new ImageFile();
			registerCache(file, f.getFile(file));
			System.out.println("Read a file from disk");
		}
		return fileCache.get(fileName);
	}

	private void registerCache(File file, String data) {
		String fileName = file.getName();
		if (lruInfoList.size() > MAX_CACHE_COUNT) {
			FileInfo removeFile = lruInfoList.poll();
			fileCache.remove(removeFile.fileName);
			fileStatList.remove(removeFile.fileName);
		}

		Stat curSt = fileStatList.get(file);
		if (curSt == null) {
			curSt = new Stat();
		}
		curSt.mTime = file.lastModified();

		fileStatList.put(fileName, curSt);
		fileCache.put(fileName, data);
		lruInfoList.add(new FileInfo(fileName, new Date().getTime()));

	}

}
