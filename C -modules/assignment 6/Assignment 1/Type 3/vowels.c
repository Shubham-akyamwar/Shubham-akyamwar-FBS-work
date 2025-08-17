#include<stdio.h>
void vowels(char);
void main()
{ 
    char ch;
	printf("enter the any alphabet:");
    scanf("%c",&ch);
    vowels(ch);
}
void vowels(char ch)
{
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
		printf("vowels");
	}
	
	else{
		printf("is not vowels");
	}
}