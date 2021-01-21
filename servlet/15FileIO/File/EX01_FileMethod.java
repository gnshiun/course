
import java.io.File;

public class EX01_FileMethod
{
	public static void myPrint(String s) 
	{
		System.out.print(s);
	}

	public static void main(String[] args)
	{
		File file = new File("C:\Java\Work\Ex801_FileMethod.java");
		
		myPrint("�ɮצW�١G" + file.getName() + "\n");	     //���o�ɮצW��
		//myPrint("�ɮ׸��|�G" + file.getPath() + "\n");	     //���o�ɮ׸��|
		myPrint("������|�G" + file.getAbsolutePath() + "\n"); //���o������|
		myPrint("�ؿ���m�G" + file.getParent() + "\n");	     //���o�W�h�ؿ��W��
		myPrint("�ɮפj�p�G" + file.length() + " bytes\n");	 //���o�ɮפj�p
		myPrint("�̫�ק�G" + file.lastModified() + "\n");	 //���o�̫�ק�ɶ�
		myPrint("�O�_�s�b�G");
		myPrint(file.exists() ? "�s�b\n" : "���s�b\n");	     //�ˬd�O�_�s�b
		myPrint("�i�_Ū���G");
		myPrint(file.canRead() ? "�iŪ��\n" : "���iŪ\n");	 //�ˬd�O�_�iŪ��
		myPrint("�i�_�g�J�G");
		myPrint(file.canWrite() ? "�i�g�J\n" : "���i�g\n");	 //�ˬd�O�_�i�g�J
	}
}
