#include<stdio.h>
int voting(int);
void main()
{
	int age;
	printf("enter a age= ");
	scanf("%d",&age);
	int res=voting(age);
	if(res==1){
		printf("eligible for voting");
	}else{ 
		printf("not eligible for voting");
	}
}
int voting(int age)	
{
if(age>=18){
		return 1;
	}
	else{
		return 0;
	}
}