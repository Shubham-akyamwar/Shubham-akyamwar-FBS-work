#include <stdio.h>
void calculator(double a,double b,char oper);
int main() {
    double a, b,result;
    char oper;
    printf("Enter first number: ");
    scanf("%lf", &a);

    printf("Enter second number: ");
    scanf("%lf", &b);

    printf("Enter any operator (+, -, *, /): ");
    scanf(" %c", &oper); 
    calculator(a,b,oper);
}
void calculator(double a,double b,char oper)
{double result;
if(oper=='+')
    {
    	result=a+b;
    	printf("addition is :%lf",result);
	}
	else
	{
		if(oper=='-')
	    {
	      result=a-b;
    	  printf("subtraction is :%lf",result);
        }
        
        if(oper=='*')
	    {
	      result=a*b;
    	  printf("multiplication is :%lf",result);
        }
        
        if(oper=='/')
	    {
	      result=a/b;
    	  printf("division is :%lf",result);
        }
        
        if(oper=='%')
	    {
	      result=(int) a%(int) b;
    	  printf("mod is : %d",result);
		}
    	  
        else
        {
        	printf("enter a valid operator");
		}   
	} 
}