import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream fin;
		try {
			fin = new FileInputStream("d:\\file.txt");
			byte buf[] = new byte[128];//�إߤ@�Ӥj�p128Byte���w�İ�
			int bufSize = 0;//�Ψӭp��Ū�J����Ƥj�p
			while (fin.available() > 0)
				bufSize = fin.read(buf);//Ū����ƨ�buf��
			System.out.print(new String(buf, 0, bufSize));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}