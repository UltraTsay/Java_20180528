import java.io.File;

public class FileList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:" + File.separator);
		if (file.isDirectory()){
			String[] str1 = file.list();
			for (int x=0; x<str1.length; x++){
				System.out.println(str1[x]);
			}
			File[] str2 = file.listFiles();
			for (int x=0; x<str2.length; x++){
				System.out.println(str2[x]);
			}
		}
	}
}