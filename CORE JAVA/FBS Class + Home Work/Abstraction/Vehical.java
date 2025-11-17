package Abstraction;

abstract class Vehicle {
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
	 
	abstract  void applyBrake() ;
	
	 @Override
	 public String toString() {
		return "Vehicle [brand=" + brand + ", model=" + model + ", speed=" + speed + ", noofwheels=" + noofwheels
				+ ", seatcapacity=" + seatcapacity + ", price=" + price + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
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
	 
	 void applyBrake() {
		 System.out.println("Cylindric Brake has been implemented");
	 }
	 @Override
	 public String toString() {
		return "Car [noOfdoors=" + noOfdoors + ", bootspace=" + bootspace + ", hassunroof=" + hassunroof
				+ ", wheeldrive=" + wheeldrive + ", typeofgear=" + typeofgear + ", brand=" + brand + ", model=" + model
				+ ", speed=" + speed + ", noofwheels=" + noofwheels + ", seatcapacity=" + seatcapacity + ", price="
				+ price + "]";
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
	
	 void applyBrake() {
		 System.out.println("Disc brake has been implemented");
	 }


	 @Override
	 public String toString() {
		return "Bike [noofstands=" + noofstands + ", kick=" + kick + ", brand=" + brand + ", model=" + model
				+ ", speed=" + speed + ", noofwheels=" + noofwheels + ", seatcapacity=" + seatcapacity + ", price="
				+ price + "]";
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
	
	 void applyBrake() {
		 System.out.println("Air Brake has been implemented");
	 }
	 @Override
	 public String toString() {
		return "Bus [busNo=" + busNo + ", busType=" + busType + ", fare=" + fare + ", brand=" + brand + ", model="
				+ model + ", speed=" + speed + ", noofwheels=" + noofwheels + ", seatcapacity=" + seatcapacity
				+ ", price=" + price + "]";
	 }
	 
	 
	 
} // Class bus ends here

class TestVehicle{
	 public static void main(String[] args)
	 {
	     Vehicle v;
//		 v= new Vehicle();
//		 v.applyBrake();
//		 System.out.println(v);
		 
		 v= new Car();
		 v.applyBrake();
		 System.out.println(v);
		 
		 v= new Bike();
		 v.applyBrake();
		System.out.println(v);
		
		v= new Bus();
		v.applyBrake();
		System.out.println(v);
		 
		 
	 }
}
