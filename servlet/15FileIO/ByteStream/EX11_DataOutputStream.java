
import java.io.*;

public class EX11_DataOutputStream
{
    public static void main(String[] args) throws Exception
    {
        String file = "EX11.txt";
        
        //4��3��
        int[] units = {2,12,1,10};
        double[] prices = {580.0,150.0,50.0,80.0};
        String[] items = {"Java SE","Pen","����","Apple"};
        
	    //�إ�DataOutputStream����X��y����
        DataOutputStream output = new DataOutputStream(
                                      new FileOutputStream(file));
                                      
        System.out.println("���b�g�J�ɮ�..." + file);
        
        for ( int i = 0; i < 4; i++)
        {
           output.writeInt(units[i]);   //�g�J���
           output.writeChar('\n');
           output.writeDouble(prices[i]);
           output.writeChar('\r');
           output.writeChars(items[i]);
           output.writeChar('\t');
        }
        output.close();                //������y
    }
}
