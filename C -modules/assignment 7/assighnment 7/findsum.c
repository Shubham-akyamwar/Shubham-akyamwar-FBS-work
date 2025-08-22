#include<stdio.h>
void FindSum(int* );
void main(){
	int no;
	printf("Enter the number:");
	scanf("%d",&no);
	FindSum(&no);
	
}
void FindSum(int* no){
int i=1,sum=0;
	while(i<=*no){
		sum=sum+i;
		i++;
	}
	printf("sum is: %d",sum);
}