import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:" + File.separator + "file.txt");
		if (file.exists()){
			System.out.println("�ɮת��סG" + file.length());
			System.out.println("�ɮץiŪ�G" + file.canRead());
			System.out.println("�ɮץi�g�G" + file.canWrite());
			System.out.println("�ɮץi���G" + file.canExecute());
			System.out.println("�O�_�ɮסG" + file.isFile());
			System.out.println("�O�_�ɮק��G" + file.isDirectory());
			System.out.println("�O�_�ɮק��G" + file.getParentFile().isDirectory());
		}
	}
}