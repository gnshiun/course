package date0120;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFigure {

	public static void main(String[] args) {
		String source = "E:\\source\\cat.jpg";
		String target = "E:\\target\\cat.jpg";
		FileInputStream fi;
		FileOutputStream fo;
		byte[] data;
		
		try 
		{
			fi = new FileInputStream(source);
			fo = new FileOutputStream(target);
			data = new byte[fi.available()];
			fi.read(data);
			fo.write(data);
			fi.close();
			fo.close();
			System.out.print("File copy finished.");
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
	}

}
