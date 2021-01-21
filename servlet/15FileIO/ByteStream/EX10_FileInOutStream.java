
import java.io.*;

public class EX10_FileInOutStream
{
   public static void main(String args[]) throws IOException
   {
      FileInputStream fin=new FileInputStream("Xms.gif");
      FileOutputStream fout=new FileOutputStream("Xms_bak.gif"); 
           
      System.out.println("file size="+fin.available()); //�ɮפj�p
      byte data[]=new byte[fin.available()];  

      fin.read(data);      //�N����Ū�Jdata�}�C
      fout.write(data);    //�Ndata�}�C�̪���Ƽg�J�s�ɮ�
      System.out.println("file copyed and renamed");
      
      fin.close();
      fout.close();      
   }
}