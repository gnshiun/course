
public class Human
{
    int  head=1;  //�ݩ�
    int  eyes=2;
    int  nose=1;
    int  mouth=1;
    int  ears=2;
     //:
     //:

    //��k
    public void  run(int distance)  
    { 
        System.out.println("�ڶ]�F" + distance + "����");        
    }
    
    public void  jump(int height) 
    { 
          //...  
    }
    
    public void  eat(String food) 
    { 
        System.out.println("�ڦY�F" + food);        
    }
    
    public void  cry( ) 
    { 
          /*... */
    } 

    //�غc
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
    public static void main(String[] args)  //�{���i�J�I 
	{
		Human Adam = new Human();
		System.out.print("�ȷ������� ");
		System.out.println( Adam.eyes + " ��");
		System.out.println();
            /*
             :
             :
             :
            */  
        Human Eve;
		Eve = new Human("female");
		System.out.print("�L����:" );
        Eve.eat("apple");
		System.out.println();
            /*
             :
             :
             :
            */  
    }
}
