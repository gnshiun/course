
import java.io.*;

public class EX10_FileInOutStream
{
   public static void main(String args[]) throws IOException
   {
      FileInputStream fin=new FileInputStream("Xms.gif");
      FileOutputStream fout=new FileOutputStream("Xms_bak.gif"); 
           
      System.out.println("file size="+fin.available()); //檔案大小
      byte data[]=new byte[fin.available()];  

      fin.read(data);      //將圖檔讀入data陣列
      fout.write(data);    //將data陣列裡的資料寫入新檔案
      System.out.println("file copyed and renamed");
      
      fin.close();
      fout.close();      
   }
}