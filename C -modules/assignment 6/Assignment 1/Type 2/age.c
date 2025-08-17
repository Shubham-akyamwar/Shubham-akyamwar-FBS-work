#include<stdio.h>
int age();
void main()
{
	int res=age();
	if(res==1){
		printf("eligibilty for vote");
	}else{
		printf("not eligibility for vote");
	}
}

int age()
{
		
	int age;
	printf("enter a age= ");
	scanf("%d",&age);
	if(age>18){
		return 1;
	}
	else{
	return 0;
	}
}
