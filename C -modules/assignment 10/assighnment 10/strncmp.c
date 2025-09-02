#include<stdio.h>
#include<string.h>
void main()
{
	char arr[]="shubham";
	char brr[]="shubz";
	int res= strncmp(arr,brr,5);
	
	if(res==0){
		printf("charcater is same:\n");
	}else {
		printf("character is not same:\n");
	}
}