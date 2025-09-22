struct employee
{
	int Id;
	char name[15];
	int salary;
};
#include<stdio.h>
#include<string.h>
void main()
{
	struct employee e1,e2;
	e1.Id=6223;
	strcpy(e1.name,"shankar");
	e1.salary=50000;
	printf("first employee:\n");
	printf("Id=%d\n",e1.Id);
	printf("name=%s\n",e1.name);
	printf("salary=%d\n",e1.salary);
	
	printf("\nsecond employee:\n");
	printf("enter Id:");
	scanf("%d",&e2.Id);
	printf("enter name:");
	scanf("%s",e2.name);
	printf("enter salary:");
	scanf("%d",&e2.salary);
}