
import java.io.*;

public class EX06_2_InputStr
{
    public static void main(String[] args) throws IOException
	{
        String name;				
		BufferedReader keyin = new BufferedReader(
			                             new InputStreamReader(System.in));
        
		System.out.print("姓名: ");
		name = keyin.readLine();
			
		System.out.println();	
		System.out.println("你輸入的姓名是: " + name + '\n');

	}
}
