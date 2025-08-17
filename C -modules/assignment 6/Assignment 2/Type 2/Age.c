#include<stdio.h>
int Age();
void main()
{
	int res=Age();
	
	if(res==1){
	printf("child");
	}else if(res==2)
	{
		printf("teenager");
	}else if(res==3)
	{
		printf("adult");
	}else {
		printf("senior");
	}
}
int Age(){
	int age;
	printf("Enter the Age:");
	scanf("%d",&age);

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