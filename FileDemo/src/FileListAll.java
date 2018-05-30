import java.io.File;

public class FileListAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:" + File.separator);
		list(file);
	}

	public static void list(File file){
		if (file.isDirectory()){
			File[] f = file.listFiles();
			if (f!=null){//防止空目錄產生錯誤
				for (int x=0; x<f.length; x++){
					list(f[x]);
				}
			}
		}else{
			System.out.println(file);
		}
	}
}