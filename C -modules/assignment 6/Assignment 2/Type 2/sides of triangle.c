#include<stdio.h>
int triangle();
void main() {
	int res=triangle();
	if(res==1)
	{
	printf("the traingle of equilateral:\n");	
	}else if(res==2)
	{
	printf("the  triangle of isosceles:\n");	
	}else{
	printf("the triangle of scalene:\n");	
	}	
}
int triangle()
{
	int a,b,c;
	printf("enter three sides of triangle:\n");
	scanf("%d%d%d",&a,&b,&c);
	if(a==b && b==c) {
		return 1;
	} else if(a==b && b==c && a==c) {
		return 2;
	} else {
		return 3;
	}
}