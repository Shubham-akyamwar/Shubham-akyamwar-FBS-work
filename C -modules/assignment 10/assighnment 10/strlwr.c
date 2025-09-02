#include<stdio.h>
#include<string.h>
void main()
{
	char arr[20];
	printf("Enter the charcter:");
	scanf("%s",arr);
	strlwr(arr);
	printf("lower string: %s\n",arr);
}