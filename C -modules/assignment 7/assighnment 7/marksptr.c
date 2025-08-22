#include<stdio.h>
void Result(int* );
void main() {
	int marks;
	printf("Enter Marks:");
	scanf("%d",&marks);
	Result(&marks);
}// main end
 void Result(int* marks){
 	if(*marks>65) {
		printf("First Class");
	} else {
		if(*marks>55) {
			printf("Second class");
		} else {
			if(*marks>=40) {
				printf("Pass");

			} else {
				printf("Fail");
			}
		}
	}
 }