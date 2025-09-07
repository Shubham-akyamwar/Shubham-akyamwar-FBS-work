//Write a program to check the string is palindrome or not.

#include<stdio.h>
#include<string.h>

void main()
{
	char str[]="aca";
	int res=strlen(str);
	int flag=0;
	for(int i=0,j=res-1;str[i]!='\0';i++,j--){
		if(str[i]!=str[j]){
			flag=1;
		}
	}
	if(flag==0){
		printf("pallindrome");
	}else{
		printf("not pallindrome");
	}
}