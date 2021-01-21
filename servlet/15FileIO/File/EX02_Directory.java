
import java.io.File;

public class EX02_Directory
{
	public static void print(String s)
	{
		System.out.print(s);
	}
	
	public static void main(String[] args)
	{
		String path = "C:/Jdk1.8";	//�w�q�u�@���|
		File file = new File(path);	//�إ��ɮ����O
        if(file.isDirectory())        //���լO�_���ؿ�
		{	
			print("�ɮ׸��| " + path + "\n");	//��ܤu�@���|
			String s[] = file.list();	//���o�ؿ������������
			for(int i=0; i<s.length; i++)
			{
				File fn = new File(path + "/" + s[i]);	//�إ߸��|�P�ɦW����
                if(fn.isDirectory())  //�ˬd�O�_���ؿ�
				{	
					print(s[i] + " �O�ؿ�\n");
				}
				else
				{
					print(s[i] + " �O�ɮ�\t");
                    
					print("�ɮפj�p�G" + new File(path + "/" + s[i]).length() + "Bytes\n");
				}
			}
		}
		System.out.println("�L���ؿ�!");
	}
}
