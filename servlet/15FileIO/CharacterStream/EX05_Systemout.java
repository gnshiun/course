
import java.io.*;

public class EX05_Systemout
{
    public static void main(String[] args) throws IOException
    {
        BufferedWriter output = new BufferedWriter(
                                    new OutputStreamWriter(System.out));
                      
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        output.write(str);       //��X�r��
        //output.write(str,3,10);
        output.newLine();
        output.close();          //������y
    }
}
