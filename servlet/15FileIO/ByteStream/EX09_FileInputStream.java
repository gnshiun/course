
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
		
		print("總位元組數：" + (size = file.available()));//顯示位元組總數
		print("讀取 " + size + " 位元組....");	    //顯示讀取的位元組數
		byte[] data = new byte[size];	            //宣告記憶體緩衝器
		
		if(file.read(data) != size)		            //若讀取資料 != size
		{
			print("不能讀取 " + size + " 位元組");	//顯示讀取不足訊息
		}	
		
		print(new String(data, 0, size));	        //顯示讀取資料
		file.close();
	}
}