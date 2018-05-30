import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("D:"+ File.separator+"file.txt");
		if (!file.getParentFile().exists()){
			file.getParentFile().mkdir();
		}

		Writer out = new FileWriter(file);//Âà«¬
		String str = "Hello World";
		out.write(str);
		out.close();
	}
}