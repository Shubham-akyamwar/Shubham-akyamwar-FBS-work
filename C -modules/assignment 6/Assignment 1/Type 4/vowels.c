#include<stdio.h>
int vowels(char);
void main()
{ 
    char ch;
	printf("enter the any alphabet:");
    scanf("%c",&ch);
	int res=vowels(ch);
	if(res==1){
		printf("vowels");
	}else{
		printf("not vowels");
	}
}
int vowels(char ch)
{

if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
		return 1;
	}
	
	else{
		return 0;
	}
}