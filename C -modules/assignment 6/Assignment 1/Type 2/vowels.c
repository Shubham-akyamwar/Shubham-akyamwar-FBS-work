#include<stdio.h>
int vowels();
void main()
{ 
int res=vowels();
if(res==1){
	printf("vowels");
}else{
	printf(" not vowels");
}

}
int vowels()
{

    char ch;
	printf("enter the any alphabet:");
    scanf("%c",&ch);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	{
	return 1;
	}
	else{
	return 0;	
	}
}