// find min and max number in array
#include<stdio.h>
void main()
{
	int arr[5];
	int max,min;
	printf("enter the numbers:\n");
	for(int i=0;i<5;i++)
	{
		scanf("%d",&arr[i]);
	}
	min=max=arr[0];
	for(int i=1;i<5;i++){
		if(arr[i]<min){
			min=arr[i];
		}
		if(arr[i]>max){
			max=arr[i];
		}
	}
	printf("minimun number:%d\n",min);
	printf("maximum number:%d",max);
	
}