
import java.io.*;

public class EX03_WriteText
{
    public static void main(String[] args) throws Exception
    {
        String file = "EX03.txt";
        String str1 = "ABCDEFGHIJKLMNO";
        String str2 = "This is a book.\n";
        FileWriter output = new FileWriter(file);            
        /* BufferedWriter output = new BufferedWriter(
                                      new FileWriter(file)); */
        System.out.println("���b�g�J�ɮ�..." + file);
        output.write(str1);
        //output.newLine();   //���C
        output.write(str2);
        //output.newLine();
        output.write(str1,3,8);
        //output.newLine();
        output.close();
    }
}
