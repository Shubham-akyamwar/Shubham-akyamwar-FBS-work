//Reverse the given array

#include<stdio.h>
void main()
{
	int arr[5]={10,20,30,40,50};
	
	printf("number of array: ");
	for(int i=0;i<5;i++){
		printf("%d ",arr[i]);
	}
	printf("\nreverse nuber:");
	for(int i=4;i>=0;i--){
		printf("%d ",arr[i]);
	}
}