
import java.io.*;

public class EX06_PrintWriter
{
    public static void main(String[] args) throws Exception
    {
        PrintWriter output=new PrintWriter(
                               new FileWriter("EX06.txt"));
        int i,j,k;                   
        for (i=1;i<=5;i++)
        {
           for (j=0;j<5-i;j++)
           {
              output.print(" ");
           }   
           for (k=1;k<=i*2-1;k++)
           {
              output.print("*"); 
           }   
           output.println();
           //output.print('\n');
        }
        output.println("���\�g�J");
        output.close();
        
        System.out.println("���\�g�JEX06.txt");
    }
}
