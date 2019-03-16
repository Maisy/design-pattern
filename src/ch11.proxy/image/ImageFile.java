package image;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ImageFile implements FileParent {

	@Override
	public String getFile(File file) throws IOException {
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		StringBuffer rst = new StringBuffer();
		String line;
		while ((line = br.readLine()) != null) {
			rst.append(line);
		}
		br.close();
		return rst.toString();
	}

}
