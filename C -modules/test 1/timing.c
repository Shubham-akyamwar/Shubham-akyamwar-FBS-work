//convert the time entered in hh,min and sec into total second.
#include<stdio.h>
void main()
{
	int hh=2,min=59,sec=12,min1,sec1,sec2,totalsec;
	min1=60*hh;
	sec1=min*60;
	sec2=min*60;
	totalsec=sec1+sec2+sec;
	printf("total second is : %d,totalsec");
}