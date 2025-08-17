#include<stdio.h>
void leapyear(int);
void main(){
	int year;
	printf("enter the any year:");
	scanf("%d",&year);
	leapyear(year);	
}

void leapyear(int year){

if((year%4==0 && year%100!=0)||(year%400==0))
	{
		printf("year is leap");
	}
	else{
		printf("not leap year");
	}
}