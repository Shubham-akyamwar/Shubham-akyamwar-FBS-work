struct date
{
	int date;
	int month[20];
	int year;
};
#include<stdio.h>
#include<string.h>
void main()
{
	struct date d1,d2;
	
	d1.date=02;
	strcpy(d1.month,"december");
	d1.year=2003;
	
	printf("[D1 calender]:\n");
	printf("date=%d\n",d1.date);
	printf("month=%s\n",d1.month);
	printf("year=%d\n",d1.year);
	
	printf("\n[D2 calender]:\n");
	printf("enter date:");
	scanf("%d",&d2.date);
	printf("enter month:"); 
	scanf("%s",d2.month);
	printf("enter year:");
	scanf("%d",&d2.year);
	
	printf("\n[Display of date]:\n");
	printf("Date=%d\n",d2.date);
	printf("Month=%s\n",d2.month);
	printf("Year=%d",d2.year);
}