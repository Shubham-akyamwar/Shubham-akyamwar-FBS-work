#include<stdio.h>
#include<string.h>
void main()
{
	char arr[30];
	printf("Enter the charcter:");
	scanf("%s",arr);
	strrev(arr);
	printf("reversed charcter: %s\n",arr);
}