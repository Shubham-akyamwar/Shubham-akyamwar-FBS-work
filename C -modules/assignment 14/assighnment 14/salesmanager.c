struct salesmanager
{
	int id;
	char name[20];
	int salary;
	int incentive;
	int target;
};
#include<stdio.h>
#include<string.h>
void main()
{
	struct salesmanager s1,s2;
	s1.id=9058;
	strcpy(s1.name,"amol");
	s1.salary=20000;
	s1.incentive=3000;
	s1.target=20;
	
	printf("[first salaes manager]:\n");
	printf("id=%d\n",s1.id);
	printf("name=%s\n",s1.name);
	printf("salary=%d\n",s1.salary);
	printf("incentive=%d\n",s1.incentive);
	printf("target=%d\n",s1.target);
	
	printf("\n[second sales manager]:\n");
	printf("enter Id:");
	scanf("%d",&s2.id);
	printf("enter name:");
	scanf("%s",s2.name);
	printf("enter salary:");
	scanf("%d",&s2.salary);
	printf("enter incentive:");
	scanf("%d",&s2.incentive);
	printf("enter target:");
	scanf("%d",&s2.target);
	
	printf("\n[salesmanager deatail]:\n");
	printf("salesmanager deatail: id=%d\n",s2.id);
	printf("salesmanager deatail: name=%s\n",s2.name);
	printf("salesmanager deatail: salary=%d\n",s2.salary);
	printf("salesmanager deatail: incentive=%d\n",s2.incentive);
	printf("salesmanager deatail: target=%d\n",s2.target);
	
}