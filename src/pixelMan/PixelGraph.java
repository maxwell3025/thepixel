package pixelMan;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PixelGraph {


	public static void main(String[] args) throws IOException {
		File myFile = new File("C:\\Max\\workspace\\thepixel\\x-y.txt");
		FileOutputStream fos = new FileOutputStream(myFile);
		String content = "1231";
		fos.write(content.getBytes());
		fos.flush();
		fos.close();
	}
}
