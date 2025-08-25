//sort the number

#include<stdio.h>
void main()
{
	int arr[5]={50,10,30,20,40};
	int temp;
	
	printf("number of arry: ");
	for(int i=0;i<5;i++){
		printf("%d ",arr[i]);
	}
	for(int i=0;i<5;i++){
		for(int j=i+1;j<5;j++){
			if(arr[i]<arr[j]){
				
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
	printf("\nsorting number ascending :");
	for(int i=0;i<5;i++){
		printf("%d ",arr[i]);
	}
}