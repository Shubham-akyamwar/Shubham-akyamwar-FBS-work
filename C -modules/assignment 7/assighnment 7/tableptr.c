#include<stdio.h>
void table(int*);
void main(){
	int no;
printf("Enter the table:");
scanf("%d",&no);
table(&no);

	
	
}
void table(int* no){
	int i=1;
		printf("Table of %d:\n",*no);
		while(i<=10){
		printf("%d * %d = %d\n",*no,i,*no*i);
		i++;
}
}