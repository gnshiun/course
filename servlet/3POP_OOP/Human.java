
public class Human
{
    int  head=1;  //屬性
    int  eyes=2;
    int  nose=1;
    int  mouth=1;
    int  ears=2;
     //:
     //:

    //方法
    public void  run(int distance)  
    { 
        System.out.println("我跑了" + distance + "公尺");        
    }
    
    public void  jump(int height) 
    { 
          //...  
    }
    
    public void  eat(String food) 
    { 
        System.out.println("我吃了" + food);        
    }
    
    public void  cry( ) 
    { 
          /*... */
    } 

    //建構
    public Human( )  
    {
            /*
             :
             :
            */  
    }

    public Human(String sex)
    {
            /*
             :
             :
            */  
    }
}

class Born	
{
    public static void main(String[] args)  //程式進入點 
	{
		Human Adam = new Human();
		System.out.print("亞當的眼睛有 ");
		System.out.println( Adam.eyes + " 個");
		System.out.println();
            /*
             :
             :
             :
            */  
        Human Eve;
		Eve = new Human("female");
		System.out.print("夏娃說:" );
        Eve.eat("apple");
		System.out.println();
            /*
             :
             :
             :
            */  
    }
}
