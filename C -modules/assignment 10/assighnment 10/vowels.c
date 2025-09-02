#include<stdio.h>
#include<string.h>
void main()
{
	char str[]="shantanu";
	int i=0;
	
	while(str[i]!='\0')
	{
		char ch=str[i];
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			printf("%c",ch);
		}
		i++;
		
	}
}