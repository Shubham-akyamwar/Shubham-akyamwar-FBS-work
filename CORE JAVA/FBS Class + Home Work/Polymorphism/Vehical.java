package Polymorphism;


class Vehicle {
	 String brand;
	 String model;
	 int speed;
	 int noofwheels;
	 int seatcapacity;
	 double price;
	
	 Vehicle() {
		super();
		this.brand = "TATA";
		this.model = "punch";
		this.speed = 60;
		this.noofwheels = 4;
		this.seatcapacity = 5;
		this.price = 250000;
		System.out.println("Default vehicle Constructor");
	 }
	 Vehicle(String brand, String model, int speed, int noofwheels, int seatcapacity, double price,String brake) {
		super();
		this.brand = brand;
		this.model = model;
		this.speed = speed;
		this.noofwheels = noofwheels;
		this.seatcapacity = seatcapacity;
		this.price = price;
		System.out.println("Parameterized vehicle Constructor");
	 }
	 String getBrand() {
		 return brand;
	 }
	 void setBrand(String brand) {
		 this.brand = brand;
	 }
	 String getModel() {
		 return model;
	 }
	 void setModel(String model) {
		 this.model = model;
	 }
	 int getSpeed() {
		 return speed;
	 }
	 void setSpeed(int speed) {
		 this.speed = speed;
	 }
	 int getNoofwheels() {
		 return noofwheels;
	 }
	 void setNoofwheels(int noofwheels) {
		 this.noofwheels = noofwheels;
	 }
	 int getSeatcapacity() {
		 return seatcapacity;
	 }
	 void setSeatcapacity(int seatcapacity) {
		 this.seatcapacity = seatcapacity;
	 }
	 double getPrice() {
		 return price;
	 }
	 void setPrice(double price) {
		 this.price = price;
	 }
	 
	 void display() {
		 System.out.println("Brand is:" + this.brand );
		 System.out.println("Model is:" + this.model );
		 System.out.println("Speed is:" + this.speed );
		 System.out.println("NOofwheels is:" + this.noofwheels );
		 System.out.println("Seatcapacity is:" + this.seatcapacity );
		 System.out.println("Price is: " + this.price);
		 
	 }
	 void applyBrake() {
		 System.out.println("Brake has been Implemented");
	 }
	 
	 

} // class Vehicle ends here


class Car extends Vehicle{
	 int noOfdoors;
	 double bootspace;
	 boolean hassunroof;
	 String wheeldrive;
	 String typeofgear;
	 Car() {
		super();
		noOfdoors = 4;
		bootspace = 8;
		hassunroof = true;
		wheeldrive = "Frontwheeldrive";
		typeofgear = "manual";
		System.out.println("Default car constructor");
	 }
	 Car(int noOfdoors, double bootspace, boolean hassunroof, String wheeldrive, String typeofgear,String brand,String model,int speed,int noofwheels,int seatcapacity,double price,String brake) {
		super(brand,model,speed,noofwheels,seatcapacity,price,brake);
		this.noOfdoors = noOfdoors;
		this.bootspace = bootspace;
		this.hassunroof = hassunroof;
		this.wheeldrive = wheeldrive;
		this.typeofgear = typeofgear;
		System.out.println("Parametrized car constructed");
	 }
	 int getNoOfdoors() {
		 return noOfdoors;
	 }
	 void setNoOfdoors(int noOfdoors) {
		 this.noOfdoors = noOfdoors;
	 }
	 double getBootspace() {
		 return bootspace;
	 }
	 void setBootspace(double bootspace) {
		 this.bootspace = bootspace;
	 }
	 boolean isHassunroof() {
		 return hassunroof;
	 }
	 void setHassunroof(boolean hassunroof) {
		 this.hassunroof = hassunroof;
	 }
	 String getWheeldrive() {
		 return wheeldrive;
	 }
	 void setWheeldrive(String wheeldrive) {
		 this.wheeldrive = wheeldrive;
	 }
	 String getTypeofgear() {
		 return typeofgear;
	 }
	 void setTypeofgear(String typeofgear) {
		 this.typeofgear = typeofgear;
	 }
	 
	 void display() {
		 super.display();
		 System.out.println("NOofDoors: " + this.noOfdoors);
		 System.out.println("Bootspace: " + this.bootspace);
		 System.out.println("HassunRoof: " + this.hassunroof);
		 System.out.println("WheelDrive: " + this.wheeldrive);
		 System.out.println("TypeOfGear: " + this.typeofgear);
		 
	 }
	 void applyBrake() {
		 System.out.println("Cylindric Brake has been implemented");
	 }
	 
} // class car ends here

class Bike extends Vehicle{
	 int noofstands;
	 boolean kick;
	 
	 
	 Bike() {
		super();
		this.noofstands = 2;
		this.kick = true;
		
	 }


	 Bike(int noofstands, boolean kick,String brand,String model,int speed,int noofwheels,int seatcapacity,double price,String brake) {
		super(brand,model,speed,noofwheels,seatcapacity,price,brake);
		this.noofstands = noofstands;
		this.kick = kick;
	 }


	 int getNoofstands() {
		 return noofstands;
	 }


	 void setNoofstands(int noofstands) {
		 this.noofstands = noofstands;
	 }


	 boolean isKick() {
		 return kick;
	 }


	 void setKick(boolean kick) {
		 this.kick = kick;
	 }
	 void display() {
		 super.display();
		 System.out.println("NoofStands Is: " + this.noofstands);
		 System.out.println("IsKick: " + this.kick);
		 
	 }
	 void applyBrake() {
		 System.out.println("Disc brake has been implemented");
	 }
	 
	 
	 
} // class bike ends here

class Bus extends Vehicle{
	 int busNo;
	 String busType;
	 String fare;
	 Bus() {
		super();
		this.busNo = 101;
		this.busType = "AC";
		this.fare = "500";
	 }
	 Bus(String brand,String model,int speed,int noofwheels,int seatcapacity,int price,String brake,int busNo, String busType, String fare) {
		super(brand,model,speed,noofwheels,seatcapacity,price,brake);
		this.busNo = busNo;
		this.busType = busType;
		this.fare = fare;
	 }
	 int getBusNo() {
		 return busNo;
	 }
	 void setBusNo(int busNo) {
		 this.busNo = busNo;
	 }
	 String getBusType() {
		 return busType;
	 }
	 void setBusType(String busType) {
		 this.busType = busType;
	 }
	 String getFare() {
		 return fare;
	 }
	 void setFare(String fare) {
		 this.fare = fare;
	 }
	 void display() {
		 System.out.println("BusNo Is : " + this.busNo);
		 System.out.println("Bustype Is : " + this.busType);
		 System.out.println("Fare Is : " + this.fare);
		  
	 }
	 void applyBrake() {
		 System.out.println("Air Brake has been implemented");
	 }
	 
	 
	 
} // Class bus ends here

class TestVehicle{
	 public static void main(String[] args)
	 {
		 Vehicle v= new Vehicle();
		 v.display();
		 v.applyBrake();
		 System.out.println();
		 
		 v= new Car();
		 v.display();
		 v.applyBrake();
		 System.out.println();
		 
		 v= new Bike();
		 v.display();
		 v.applyBrake();
		System.out.println();
		
		v= new Bus();
		v.display();
		v.applyBrake();
		 
		 
		 
	 }
}
