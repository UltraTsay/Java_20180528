import java.io.File;
import java.io.IOException;

public class Path_separate {
	public static void main(String[] args) throws IOException {
		File file = new File("D:"+File.separator+"test.txt");
		if (file.exists()){
			file.delete();
		}else{
			file.createNewFile();
		}
	}
}