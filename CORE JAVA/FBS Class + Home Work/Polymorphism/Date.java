package Polymorphism;

class Date{
int date,month,year;
String dow;

Date()//default constructor
{
this.date=17;
this.month=1;
this.year=2004;
this.dow="saturday";
}

Date(int d,int m,int y,String str)
{
this.date=d;
this.month=m;
this.year=y;
this.dow=str;
}
void setDate(int x){
this.date=x;
}

void setMonth(int x){
this.month=x;
}

void setYear(int x){
this.year=x;
}

int getDay(){

   return this.date;
}

int getMonth(){

   return this.month;
}
public String toString(){
	return "\n Date is :"+this.date+"/"+this.month+"/"+this.year+"\n DOW :"+this.dow;
}


void display()
{
	System.out.println("day is"+ this.date);
	System.out.println("month is"+ this.month);
	System.out.println("year is"+ this.year);
	System.out.println("dayofweek is"+ this.dow);
}




} //date ends here

class Test{
public static void main(String [] args){
  Date d1,d2,d3; //reference
  d1 = new Date();
  d2 = new Date();
  d3 = new Date();
  d1.setDate(31);
  d1.setMonth(10);
  d1.setDate(31);

  d2.setDate(21);
  d2.setMonth(10);
  d2.setDate(31);

  d3.setDate(17);
  d3.setMonth(1);
  d3.setDate(2004);

d1.display();
d2.display();
d3.display();


System.out.println(d1);
System.out.println(d1.toString());



 if(d1.getMonth()>d2.getMonth()){
      System.out.println("d1 is younger");
}
else{
    System.out.println("d2 is younger");
}

if(d1.getDay()>d2.getDay()){
      System.out.println("d1 is younger");
}
else{
    System.out.println("d2 is younger");
}

  //System.out.println("Date is: "+d1.date +"/"+ d1.month +"/"+d1.year);
   
   }//main ends here
}//Test class ends here