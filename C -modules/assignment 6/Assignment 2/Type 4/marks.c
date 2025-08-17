#include<stdio.h>
int studentmarks(int);
void main() {
	int marks;
	printf("Enter Marks:");
	scanf("%d",&marks);
	int res=studentmarks(marks);
	if(res==1){
		printf("First Class");
	}else if(res==2){
		printf("Second class");
	}else if(res==3){
		printf("Pass");
	}else{
		printf("Fail");
	}
}
int studentmarks(int marks)
{
if(marks>=65) {
		return 1;
	} else {
		if(marks>=55) {
			return 2;
		} else {
			if(marks>=40) {
				return 3;

			} else {
				return 4;
			}
		}
	}
}