#include<stdio.h>
void voting(int);
void main()
{
	int age;
	printf("enter a age= ");
	scanf("%d",&age);
	voting(age);
}
void voting(int age)
{
if(age>=18){
		printf("eligible for voting");
	}
	else{
		printf("not eligible for voting");
	}
}