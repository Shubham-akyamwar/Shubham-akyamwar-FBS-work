//WAP to Take in Two Strings and Display the Larger String without Using Built-in
//Functions

#include<stdio.h>
int mystrcmp(char*,char*);
void main()
{
	char arr[20];
	char brr[20];
	printf("enter a string :");
	scanf("%s",&arr);
	printf("enter a string :");
	scanf("%s",&brr);
	
int res=mystrcmp(arr,brr);
	if(res==1){
		printf("brr is greater");
	}
	else if(res==-1){
		printf("arr is greate");
	}
	else
	{
		printf("both are same");
	}

}
int mystrcmp(char* arr,char* brr){
	int i=0;
	while(arr[i]!='\0'||brr[i]!='\0'){
		if(arr[i]<brr[i]){
			return 1;
		}
		else if(arr[i]>brr[i]){
				return -1;
		}
		i++;
	}
	return 0;

}
	