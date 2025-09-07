//WAP to Remove the Characters of Odd Index Values in a String

#include<stdio.h>
#include<string.h>

void main()
{
	char str[]="shubham";
	for(int i=0;str[i]!='\0';i++){
		if(i%2==0){
			printf("%c",str[i]);
		}
	}
}