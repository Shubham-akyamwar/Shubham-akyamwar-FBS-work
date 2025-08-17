#include<stdio.h>
int oddeven(int);
void main()
{
	int num;
	printf("enetr the number:");
	scanf("%d",&num);
	int res=oddeven(num);
	if(res==1){
		printf("even");
	}else{
		printf("odd");
	}
}
int oddeven(int num)
{	 	
	if(num%2==0){
	
	return 1;
	}

    else{
    	return 0;
	}
}