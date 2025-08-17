#include<stdio.h>
int theage(int);
void main(){
	int age;
	printf("Enter the Age:");
	scanf("%d",&age);
	int res=theage(age);
	if(res==1){
		printf("Child");	
	}else if(res==2)
	{
		printf("teenager");
	}else if(res==3)
	{
		printf("Adult");
	}else{
	    printf("Senior");	
	}
}
int theage(int age)
{
if(age<12){
		return 1;
	}else if (age>=12&&age<=19){
		return 2;
	}else if(age>=20&&age<=59){
		return 3;
		
	}else{
		return 4;
	}
}