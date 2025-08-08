//Print armstrong numbers in the given range 1 to n.#include<stdio.h>
void main() {
	int num=153,r,sum=0,temp,i,p;
	temp=num;
	int ocount=0;
	while(temp!=0) {
		ocount++;
		temp=temp/10;
	}
	temp=num;
	while(temp!=0) {
		r=temp%10;
		p=1;
		for(i=1;i<=ocount;i++) {
			p=p*r;
		}
		sum=sum+p;
		temp=temp/10;
	}
	if(num==sum) {
		printf("no is amstrong");
	} else {
		printf("no is not amstrong");
	}
}