import java.io.File;
import java.io.IOException;

public class MkDir {
	public static void main(String[] args) throws IOException {
		File file = new File("D:" + File.separator + "test" + File.separator + "test.txt");
		if (!file.getParentFile().exists()){
			file.getParentFile().mkdir();
		}
		file.createNewFile();
	}
}