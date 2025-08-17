#include<stdio.h>
int salary();
void main()
{
	 
	 printf("%d",salary());
	
}
int salary()
{
	double bs=5000;
	double da,ta,hra,ts;
	printf("enter the salary:=");
	scanf("%lf",&bs);
	if(bs<=5000)
	{
		da=bs * 0.10;
		ta=bs * 0.20;
		hra=bs* 0.25;
	}
	else{
		da=bs * 0.15;
		ta=bs * 0.25;
		hra=bs* 0.30;
	}
	ts = bs + da + ta + hra;
	 printf("Basic Salary: %.2f\n", bs);
    printf("DA: %.2f\n", da);
    printf("TA: %.2f\n", ta);
    printf("HRA: %.2f\n", hra);
//  printf("Total Salary: %.2f\n", ts);
		return ts;
}
