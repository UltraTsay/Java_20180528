import java.io.InputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("D:"+ File.separator+"file.txt");
		if (file.exists()) {
			InputStream in = new FileInputStream(file);
			byte[] data = new byte[1024];
			int len = in.read(data);
			in.close();
			System.out.println("Åª¨ú¸ê®Æ¡G\r["+new String(data, 0, len) +"]");
		}
	}
}