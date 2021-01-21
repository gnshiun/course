
import java.io.*;

public class EX07_FileOutputStream
{
	static void print(String s) 
	{	
		System.out.print(s);
	}

	public static void main(String[] args) throws IOException
	{
        String aphorism = "You will never win, if you never begin.";
        byte[] data = aphorism.getBytes();	
			           
        System.out.println("正在寫入檔案...EX07.txt");
        
        OutputStream file1 = new FileOutputStream("EX07.txt");	      
		for(int i=0; i<data.length; i++)
		{
			file1.write(data[i]);
		}
				
		FileOutputStream file2 = new FileOutputStream("EX07.txt");	
		file2.write(data);
			      
		FileOutputStream file3 = new FileOutputStream("EX07.txt");	
		file3.write(data, 0, 18);	
		
		file1.close();	
		file2.close();
		file3.close();
	}
}