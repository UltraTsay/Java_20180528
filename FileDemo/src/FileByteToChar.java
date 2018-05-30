import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class FileByteToChar {
	public static void main(String[] args) throws IOException {
		File file = new File("D:" + File.separator + "test" + File.separator + "test.txt");
		if (!file.getParentFile().exists()) {
			file.getParentFile().mkdir();
		}

		OutputStream out = new FileOutputStream(file);
		Writer w = new OutputStreamWriter(out);
		String str = "Hello World";
		w.write(str);
		w.close();
		out.close();// Ãö³¬¦³¶¶§Ç
	}
}