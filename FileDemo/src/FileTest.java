import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream fin;
		try {
			fin = new FileInputStream("d:\\file.txt");
			byte buf[] = new byte[128];//建立一個大小128Byte的緩衝區
			int bufSize = 0;//用來計算讀入的資料大小
			while (fin.available() > 0)
				bufSize = fin.read(buf);//讀取資料到buf內
			System.out.print(new String(buf, 0, bufSize));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}