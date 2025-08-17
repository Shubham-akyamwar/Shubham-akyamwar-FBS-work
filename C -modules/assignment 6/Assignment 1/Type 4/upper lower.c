#include<stdio.h>
int upperlower(int);
void main()
{
	int ch;
	printf("enter a character= ");
	scanf("%c",&ch);
	int res=upperlower(ch);
	if(res==1){
		printf("upper case");
	}else{
		printf("lower case");
	}
}
int upperlower(int ch)
{

	if(ch>='A'&&ch<='Z'){
		return 1;
	}
	else
	{
		return 0;
	}
}