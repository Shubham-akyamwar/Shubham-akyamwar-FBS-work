#include<stdio.h>
int pallindrome(int);
void main()
{
	int num;
     printf("enter a number= ");
	 scanf("%d",&num);
	int res=pallindrome(num);
	if(res==1){
		printf("pallindrome");
	}else{
		printf("not pallindrome");
	}
	
}
int pallindrome(int num)
{
	int r1,r2,r3,q1;
     r1=num%10;
	 q1=num/10;
	 r2=q1%10;
	 r3=q1/10;
	 if(r1==r3){
	 	return 1;
	 }
	 else
	 {
	 	return 0;
	 }
}