//Accept three sides of a triangle from the user and determine whether the triangle is
//equilateral, isosceles, or scalene.
#include<stdio.h>
void main() {
	int a,b,c;
	printf("enter three sides of triangle:\n");
	scanf("%d%d%d",&a,&b,&c);


	if(a==b && b==c) {
		printf("the traingle of equilateral:\n");
	} else if(a==b && b==c && a==c) {
		printf("the  triangle of isosceles:\n");
	} else {
		printf("the triangle of scalene:\n");
	}
}
