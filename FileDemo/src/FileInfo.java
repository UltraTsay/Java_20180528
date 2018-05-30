import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:" + File.separator + "file.txt");
		if (file.exists()){
			System.out.println("檔案長度：" + file.length());
			System.out.println("檔案可讀：" + file.canRead());
			System.out.println("檔案可寫：" + file.canWrite());
			System.out.println("檔案可執：" + file.canExecute());
			System.out.println("是否檔案：" + file.isFile());
			System.out.println("是否檔案夾：" + file.isDirectory());
			System.out.println("是否檔案夾：" + file.getParentFile().isDirectory());
		}
	}
}