
struct students
{
	int rollno;
	char name[15];
	int marks;
};
#include<stdio.h>
#include<string.h>
void main()
{

	struct students s1,s2,s3;
	
	s1.rollno=102;
	strcpy(s1.name,"shubham");
	s1.marks=85;
	printf("first student detail:\n");
	printf("rollno=%d\n",s1.rollno);
	printf("name=%s\n",s1.name,"shubham");
	printf("marks=%d\n",s1.marks);
	
	printf("\n second student detail:\n");
	printf("enter rollno:");
	scanf("%d",&s2.rollno);
	printf("enter name:");
	scanf("%s",s2.name);
	printf("enter marks:");
	scanf("%d",&s2.marks);	
	
	printf("\n third student detail:\n");
	printf("enter rollno:");
	scanf("%d",&s3.rollno);
	printf("enter name:");
	scanf("%s",s3.name);
	printf("enter marks:");
	scanf("%d",&s3.marks);
}