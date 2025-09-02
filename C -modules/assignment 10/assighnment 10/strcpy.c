#include<stdio.h>
#include<string.h>
void main()
{
	char str[10]="shubham";
	char temp[10];
	strcpy(temp,str);
	printf("str: %s\n",str);
	printf("temp: %s\n",temp);
}