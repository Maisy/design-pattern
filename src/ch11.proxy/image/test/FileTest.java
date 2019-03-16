package image.test;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import image.ImageFileCache;

public class FileTest {

	@Test
	public void test() {
		ImageFileCache fileServer = new ImageFileCache();
		try {
			File target = new File("./src/ch11.proxy/sampleFile.txt");

			String data = fileServer.getFile(target);
			System.out.println(data);

			data = fileServer.getFile(target);
			System.out.println(data);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
