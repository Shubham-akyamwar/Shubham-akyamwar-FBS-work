//find odd and even among the numbers
#include<stdio.h>
void main()
{
	int arr[10],num;
	printf("enter size of array:\n");
	scanf("%d",&num);
	
	printf("enter the elements:\n",num);
	for(int i=0;i<num;i++){
		scanf("%d",&arr[i]);
	}
	printf("\n even numbers:\n");
	for(int i=0;i<num;i++){
		if(arr[i]%2==0){
		printf("%d ",arr[i]);
	}
	}
	printf("\n odd numbers:\n");
	for(int i=0;i<5;i++){
		if(arr[i]%2!=0){
			printf("%d ",arr[i]);
		}
	}
}