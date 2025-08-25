//search the given number in array
#include<stdio.h>
void main()
{
	int arr[10],num,search,found=0;
	printf("enter the size of array:\n");
	scanf("%d",&num);
	printf("enter the elements:%d\n",num);
	for(int i=0;i<num;i++){
		scanf("%d",&arr[i]);
	}
	printf("enter the search number:");
	scanf("%d",&search);
	int i;
	for(i=0;i<num;i++){
		if(arr[i]==search){
			 found=1;
			break;
		}
	}
	if(found==1){
		printf("Number %d found at position %d\n",search,i);
	}else{
		printf("number %d not found in array",search);
	}
}