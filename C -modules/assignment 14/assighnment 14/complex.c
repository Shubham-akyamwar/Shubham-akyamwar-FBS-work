struct complex
{
	int real;
	int imanginary;
};
#include<stdio.h>
void main()
{
	struct complex c1,c2;
	c1.real=10;
	c1.imanginary=20;
	
	printf("[complex c1]:\n");
	printf("real=%d\n",c1.real);
	printf("imanginary=%d\n",c1.imanginary);
	
	printf("\n[complex c2]:\n");
	printf("enter real:");
	scanf("%d",&c2.real);
	printf("enter imanginary:");
	scanf("%d",&c2.imanginary);
	
}