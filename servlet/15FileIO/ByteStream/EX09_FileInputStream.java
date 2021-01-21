
import java.io.*;

public class EX09_FileInputStream
{
	static void print(String s)
	{	
		System.out.println(s);
	}

	public static void main(String[] args) throws Exception
	{
		int size;
		FileInputStream file = new FileInputStream("EX09_FileInputStream.java");
		
		print("�`�줸�ռơG" + (size = file.available()));//��ܦ줸���`��
		print("Ū�� " + size + " �줸��....");	    //���Ū�����줸�ռ�
		byte[] data = new byte[size];	            //�ŧi�O����w�ľ�
		
		if(file.read(data) != size)		            //�YŪ����� != size
		{
			print("����Ū�� " + size + " �줸��");	//���Ū�������T��
		}	
		
		print(new String(data, 0, size));	        //���Ū�����
		file.close();
	}
}