#include<stdio.h>
void GetAge(int* );
void main(){
	int age;
	printf("Enter the Age:");
	scanf("%d",&age);
 GetAge(&age);
}// main End
 
 void GetAge(int* age){
 		if(*age<12){
		printf("Child");
	}else if (*age>=12&&*age<=19){
		printf("teenager");
	}else if(*age>=20&&*age<=59){
		printf("Adult");
		
	}else{
		printf("Senior");
	}
 }