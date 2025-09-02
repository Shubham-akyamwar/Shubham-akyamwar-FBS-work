#include<stdio.h>
#include<string.h>
void main()
{
	char str="first";
//	char ch="r";
	char* res=strchr(str,'r');
	
	if(res!='\0'){
		printf("charcter %d is found \n",res-str);
	}else{
		printf("charcter %c is not found\n");
	}	
}