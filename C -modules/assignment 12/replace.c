//replace
#include<stdio.h>
#include<string.h>
void main()
{
	char str[]="shubham";
	char ch='u';
	int i=0;
	while(str[i]!='\0')
	{
		if(str[i]==ch){
			str[i]='$';
		}
		printf("%c",str[i]);
		i++;
	}
}