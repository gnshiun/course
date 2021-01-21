
import java.io.*;

public class EX11_DataInputStream
{
    public static void main(String[] args) throws Exception
    {
        String file = "EX11.txt";
        File name = new File(file);
        char ch;
        int unit;
        double price;
        StringBuffer item;
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
              input.readChar();
              price = input.readDouble();
              input.readChar();
              item = new StringBuffer();
              while ( (ch = input.readChar()) != '\t' )
              {
                  item.append(ch);
              }    
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
