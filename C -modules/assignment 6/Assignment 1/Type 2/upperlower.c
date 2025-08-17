#include<stdio.h>
int upperlower();
void main()
{
	int res=upperlower();
	if(res==1){
		printf("upper case");
	}else{
		printf("lower case");
	}
}
int upperlower()
{

	int ch;
	printf("enter a character= ");
	scanf("%c",&ch);
	if(ch>='A'&&ch<='Z'){
	return 1;
	}
	else
	{
		return 0;
	}
}