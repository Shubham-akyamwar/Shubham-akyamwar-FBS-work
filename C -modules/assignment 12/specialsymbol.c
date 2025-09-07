//WAP to Take in a String and Replace Every Blank Space with special symbol.

#include<stdio.h>
#include<string.h>

void main()
{
	char str[]="shubham akyamwar";
	for(int i=0;str[i]!='\0';i++){
		if(str[i]==' '){
			printf("#");
		}else{
			printf("%c",str[i]);
		}
	}
	
}