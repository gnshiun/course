
import java.io.*;

public class EX11_DataOutputStream
{
    public static void main(String[] args) throws Exception
    {
        String file = "EX11.txt";
        
        //4筆3欄
        int[] units = {2,12,1,10};
        double[] prices = {580.0,150.0,50.0,80.0};
        String[] items = {"Java SE","Pen","直尺","Apple"};
        
	    //建立DataOutputStream的輸出串流物件
        DataOutputStream output = new DataOutputStream(
                                      new FileOutputStream(file));
                                      
        System.out.println("正在寫入檔案..." + file);
        
        for ( int i = 0; i < 4; i++)
        {
           output.writeInt(units[i]);   //寫入資料
           output.writeChar('\n');
           output.writeDouble(prices[i]);
           output.writeChar('\r');
           output.writeChars(items[i]);
           output.writeChar('\t');
        }
        output.close();                //關閉串流
    }
}
