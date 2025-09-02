#include<stdio.h>
#include<string.h>
void main()
{
	char arr[36]="shubham";
	char brr[10]="akyamwar";
	strncat(arr,brr,5);
	printf("name: %s",arr);
	
}