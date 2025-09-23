#include<stdio.h>
#include<string.h>
#include<stdlib.h>
typedef struct Dob
{
	int date;
	char month[10];
	int year;
}Dob;

typedef struct player
{
	int Jersey_no;
	char name[50];
	int run;
	int  wickets;
	int matches_played;
	Dob dob;
		
}player;

int playercount=11;
void playerdata(player*);
void displayallplayer(player*);
void addplayer(player*);
void searchplayer(player*);
void removeplayer(player*);
void updateplayerdata(player*);
void displayplayerbyrunorwicket(player*,int);

void main()
{
	int choice;
	player* arr;
	int size;
	int nsize=11;
	printf("Enter Array :");
	scanf("%d",&size);
	nsize=nsize+size;
	
	arr=(player*) malloc(nsize * sizeof(player));
    
	
	playerdata(arr);
	while(1){
		printf("\n========================> Enter your choice for Managing player Data <=======================\n\n");
		printf("1) Add Player           2) Remove Player      3) Search Player      4) Update Player Data      5) Display Sorted Players     \n6) Display All Players    7) Exit   \n\n");
		printf("==>:");
		scanf("%d",&choice);
		if(choice==1){
			if(playercount==nsize){
				int newsize;
				printf("\n=======> Player Array is Full <=======\n");
				printf("\nEnter New Size ==> :");
				scanf("%d",&newsize);
				nsize=nsize+newsize;
				arr=(player*) realloc(arr, nsize* sizeof(player));
			}
			else
			{
				addplayer(arr);
			}
		}
		else if(choice==2){
				removeplayer(arr);
		}
		else if(choice==3){
			searchplayer(arr);
		}
		else if(choice==4){
			updateplayerdata(arr);
		}
		else if(choice==5){
			displayplayerbyrunorwicket(arr,nsize);
		}
		else if(choice==6){
			displayallplayer(arr);
		}
		else if(choice==7){
			break;
		}
		else
		printf("----- Please, select valid option to manage players info -----\n");	
	}
	printf("----- Thank you, for using the Player Management System. Have a great day! -----\n\n");
	
}

