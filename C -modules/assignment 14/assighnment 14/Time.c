struct time
{
	int hour;
	int min;
	int sec;
};
#include<stdio.h>
void main()
{
	struct time t1,t2;
	
	t1.hour=10;
	t1.min=45;
	t1.sec=55;
	
	printf("[time T1]:\n");
	printf("hour=%d\n",t1.hour);
	printf("min=%d\n",t1.min);
	printf("sec=%d\n",t1.sec);
	
	printf("\n[time t2]:\n");
	printf("enter hour :");
	scanf("%d",&t2.hour);
	printf("enter min :");
	scanf("%d",&t2.min);
	printf("enter sec :");
	scanf("%d",&t2.sec);
	
	printf("\n[display of time]:\n");
	printf("hour=%d\n",t2.hour);
	printf("min=%d\n",t2.min);
	printf("sec=%d",t2.sec);
		
}