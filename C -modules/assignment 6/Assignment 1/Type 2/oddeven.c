#include<stdio.h>
int oddeven();
void main()
{
	int res=oddeven();
	if(res==1){
		printf("even");
	}else{
		printf("odd");
	}
}

int oddeven()
{
	int a=11;
	if(a%2==0){
	
	return 1;
	}

    else{
    	return 0;
	}
}