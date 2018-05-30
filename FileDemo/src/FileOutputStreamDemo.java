import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("D:" + File.separator + "test.txt");
		if (!file.getParentFile().exists()){
			file.getParentFile().mkdir();
		}
		OutputStream out = new FileOutputStream(file);
		String str = "Hello World";
		byte[] data = str.getBytes();
		out.write(data);
		out.close();
	}
}