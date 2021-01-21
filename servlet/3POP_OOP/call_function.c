
#include <stdio.h>

void show_result()
{
	/* ºâ³N¹Bºâ²Å¸¹ */ 
	int a=21,b=5;
	printf("a=21,b=5\n\n");
	
    printf("a+b = %d\n",a+b);
    printf("a-b = %d\n",a-b);
    printf("a*b = %d\n",a*b);
    printf("a/b = %d\n",a/b);
    printf("a%b = %d\n",a%b);     
}     

int sum(int n)
{
    int x,total=0;
    for(x=1; x<=n; x++)
       total += x;
       
    return total;
}    

int main()
{	   
    int result;
    result=sum(100);  // call function
    printf("1+2+...+n=%d\n",result);

    return 0;
} 
