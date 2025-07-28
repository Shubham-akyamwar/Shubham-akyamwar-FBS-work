#include<stdio.h>
void main()
{
	int min=220;
	int hrs;
	hrs=min/60;
	min=min%60;
	printf("hrs is %d min %d ",hrs,min);
}