#include<stdio.h>
void SumofFdLd(int *no);
void main(){
	int no;
	printf("Enter the Number:");
	scanf("%d",&no);
SumofFdLd(&no);
	
}//main end

void SumofFdLd(int *no){
	int fd,ld;
		ld=*no%10;
	fd=*no;
	while(fd>10){
		fd=fd/10;
		
	}
	int sum=fd+ld;
	printf("Sum of first and last digit of %d number is:%d",no,sum);
	
	
}