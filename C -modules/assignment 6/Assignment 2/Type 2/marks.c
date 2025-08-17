#include<stdio.h>
int topper();
void main() {
	int marks;
	int res=topper();
	if(res==1){
	printf("First Class");	
	}else if(res==2)
	{
	printf("Second class");	
	}else if(res==3)
	{
	printf("Pass");	
	}else 
	{
	printf("Fail");	
	}
}
int topper()
{
	int marks;
    printf("Enter Marks:");
	scanf("%d",&marks);
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