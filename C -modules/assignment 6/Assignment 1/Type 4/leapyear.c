#include<stdio.h>
int leapyear(int);
void main(){
	int year;
	printf("enter the any year:");
	scanf("%d",&year);
	int res=leapyear(year);
	if(res==1){
		printf("leap year");
	}else{
		printf("not leap year");
	}
}	
int leapyear(int year)
{

if((year%4==0 && year%100!=0)||(year%400==0))
	{
		return 1;
	}
	else{
		return 0;
	}
}