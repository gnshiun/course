
import java.io.*;

public class EX14_PrintStream
{
    public static void main(String[] args) throws Exception
    {
        PrintStream output=new PrintStream(
                               new FileOutputStream("EX14.txt"));
                               
        int sum=0;
        for (int i=1;i<=100;i++)
        {
            sum+=i;
        }    
        
        output.println("1+2+...+100=" + sum);
        output.printf("1+2+...+100=%d",sum); 
        //output.println("1+2+...+100=" + sum);
        System.out.println("成功寫入EX14.txt");
        output.close();
    }
}             