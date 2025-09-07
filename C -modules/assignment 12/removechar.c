//WAP to Remove the nth Index Character from a Non-Empty String

#include<stdio.h>
#include<string.h>
void main()
{
	char str[20];
	printf("enter the charcter:");
	scanf("%s",&str);
	int n;
	printf("enter the index:");
	scanf("%d",&n);
	
	for(int i=n;str[i]!='\0';i++){
		str[i]=str[i+1];
	}
	printf("%s",str);
}