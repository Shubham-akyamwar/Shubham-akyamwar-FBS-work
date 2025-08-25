//find sum of all numbers
#include<stdio.h>
void main()
{
   int arr[5],sum=0;
   printf("enter the numbers:");
   for(int i=0;i<5;i++){
   	scanf("%d",&arr[i]);
   }
   for(int i=0;i<5;i++)	{
   sum +=arr[i];
   }
   printf("sum of number:%d",sum);
}