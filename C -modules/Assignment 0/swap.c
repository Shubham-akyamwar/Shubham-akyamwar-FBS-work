#include<stdio.h>
void main()
{
	int a=10,b=20,temp;
	temp=a;
	a=b;
	b=temp;
	printf("after swap of a=%d b=%d",a,b);
}