//Write a program to check whether a given character is uppercase or lowercase.
#include<stdio.h>
void main()
{
	int ch;
	printf("enter a character= ");
	scanf("%c",&ch);
	if(ch>'A'&&'Z'){
		printf("character is upper");
	}
	else
	{
		printf("character is lower");
	}
}