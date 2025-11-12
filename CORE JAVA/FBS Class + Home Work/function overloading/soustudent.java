class Student
{
int rollno;
String name;
double per;

    Student()
{
 this.rollno=101;
 this.name="amol";
 this.per=70;
}//students default constructor

}//class student ends
class Employee
{
int id;
String name;
double annualsal;

Employee()
{
  this.id=1;
  this.name="Yogesh";
  this.annualsal=600000;
}// employee default constructer

}//class employee ends


class Bank
{
void approvalloan(Student s)
{
 if(s.per>80)
{
 System.out.println("approved loan amount is: 2 lakh ");
}
else if(s.per>60 && s.per<=80)
{
 System.out.println("approved loan amount is: 1 lakh ");
}
else if(s.per>40&& s.per<=60)
{
 System.out.println("approved loan amount is:  50k ");
}
else
{
 System.out.println("no loan approved ");
}//approval function ends
}



void approvalloan(Employee e)
{
 if (e.annualsal>1200000)
{
  System.out.println("approved employee loan amount is: 7 lakh");
}
else if (e.annualsal>1000000 && e.annualsal<=1200000)
{
  System.out.println("approved employee loan amount is: 6 lakh");
}
else if (e.annualsal>600000 && e.annualsal<=1000000)
{
  System.out.println("approved employee loan amount is: 5 lakh");
}
else if (e.annualsal>400000 && e.annualsal<=600000)
{
  System.out.println("approved employee loan amount is: 4 lakh");
}
else 
{
  System.out.println("no emloan approved");
}
}//approval function ends

}// class bank ends

class TestLoan
{
public static void main(String [] x)
{
 Student s1=new Student();
 Employee e1=new Employee();

Bank b=new Bank();

b.approvalloan(s1);
b.approvalloan(e1);
}
}// class testloan ends
