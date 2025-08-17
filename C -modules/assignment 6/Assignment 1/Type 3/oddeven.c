#include<stdio.h>
void evenodd(int);
void main()
{
	int num;
	printf("enetr the number:");
	scanf("%d",&num);
    evenodd(num);
}

//start
void evenodd(int num)
{

	if(num%2==0){
	
	printf("num is even ");
	}

    else{
    	printf("num is odd ");
	}
}
