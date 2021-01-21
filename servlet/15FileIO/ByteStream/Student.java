
import java.io.*;

public class Student implements Serializable
{
	private String name;
	private int chinese;
	private int english;
    private int math;
    //private transient int math;
    
    public Student(String name, int chinese, int english, int math)
	{
		this.name = name;
		this.chinese = chinese;
		this.english = english;
		this.math = math;
	}
	
	public String getName()
	{
	    return this.name;
	}
	   
	public double avgScore()
	{
		return (chinese+english+math)/3.0;
	}
	
	public void printAllData()
	{
		System.out.println("�m�W�G" + name);
		System.out.println("���G" + chinese);
		System.out.println("�^��G" + english);
		System.out.println("�ƾǡG" + math);
		System.out.println("�����G" + avgScore());		
	}
}
