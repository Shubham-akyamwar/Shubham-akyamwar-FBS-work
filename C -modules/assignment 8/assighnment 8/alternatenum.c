//print alternate elementes in array
#include<stdio.h>
void main()
{
	int arr[10],num;
	printf("enter the size of array:\n");
	scanf("%d",&num);
	
	printf("enter the elements :\n",num);
	for(int i=0;i<num;i++){
		scanf("%d",&arr[i]);
	}
	printf("altenate number is:\n");
	for(int i=0;i<num;i+=2){
		printf("%d ",arr[i]);
	}
}