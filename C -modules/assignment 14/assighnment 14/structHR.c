struct HR
{
	int id;
	char name[20];
	int salary;
	int commission;
};
#include<stdio.h>
#include<string.h>
void main()
{
	struct HR b1,b2;
	b1.id=9890;
	strcpy(b1.name,"shantnu");
	b1.salary=60000;
	b1.commission=1000;
	
	printf("[first HR]:\n");
	printf("id=%d\n",b1.id);
	printf("name=%s\n",b1.name);
	printf("salary=%d\n",b1.salary);
	printf("commission=%d\n",b1.commission);
	
	printf("\n[second HR]:\n");
	printf("enter id:");
	scanf("%d",&b2.id);
	printf("enter name:");
	scanf("%s",b2.name);
	printf("enter salary:");
	scanf("%d",&b2.salary);
	printf("enter commission:");
	scanf("%d",&b2.commission);
	
	printf("\n[deatail HR]:\n");
	printf("deatail of HR: id=%d\n",b2.id);
	printf("deatail of HR: name=%s\n",b2.name);
	printf("deatail of HR: salary=%d\n",b2.salary);
	printf("deatail of HR: commission=%d",b2.commission);
	
}