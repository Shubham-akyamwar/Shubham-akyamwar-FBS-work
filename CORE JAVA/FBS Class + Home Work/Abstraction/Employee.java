package Abstraction;

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
	

		@Override
		public String toString() {
			return "Employee [Id=" + Id + ", Name=" + Name + ", Salary=" + Salary + ", getClass()=" + getClass()
					+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
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
	 

	 @Override
	 public String toString() {
		return "Hr [Commission=" + Commission + ", Id=" + Id + ", Name=" + Name + ", Salary=" + Salary + "]";
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
	 

	 @Override
	 public String toString() {
		return "SalesManager [Incentive=" + Incentive + ", Target=" + Target + ", Id=" + Id + ", Name=" + Name
				+ ", Salary=" + Salary + "]";
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
	

		@Override
		public String toString() {
			return "AreaSales [AreaName=" + AreaName + ", Id=" + Id + ", Name=" + Name + ", Salary=" + Salary + "]";
		}
	 	
	 	
	 }

class TestEmployee {
	
	public static void main(String[] args) {
	
		Employee e1;
		 e1 = new Hr(101 ,"shubham",5000,200);
		 e1.calsal();
		System.out.println(e1);
		
		 e1 = new SalesManager(101 ,"shubham",5000,200,40);
		 e1.calsal();
		System.out.println(e1);
		
//		e1 = new AreaSales(101 ,"shubham",4000,"nanded");
//		e1.calsal();
//		System.out.println(e1);
		
		
		
		}
}
