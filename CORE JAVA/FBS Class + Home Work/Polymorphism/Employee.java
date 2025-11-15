package Polymorphism;

abstract class Employee {
	int Id;
	String Name;
	double Salary;
	
	abstract double calsal();
	
	public int getId() {
		return Id;
	}
	 void setId(int id) {
		Id = id;
	}
	 String getName() {
		return Name;
	}
	 void setName(String name) {
		Name = name;
	}
	 double getSalary() {
		return Salary;
	}
	 void setSalary(double salary) {
		Salary = salary;
	}
	
	Employee(){	//default constructor
		this.Id=302;
		this.Name="shiv";
		this.Salary=5268;
		}
	Employee(int i,String n,double s){	//parameterized constructor
		this.Id=i;
		this.Name=n;
		this.Salary=s;
		}

		void display(){
		System.out.println("\nenter Id=" +this.Id);
		System.out.println("enter Name=" +this.Name);
		System.out.println("enter Salary=" +this.Salary);

		}


} // ends here emp

class Hr extends Employee{
	
	
	
	 double Commission;
	 
	 double calsal() {
			return Salary+Commission;
			
		}

	 public double getCommission() {
		 return Commission;
	 }

	 public void setCommission(double commission) {
		 Commission = commission;
	 }
	 
	 Hr(){	//default constructor
		 
	 super();
	 this.Commission=4000;
	 }
	    
	 Hr(int Id,String Name ,double Salary ,double c){	//parameterized constructor
		super(Id,Name,Salary) ;
	 
	 this.Commission=c;
	 
		
	 }
	 
	 void display() {
		 super.display();
		 System.out.println("commission" +this.Commission);
	 }
} 
	 
class SalesManager extends Employee{
	 double Incentive;
	 int Target;
	 
	 double calsal() {
			return Salary+Incentive;
			
		}
	 
	 SalesManager(){	//default constructor
		 
		 super();
		 this.Incentive=4000;
		 this.Target=10;
		 }
		    
	 SalesManager(int Id,String Name ,double Salary ,double  Incentive,int Target){
	 		super(Id,Name,Salary);
		 this.Incentive=Incentive;
		 this.Target=Target;
		 
			
		 }
	 																																																																																																																					
	  double getIncentive() {
		 return Incentive;
	 }
	  void setIncentive(double incentive) {
		 Incentive = incentive;
	 }
	  int getTarget() {
		 return Target;
	 }
	  void setTarget(int target) {
		 Target = target;
	 }
	 
	 void display() {
		 super.display();
		 System.out.println("Incentive" +this.Incentive);
		 System.out.println("Target" +this.Target);
	 }
	 
}

abstract class AreaSales extends Employee{
	 
	 String AreaName;
	 
	  String getAreaName() {
		 return AreaName;
	 }

	  void setAreaName(String areaName) {
		 AreaName = areaName;
	 }
	 
	 AreaSales(){ // default constructor
		 super();
		 this.AreaName="pune"; 
		 }
	 AreaSales(int Id,String Name ,double Salary ,String AreaName){
	 		super(Id,Name,Salary);
		 this. AreaName = AreaName;
		 
			
		 }
	
	 
	 	void display(){
	 	super.display();
	 	System.out.println("AreaName=" +this.AreaName);
	 	}
	 }

class TestEmployee {
	
	public static void main(String[] args) {
	
		Employee e1;
		 e1 = new Hr(101 ,"shubham",5000,200);
		e1.display();
		System.out.println(e1.calsal());
		
		 e1 = new SalesManager(101 ,"shubham",5000,200,40);
		e1.display();
		System.out.println(e1.calsal());
		
		//e1 = new AreaSales(101 ,"shubham",4000,"nanded");
		//System.out.println(e1.calsal());
		//e1.display();
		
		
		
		
		
		}
}