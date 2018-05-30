import java.io.File;
import java.io.IOException;

public class File_Create_Delete {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("D:\\file.txt");
		if (file.exists()){
			file.delete();
		}else{
			file.createNewFile();
		}
	}
}