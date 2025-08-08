//Print perfect numbers in the given range 1 to n.
#include<stdio.h>
void main() {
	int no;
	printf("Enter the range:");
	scanf("%d",&no);
	for(int k=1; k<=no; k++) {
		int num=k;
		int sum=0;
		int i;
		for(i=1; i<num; i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(sum==num) {
			printf("%d is perfect number\n",num);
		}

	}
}