
import java.io.*;

public class EX16_ObjectInput
{
	public static void main(String argv[])
	{
		try 
		{
            ObjectInputStream obj = new ObjectInputStream(
                                        new FileInputStream("EX15.dat"));

			Student t2 = (Student) obj.readObject();
			
			System.out.println("My name is " + t2.getName());
			
			//t2.printAllData();
		
			obj.close();
		}
		catch (Exception e)
		{
			System.err.println(e);
		}
	}
}
