
import java.io.*;

public class EX12_DataInputStream
{
    public static void main(String[] args) throws Exception
    {
        String file = "EX12.txt";
        File name = new File(file);
        char ch;
        int unit;
        double price;
        StringBuffer item;
        System.out.println("�ɮ׸��|: " + name.getAbsolutePath());
        //�إ�DataInputStream����J��y����
        DataInputStream input = new DataInputStream(
                                    new FileInputStream(name));
        try {
                                 
            while(true)
            {
                //Ū�����
                
                /*
                 
                    Instert code to here
                    
                */
                System.out.println("�ƶq: " + unit);
                System.out.println("���: " + price);
                System.out.println("�W��: " + item);
                System.out.println();
            }  
        }
        catch(EOFException e){
        
           input.close();          //������y
        }
    }
}
