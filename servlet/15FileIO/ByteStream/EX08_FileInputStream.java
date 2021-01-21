
import java.io.*;

public class EX08_FileInputStream 
{
	public static void main(String argv[]) throws Exception
	{
        FileInputStream file = new FileInputStream("EX08_FileInputStream.java");
        StringBuilder str=new StringBuilder();
        byte[] tmp=new byte[1]; 
        int c;
               
		try {
		  
		    do {             
			    c=file.read(tmp);
                str.append(new String(tmp));
            }while(c==1);
            
			System.out.print(new String(str));
			
		} catch (IOException e){}
		finally {
            file.close();  
        }
    }
}