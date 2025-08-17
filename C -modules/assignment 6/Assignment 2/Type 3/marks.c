#include<stdio.h>
void studentmarks(int);
void main() {
	int marks;
	printf("Enter Marks:");
	scanf("%d",&marks);
	studentmarks(marks);
}
void studentmarks(int marks)
{
if(marks>=65) {
		printf("First Class");
	} else {
		if(marks>=55) {
			printf("Second class");
		} else {
			if(marks>=40) {
				printf("Pass");

			} else {
				printf("Fail");
			}
		}
	}
}