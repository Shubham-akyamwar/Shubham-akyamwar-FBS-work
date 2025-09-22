struct distance
{
	int feet;
	int inch;
};
#include<stdio.h>
void main()
{
	struct distance d1,d2;
	d1.feet=40;
	d1.inch=10;
	
	printf("[distance D1]:\n");
	printf("feet=%d\n",d1.feet);
	printf("inch=%d\n",d1.inch);
	
	printf("\n[distance D2]:\n");
	printf("enter feet :");
	scanf("%d",&d2.feet);
	printf("enter inch :");
	scanf("%d",&d2.inch);
	
	printf("\n[display distance]:\n");
	printf("feet=%d\n",d2.feet);
	printf("inch=%d",d2.inch);
}