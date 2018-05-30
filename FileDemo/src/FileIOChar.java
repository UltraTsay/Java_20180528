import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileIOChar {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		if (args.length !=2){
			System.out.println("指令錯誤");
			System.exit(1);
		}	
		File inFile = new File(args[0]);
		if (!inFile.exists()){
			System.out.println("檔案不存在");
			System.exit(1);
		}	
		File outFile = new File(args[1]);
		if (!outFile.getParentFile().exists()){
			outFile.getParentFile().mkdirs();
		}
		InputStream input = new FileInputStream(inFile);
		OutputStream output = new FileOutputStream(outFile);
		int temp =0;
		while ((temp = input.read()) != -1) output.write(temp);
		input.close();
		output.close();
	}
}