struct product
{
	int id;
	char name[20];
	int quantity;
	int price;
};
#include<stdio.h>
#include<string.h>
void main()
{
	struct product p1,p2;
	p1.id=101;
	strcpy(p1.name," ms dhoni");
	p1.quantity=1;
	p1.price=700000;
	
	printf("[product p1]:\n");
	printf("id=%d\n",p1.id);
	printf("name=%s\n",p1.name);
	printf("quantity=%d\n",p1.quantity);
	printf("price=%d\n",p1.price);
	
	printf("\n[product p2]:\n");
	printf("enter id=");
	scanf("%d",&p2.id);
	printf("enter name=");
	scanf("%s",p2.name);
	printf("enter quantity=");
	scanf("%d",p2.quantity);
	printf("enter price=\n");
	scanf("%d",&p2.price);
	
	printf("\n[display product]:\n");
	printf("id=%d\n",p2.id);
	printf("name=%s\n",p2.name);
	printf("quantity=%d\n",p2.quantity);
	printf("price=%d\n",p2.price);
	
	
}