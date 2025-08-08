//Print prime numbers in the given range 1 to n.
#include<stdio.h>
void main(){
	int num=7,isprime=1;
	printf("enter the number:");
	scanf("%d",&num);
	for(int i=2;i<num;i++){
		if(num%i==0)
		isprime==0;
		
	}
	if(isprime==0){
		printf("no is prime");
	}
	else{
		printf("no is not prime");
	}
}