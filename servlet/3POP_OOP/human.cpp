
#include <iostream>
#include <cstdlib>
#include <string>

using namespace std;

//����ɦV 
class human
{
    private:   
        //�ݩ�
        int head;
        int eyes;
        int nose;
        int ears;
        int mouth;
        
    public:       
        //��k
        void run(int distance)
        {
             cout << "�ڶ]�F " << distance << " ����" << endl; 
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
    
        //�غc
        human() { /*�ʧO�ѦѤѨM�w*/ }
    
        human(string sex) { /*�ʧO�ѷ�ƤH�M�w*/ }   
}; 

//�{�ǾɦV 
void show()
{  
  cout << "Say hi!" << endl; 	
}

//�D�{��	
int main()  //�{���i�J�I 
{
   human Adam;   
   Adam.run(100);
       
   human *Eve = new human("female");
   Eve->eat("apple");

   system("pause");
   return 0;
}
