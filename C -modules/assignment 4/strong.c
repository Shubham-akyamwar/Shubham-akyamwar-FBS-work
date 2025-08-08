//Print strong numbers in the given range 1 to n.
#include<stdio.h>
void main(){
	int num,r,sum=0,i,fact;
	printf("Enter the nuber:");
	scanf("%d",&num);
	int temp=num;
	while(temp!=0){
		fact=1;
		r=temp%10; //5
		for(i=1;i<=r;i++){
			fact=fact*i;
		
		}
		sum=sum+fact;
		printf("sum is %d",sum);
        temp=temp/10;
		
	}
	if(num==sum){
		printf("no is strong");
	}
	else{
		printf("no is not strong");
	}
}