void displayplayerbyrunorwicket(player* arr,int nsize)
{
	player brr[nsize];
	
	for(int i=0;i<playercount;i++){
		
		brr[i]=arr[i];
	}
	
	
	int choice;
		
	printf(" 1) Top 3 Runer Enter 1 :  |   Top 3 Wicketer Enter 2:  |   Lowest 3 wicket Enter 3 :    |   Lowest 3 Runer Enter 4 :   \n");
	printf("===>: ");
	scanf("%d",&choice);
	
	if(choice==1)
	{	
		for(int i=0;i<playercount-1;i++){
			for(int j=0;j<playercount-i-1;j++){
				if(brr[j].run<brr[j+1].run){
					player temp=brr[j];
					brr[j]=brr[j+1];
					brr[j+1]=temp;
				}
			}
		}
		
	for(int i=0;i<playercount&&i<3 ;i++){
			
			printf("---------------------------------------------------------------------------------------------------------\n");
			printf("Jersey_no: %d  |  Name:%s  |  Run: %d  |  Wicket: %d  |  Matches_Played: %d  |  DOB: %d-%s-%d\n",brr[i].Jersey_no,brr[i].name,brr[i].run,brr[i].wickets,brr[i].matches_played,brr[i].dob.date,brr[i].dob.month,brr[i].dob.year);
			printf("---------------------------------------------------------------------------------------------------------\n");
		
		}
		
	}
	else if(choice==2)
	{
		for(int i=0;i<playercount-1;i++){
			for(int j=0;j<playercount-i-1;j++){
				if(brr[j].wickets<brr[j+1].wickets){
					player temp=brr[j];
					brr[j]=brr[j+1];
					brr[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<playercount&&i<3 ;i++){
			
			printf("---------------------------------------------------------------------------------------------------------\n");
			printf("Jersey_no: %d  |  Name:%s  |  Run: %d  |  Wicket: %d  |  Matches_Played: %d  |  DOB: %d-%s-%d\n",brr[i].Jersey_no,brr[i].name,brr[i].run,brr[i].wickets,brr[i].matches_played,brr[i].dob.date,brr[i].dob.month,brr[i].dob.year);
			printf("---------------------------------------------------------------------------------------------------------\n");
		
		}
	}	
	else if(choice==3)
	{
	for(int i=0;i<playercount-1;i++){
			for(int j=0;j<playercount-i-1;j++){
				if(brr[j].wickets>brr[j+1].wickets){
					player temp=brr[j];
					brr[j]=brr[j+1];
					brr[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<playercount&&i<3 ;i++){
			
			printf("---------------------------------------------------------------------------------------------------------\n");
			printf("Jersey_no: %d  |  Name:%s  |  Run: %d  |  Wicket: %d  |  Matches_Played: %d  |  DOB: %d-%s-%d\n",brr[i].Jersey_no,brr[i].name,brr[i].run,brr[i].wickets,brr[i].matches_played,brr[i].dob.date,brr[i].dob.month,brr[i].dob.year);
			printf("---------------------------------------------------------------------------------------------------------\n");
		
		}
	}
	else if(choice==4){
		for(int i=0;i<playercount-1;i++){
			for(int j=0;j<playercount-i-1;j++){
				if(brr[j].run>brr[j+1].run){
					player temp=brr[j];
					brr[j]=brr[j+1];
					brr[j+1]=temp;
				}
			}
		}
		
		for(int i=0;i<playercount&&i<3 ;i++){
			
			printf("---------------------------------------------------------------------------------------------------------\n");
			printf("Jersey_no: %d  |  Name:%s  |  Run: %d  |  Wicket: %d  |  Matches_Played: %d  |  DOB: %d-%s-%d\n",brr[i].Jersey_no,brr[i].name,brr[i].run,brr[i].wickets,brr[i].matches_played,brr[i].dob.date,brr[i].dob.month,brr[i].dob.year);
			printf("---------------------------------------------------------------------------------------------------------\n");
		
		}
	}
	else
	printf("\n=====> Envalid Choise Please Enter Valid Choice <=====\n");

	
} //display by to 3 run and wicket end here
void updateplayerdata(player* arr)
{
	int jn,i;
	int flag=0;
	while(1){
		
	printf("Enter a Jersey_no Number :");
	scanf("%d",&jn);
	
	for(i=0;i<playercount;i++){
		if(arr[i].Jersey_no==jn){
			flag=1;
			break;
		}
	}
	if(flag!=0){
	printf("Enter a Name:");
	scanf("%s",arr[i].name);
	printf("Enter Run: ");
	scanf("%d",&arr[i].run);
	printf("Enter Wicket :");
	scanf("%d",&arr[i].wickets);
	printf("Matches Played: ");
	scanf("%d",&arr[i].matches_played);
	printf("Enter Date Birth Date:");
	scanf("%d",&arr[i].dob.date);
	printf("Enter Month : ");
	scanf("%s",arr[i].dob.month);
	printf("Enter Year: ");
	scanf("%d",&arr[i].dob.year);
	printf("\n===> Update Sucessfully<===\n");
	break;
	}
	else
	{
		printf("\n----> Enter Valid Jersey_no Number <----\n");
	}
	
   }
	
}//update player end here 

void removeplayer(player* arr)
{
	int jn;
	int flag=0;
	while(1){
	printf("Enter Jersey_no number: ");
	scanf("%d",&jn);
	
	for(int i=0;i<playercount;i++){
		if(arr[i].Jersey_no==jn){
		for(int j=i;j<playercount-1;j++){
			arr[j]=arr[j+1];
			
		
		}
		    flag=1;
			playercount--;
	   }
	}
	
	if(flag!=0){
		printf("\n===> remove player Sucessfully <===\n");
		break;
	}
	else
	printf("\n---> Enter Valid Jersey_no number <---\n");
}
	

	
}//remove player end here


void addplayer(player* arr)
{
	int i,jn;
	while(1){
		int flag=0;
		printf("Enter jersey_no: ");
		scanf("%d",&jn);
		for(i=0;i<playercount;i++){
			if(arr[i].Jersey_no==jn){
				printf("\n===> This jersey_no is allready Exists <===\n");
				printf("\n===> Try Another Jarsey_no <===\n");
				flag=1;
				break;
			}
		}
		if(flag==0){
			arr[i].Jersey_no=jn;
			printf("Enter Name:");
			scanf(" %s",arr[i].name);
			printf("Enter Run: ");
			scanf("%d",&arr[i].run);
			printf("Enter Wickets: ");
			scanf("%d",&arr[i].wickets);
			printf("Enter matches_played: ");
			scanf("%d",&arr[i].matches_played);
			printf("Enter Date of Birth (dd-mm-yy) Date:");
			scanf("%d",&arr[i].dob.date);
			printf("Enter Month: ");
			scanf(" %s",arr[i].dob.month);
			printf("Enter year: ");
			scanf("%d",&arr[i].dob.year);
			printf("\n====> Player Add Sucessfully <====\n");
			playercount++;
			break;
		}
	}
	
}//add end here

void searchplayer(player* arr)
{
	int choice;
	while(1){
	
	printf(" 1] Search By Jersey_no Enter 1:      |   2] Search By Name Enter 2 :    |    3] Exit enter 3:\n");
	printf("==> ");
	scanf("%d",&choice);
	
	if(choice==1){
		while(1){
		
		int jn;
		printf("Enter Jersey_no: ");
		scanf("%d",&jn);
		int flag=0;
		for(int i=0;i<playercount;i++){
			if(arr[i].Jersey_no==jn){
				printf("---------------------------------------------------------------------------------------------------------\n");
			printf("Jersey_no: %d  |  Name: %s  |  Run: %d  |  Wicket: %d  |  Matches_Played: %d  |  DOB: %d-%s-%d\n",arr[i].Jersey_no,arr[i].name,arr[i].run,arr[i].wickets,arr[i].matches_played,arr[i].dob.date,arr[i].dob.month,arr[i].dob.year);
			printf("---------------------------------------------------------------------------------------------------------\n");
			flag=1;
			break;
			}
			
			}
			if(flag==1){
				break;
			}
			if(flag==0){
				printf("\n===> Enter Valid Jersey_no <===\n");
				
			
		}
		
	}
}
	else if(choice==2){
		while(1){
		char name[30];
		printf("Enter Name: ");
		scanf("%s",name);
		int flag=0;
		for(int i=0;i<playercount;i++){
			if(strcasecmp(arr[i].name,name)==0){
			printf("---------------------------------------------------------------------------------------------------------\n");
			printf("Jersey_no: %d  |  Name: %s  |  Run: %d  |  Wicket: %d  |  Matches_Played: %d  |  DOB: %d-%s-%d\n",arr[i].Jersey_no,arr[i].name,arr[i].run,arr[i].wickets,arr[i].matches_played,arr[i].dob.date,arr[i].dob.month,arr[i].dob.year);
			printf("---------------------------------------------------------------------------------------------------------\n");
			flag=1;
			break;
			}
			
			}
			if(flag==0){
			printf("Enter Valid Name: ");
		}
		
	}
}
	else
	printf("\n===>Please Enter Valid Choice :<===\n");
	
     if(choice==3){
    	break;
	}
}
}//search end here

void displayallplayer(player* arr)
{
	for(int i=0;i<playercount;i++){
		printf("------------------------------------------------------------------------------\n\n");
		printf("Jersey_no: %d  |  Name:%s  |  Run: %d  |  Wicket: %d  |  Matches_Played: %d  |  DOB: %d-%s-%d\n",arr[i].Jersey_no,arr[i].name,arr[i].run,arr[i].wickets,arr[i].matches_played,arr[i].dob.date,arr[i].dob.month,arr[i].dob.year);
	}
	printf("------------------------------------------------------------------------------\n");
}//display end here

void playerdata(player* arr)
{
	arr[0].Jersey_no=45;
	strcpy(arr[0].name,"Rohit_Sharma");
	arr[0].run=7000;
	arr[0].wickets=15;
	arr[0].matches_played=272;
	arr[0].dob.date=30;
	strcpy(arr[0].dob.month,"april");
	arr[0].dob.year=1987;
	
	arr[1].Jersey_no=18;
	strcpy(arr[1].name,"Ms_dhoni");
	arr[1].run=10773;
	arr[1].wickets=3;
	arr[1].matches_played=350;
	arr[1].dob.date=7;
	strcpy(arr[1].dob.month,"july");
	arr[1].dob.year=1981;
	
	
	arr[2].Jersey_no=63;
	strcpy(arr[2].name,"Suryakumar_Yadav");
	arr[2].run=773;
	arr[2].wickets=5;
	arr[2].matches_played=150;
	arr[2].dob.date=14;
	strcpy(arr[2].dob.month,"sept");
	arr[2].dob.year=1990;
	
	arr[3].Jersey_no=32;
	strcpy(arr[3].name,"Ishan_Kishan");
	arr[3].run=4500;
	arr[3].wickets=16;
	arr[3].matches_played=180;
	arr[3].dob.date=18;
	strcpy(arr[3].dob.month,"july");
	arr[3].dob.year=1998;
	
	arr[4].Jersey_no=72;
	strcpy(arr[4].name,"Tilak_Varma");
	arr[4].run=5500;
	arr[4].wickets=17;
	arr[4].matches_played=180;
	arr[4].dob.date=8;
	strcpy(arr[4].dob.month,"nov"); 
	arr[4].dob.year=2002;
	
	arr[5].Jersey_no=31;
	strcpy(arr[5].name,"Ruturaj_gaikwad");
	arr[5].run=150;
	arr[5].wickets=10;
	arr[5].matches_played=8;
	arr[5].dob.date=31;
	strcpy(arr[5].dob.month,"jan"); 
	arr[5].dob.year=1997;
	
	arr[6].Jersey_no=8;
	strcpy(arr[6].name,"Ravindra_jadeja");
	arr[6].run=2500;
	arr[6].wickets=250;
	arr[6].matches_played=75;
	arr[6].dob.date=6;
	strcpy(arr[6].dob.month,"dec"); 
	arr[6].dob.year=1988;
	
	arr[7].Jersey_no=11;
	strcpy(arr[7].name,"Mohammed_shami");
	arr[7].run=500;
	arr[7].wickets=200;
	arr[7].matches_played=60;
	arr[7].dob.date=3;
	strcpy(arr[7].dob.month,"sep"); 
	arr[7].dob.year=1990;
	
	arr[8].Jersey_no=93;
	strcpy(arr[8].name,"Jasprit_bumrah");
	arr[8].run=150;
	arr[8].wickets=205;
	arr[8].matches_played=60;
	arr[8].dob.date=3;
	strcpy(arr[8].dob.month,"sep"); 
	arr[8].dob.year=1993;
	
	arr[9].Jersey_no=2;
	strcpy(arr[9].name,"Arshdeep_singh");
	arr[9].run=5000;
	arr[9].wickets=14;
	arr[9].matches_played=9;
	arr[9].dob.date=5;
	strcpy(arr[9].dob.month,"feb"); 
	arr[9].dob.year=1999;
	
	arr[10].Jersey_no=23;
	strcpy(arr[10].name,"Kuldeep_yadav");
	arr[10].run=207;
	arr[10].wickets=181;
	arr[10].matches_played=113;
	arr[10].dob.date=14;
	strcpy(arr[10].dob.month,"dec"); 
	arr[10].dob.year=1994;
}
// the player management code is end here ..... thank you ......