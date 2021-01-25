
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
		System.out.println("姓名：" + name);
		System.out.println("國文：" + chinese);
		System.out.println("英文：" + english);
		System.out.println("數學：" + math);
		System.out.println("平均：" + avgScore());		
	}
}
