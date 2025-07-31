//Write a program to check whether a given character is a vowel or consonant.
#include<stdio.h>
void main()
{ 
    char ch;
	printf("enter the any alphabet");
    scanf("%c",&ch);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
		printf("vowels");
	}
	
	else{
		printf("is not vowels");
	}
}