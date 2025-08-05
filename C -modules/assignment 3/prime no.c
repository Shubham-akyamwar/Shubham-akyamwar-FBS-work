//Check the given number is prime or not.
//Input: n = 7
//Output: Prime
#include<stdio.h>
void main() {
	int no;
	int isprime=1;
	printf("enter the number");
	scanf("%d",&no);
	for(int i=2; i<=no/2; i++) {
		if(no%i==0)
			isprime=0;
	}
	if(isprime==1) {
		printf("prime number");
	}
	else{
		printf("not prime number");
	}
}