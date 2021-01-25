
import java.io.*;

public class EX15_ObjectOutput
{
	public static void main(String argv[])
	{ 
	    String name = "nana";
		int chi = 80;
		int eng = 75;
		int mat = 100;

		Student t1 = new Student(name, chi, eng, mat);
		
        try {
		
            ObjectOutputStream obj = new ObjectOutputStream(
                                         new FileOutputStream("EX15.dat"));
		
			obj.writeObject(t1);
			obj.close();
			System.out.println("成功寫入EX15.dat");
		}
        catch (IOException ie){
		
			System.out.println(ie);
		}
		
    }
}
