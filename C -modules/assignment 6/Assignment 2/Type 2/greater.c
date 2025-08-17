#include<stdio.h>
int greater();
void main() {
	int a,b,c;
	int res=greater();
	if(res==1){
	printf("%d a greatest number:\n",a);	
	}else if(res==2)
	{
	printf(" %d b  greatest number:\n",b);	
	}else if(res==3)
	{
	printf("%d c greatest number:\n",c);	
	}
}
int greater()
{
    int a,b,c;
	printf("enter  three numbers:\n");
	scanf("%d%d%d",&a,&b,&c);
	if(a>b) {
		if(a>c) {
			return 1;
		}
	} else {
		if(b>c) {
			return 2;
		} else {
			return 3;
		}
	}
}