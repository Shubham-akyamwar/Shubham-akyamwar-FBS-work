#include<stdio.h>
#include<string.h>
void main()
{
	char arr[30],brr[20];
	printf("Enter the arr:");
	scanf("%s",arr);
	printf("Enter the brr:");
	scanf("%s",brr);
	int res=strcmp(arr,brr);
	if(res==0){
		printf("both equal ");
	}else if(res>=0){
		printf("arr is greater:\n");
	}else{
		printf("brr is greater:\n");
	}
}