#include<stdio.h>
int year();
void main()
{
	int res=year();
	if(res==1){
		printf("leap year");
	}else{
		printf("not leap year");
	}
}
int year()
{
	int year;
	printf("enter the any year:");
	scanf("%d",&year);
	if((year%4==0 && year%100!=0)||(year%400==0))
	{
		return 1;
	}
	else{
		return 0;
	}
}
