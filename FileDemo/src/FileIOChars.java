import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileIOChars {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		if (args.length !=2){
			System.out.println("���O���~");
			System.exit(1);
		}	
		File inFile = new File(args[0]);
		if (!inFile.exists()){
			System.out.println("�ɮפ��s�b");
			System.exit(1);
		}	
		File outFile = new File(args[1]);
		if (!outFile.getParentFile().exists()){
			outFile.getParentFile().mkdirs();
		}
		byte[] data = new byte[1024];
		InputStream input = new FileInputStream(inFile);
		OutputStream output = new FileOutputStream(outFile);
		int temp =0;
		while ((temp = input.read(data)) != -1) output.write(data,0 ,temp);
		input.close();
		output.close();
	}
}