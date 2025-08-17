#include<stdio.h>
int triangle(int,int,int);
void main() {
	int a,b,c;
	printf("enter three sides of triangle:\n");
	scanf("%d%d%d",&a,&b,&c);
    int res=triangle(a,b,c);
    if(res==1){
    	printf("the traingle of equilateral:\n");
	}else if(res==2){
		printf("the  triangle of isosceles:\n");
	}else{
		printf("the triangle of scalene:\n");
	}
}
int triangle(int a,int b,int c)
{
if(a==b && b==c) {
		return 1;
	} else if(a==b && b==c && a==c) {
		return 2;
	} else {
		return 3;
	}
}