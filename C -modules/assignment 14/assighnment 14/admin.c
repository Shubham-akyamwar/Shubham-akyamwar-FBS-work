struct admin
{
	int id;
	char name[15];
	int salary;
	int allowance;
};
#include<stdio.h>
#include<string.h>
void main()
{
	struct admin a1,a2;
	
	a1.id=9552;
	strcpy(a1.name,"shubham");
	a1.salary=70000;
	a1.allowance=5000;
	
	printf("[first admin]:\n");
	printf("id=%d\n",a1.id);
	printf("name=%s\n",a1.name);
	printf("salary=%d\n",a1.salary);
	printf("allowance=%d\n",a1.allowance);
	
	printf("\n[second admin]:\n");
	printf("enter id:");
	scanf("%d",&a2.id);
	printf("enter name:");
	scanf("%s",a2.name);
	printf("enter salary:");
	scanf("%d",&a2.salary);
	printf("enter allowance:");
	scanf("%d",&a2.allowance);
	
	printf("\n[Deatail of admin]:\n");
	printf("deatail admin: id=%d\n",a2.id);
	printf("deatail admin: name=%s\n",a2.name);
	printf("deatail admin: salary=%d\n",a2.salary);
	printf("deatail admin: allowance=%d\n",a2.allowance);
}