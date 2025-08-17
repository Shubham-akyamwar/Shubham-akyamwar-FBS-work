#include<stdio.h>
void salary(double);
void main()
{
	double bs=5000;
	printf("enter the salary:=");
	scanf("%lf",&bs);
	salary(bs);
}
void salary (double bs)
{
    double da,ta,hra,ts;
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
    printf("Total Salary: %.2f\n", ts);
}