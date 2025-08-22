#include<stdio.h>
void series(int* );
void main(){
	int i=1;
	series(&i);
}
void series(int* i){

	while(*i<=10){
		printf("%d ",*i);
		(*i)++;
	}
}