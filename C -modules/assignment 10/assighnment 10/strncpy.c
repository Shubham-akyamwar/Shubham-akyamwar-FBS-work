#include<stdio.h>
#include<string.h>
void main()
{
	char str[10]="firstbit";
	char temp[10];
	strncpy(temp,str,5);
	temp[5]='\0';
	printf("temp: %s",temp);
}