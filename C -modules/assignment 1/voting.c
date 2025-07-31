//Write a program to check whether a person is eligible to vote (age = 18).
#include<stdio.h>
void main()
{
	int age;
	printf("enter a age= ");
	scanf("%d",&age);
	if(age>18){
		printf("eligible for voting");
	}
	else{
		printf("not eligible for voting");
	}
	
}