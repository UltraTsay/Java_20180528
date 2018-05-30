import java.io.File;
import java.io.IOException;

public class MkDirs {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("D:" + File.separator + "test1" + File.separator + "test2"+ File.separator + "test.txt");
		if (!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		file.createNewFile();
	}
}