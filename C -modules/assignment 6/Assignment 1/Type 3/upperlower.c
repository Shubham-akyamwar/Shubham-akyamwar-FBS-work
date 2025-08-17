#include<stdio.h>
void upperlower(int);
void main()
{
	int ch;
	printf("enter a character= ");
	scanf("%c",&ch);
	upperlower(ch);
}
void upperlower(int ch)
{
	if(ch>='A'&&ch<='Z'){
		printf("character is upper");
	}
	else
	{
		printf("character is lower");
	}
}