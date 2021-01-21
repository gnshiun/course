
#include <iostream>
#include <cstdlib>
#include <string>

using namespace std;

//物件導向 
class human
{
    private:   
        //屬性
        int head;
        int eyes;
        int nose;
        int ears;
        int mouth;
        
    public:       
        //方法
        void run(int distance)
        {
             cout << "我跑了 " << distance << " 公尺" << endl; 
        }
    
        void jump(int height)
        {
            /*
             *
             */
        }
    
        void eat(string food)
        {
            cout << "The " << food << " is delicious !" << endl;
            //printf("%s%s%s\n","The ",food," is delicious !");
        }
    
        void cry()
        {
            /*
             *
             */
        }
    
        //建構
        human() { /*性別由老天決定*/ }
    
        human(string sex) { /*性別由當事人決定*/ }   
}; 

//程序導向 
void show()
{  
  cout << "Say hi!" << endl; 	
}

//主程式	
int main()  //程式進入點 
{
   human Adam;   
   Adam.run(100);
       
   human *Eve = new human("female");
   Eve->eat("apple");

   system("pause");
   return 0;
}
