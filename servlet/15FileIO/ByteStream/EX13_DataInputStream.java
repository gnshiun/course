
import java.io.*;

public class EX13_DataInputStream
{
    public static void main(String[] args) throws Exception
    {
        String file = "EX13.txt";
        File name = new File(file);
        char ch;
        int unit;
        double price;
        String item;
        System.out.println("�ɮ׸��|: " + name.getAbsolutePath());
        //�إ�DataInputStream����J��y����
        DataInputStream input = new DataInputStream(
                                    new FileInputStream(name));
        try
        {                         
           while (true)
           {
              //Ū�����
              unit = input.readInt();
              price = input.readDouble();
              item = input.readUTF();

              System.out.println("�ƶq: " + unit);
              System.out.println("���: " + price);
              System.out.println("�W��: " + item);
              System.out.println();
           }  
        }
        catch(EOFException e)
        {
           input.close();          //������y
        }
    }
}