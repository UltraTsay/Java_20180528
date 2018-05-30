import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class FileStreamReadDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("D:" + File.separator+"file.txt");
		if (file.exists()){
				InputStream in = new FileInputStream(file);
				StringBuffer buf = new StringBuffer();
				int temp = 0;
			do{
				temp = in.read();
				if (temp != -1) buf.append((char) temp);
			}while (temp != -1);
			in.close();
			System.out.println("Åª¨ú¸ê®Æ¡G["+buf+"]");
		}	
	}
}