#include<stdio.h>
#include<string.h>
void main()
{
	char arr[20];
	printf("Enter the charcter:");
	scanf("%s",arr);
	strupr(arr);
	printf("upper string :%s\n",arr);
}