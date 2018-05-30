import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("D:" + File.separator + "test" + File.separator + "test.txt");
		if (file.exists()) {
			Reader in = new FileReader(file);
			char[] data = new char[1024];
			int len = in.read(data);
			in.close();
			System.out.println("Åª¨ú¸ê®Æ¡G[" + new String(data, 0, len) + "]");
		}
	}
}