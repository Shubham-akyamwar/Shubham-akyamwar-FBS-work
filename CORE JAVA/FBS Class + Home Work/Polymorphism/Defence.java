package Polymorphism;


class Defence {
	
	int Fmission;
	String Head;
	int Troops;
	int Dept;
	int Vehical;
	int casualties;
	String LocationHeadquater;
	double budget;
	String CountName;
	
	
	 int getFmission() {
		return Fmission;
	}
	 void setFmission(int fmission) {
		Fmission = fmission;
	}
	 String getHead() {
		return Head;
	}
	 void setHead(String head) {
		Head = head;
	}
	 int getTroops() {
		return Troops;
	}
	 void setTroops(int troops) {
		Troops = troops;
	}
	 int getDept() {
		return Dept;
	}
	 void setDept(int dept) {
		Dept = dept;
	}
	 int getVehical() {
		return Vehical;
	}
	 void setVehical(int vehical) {
		Vehical = vehical;
	}
	 int getCasualties() {
		return casualties;
	}
	 void setCasualties(int casualties) {
		this.casualties = casualties;
	}
	 String getLocationHeadquater() {
		return LocationHeadquater;
	}
	 void setLocationHeadquater(String locationHeadquater) {
		LocationHeadquater = locationHeadquater;
	}
	 double getBudget() {
		return budget;
	}
	 void setBudget(double budget) {
		this.budget = budget;
	}
	 String getCountName() {
		return CountName;
	}
	 void setCountName(String countName) {
		CountName = countName;
	}
	
	 Defence(){
		 
		     Fmission = 20;
			 Head = "genral MsDhoni";
			 Troops = 15;
			 Dept = 8;
			 Vehical = 200;
			 casualties = 500;
			 LocationHeadquater = "Delhi";
			 budget = 500000;
			 CountName = "india"; 
	 }
	 
	 Defence(int f,String h, int t, int d, int v, int c, String l, double b, String cn){
		 
		 this.Fmission = f;
		 this.Head = h;
		 this.Troops = t;
		 this.Dept = d;
		 this.Vehical = v;
		 this.casualties = c;
		 this.LocationHeadquater = l;
		 this.budget = b;
		 this.CountName = cn;
	 }
	 
	 void display(){
		 
		 System.out.println("Defence Fmission" +this.Fmission);
		 System.out.println("Defence Head" +this.Head);
		 System.out.println("Defence Troops" +this.Troops);
		 System.out.println("Defence Dept" +this.Dept);
		 System.out.println("Defence Vehical" +this.Vehical);
		 System.out.println("Defence casualties" +this.casualties);
		 System.out.println("Defence LocationHeadquater" +this.LocationHeadquater);
		 System.out.println("Defence budget" +this.budget);
		 System.out.println("Defence CountName" +this.CountName);
	 }	
	 
	 void attack (){
		 System.out.println("attack mode activated");
	 }
	
} // defence ends here

class Army extends Defence{
	 
	 int tanks;
	 int granite;
	 int guns ;
	 int bataline;
	 
	  int getTanks() {
		 return tanks;
	 }
	  void setTanks(int tanks) {
		 this.tanks = tanks;
	 }
	  int getGranite() {
		 return granite;
	 }
	  void setGranite(int granite) {
		 this.granite = granite;
	 }
	  int getGuns() {
		 return guns;
	 }
	  void setGuns(int guns) {
		 this.guns = guns;
	 }
	  int getBataline() {
		 return bataline;
	 }
	  void setBataline(int bataline) {
		 this.bataline = bataline;
	 }
	  
	  Army (){
		  	super();
		   tanks = 20;
		   granite = 40;
		   guns = 4000 ;
		   bataline = 100;
		  
	  } //default const ends here
	  
	  Army(int f,String h, int t, int d, int v, int c, String l, double b, String cn, int ta, int gr, int gu,int ba){
		  	 super(f,h,t,d,v,c,l,b,cn);
		     this.tanks = ta;
			 this.granite = gr;
			 this.guns = gu;
			 this.bataline = ba;
	  }
	  
	  void display() {
		  super.display();
		  System.out.println("\nSArmy Tanks=" +this.tanks);
		  System.out.println("Army Granite=" +this.granite);
		  System.out.println("Army Guns=" +this.guns);
		  System.out.println("Army Bataline=" +this.bataline);
	  }
	  void attack (){
			 System.out.println("Army attack");
		 }
	 
}// Army ends here


class Navy extends Defence{
	   
	  int Ships;
	  int submariens;
	  int torpedoes;
	  
	   int getShips() {
		  return Ships;
	  }
	   void setShips(int ships) {
		  Ships = ships;
	  }
	   int getSubmariens() {
		  return submariens;
	  }
	   void setSubmariens(int submariens) {
		  this.submariens = submariens;
	  }
	   int getTorpedoes() {
		  return torpedoes;
	  }
	  public void setTorpedoes(int torpedoes) {
		  this.torpedoes = torpedoes;
	  }
	  
	  Navy (){
		  super();
		  Ships= 500;
		  submariens = 5;
		  torpedoes =50;
	  } // default const ends
	  
	  Navy (int f,String h, int t, int d, int v, int c, String l, double b, String cn, int sh, int su, int to){
		  super(f,h,t,d,v,c,l,b,cn);
		  this.Ships = sh;
		  this.submariens = su;
		  this.torpedoes = to;
	  } // paramerterized const ends here
	  
	  void display() {
		  super.display();
		  System.out.println("\nNavy Ships=" +this.Ships);
		  System.out.println("Navy submariens=" +this.submariens);
		  System.out.println("Navy torpedoes=" +this.torpedoes);
	  }
	  void attack (){
			 System.out.println("attack mode Navy");
		 }
}// Navy ends here

class Aircraft extends Defence{
	 
	 int Fmission;
	 int Aircraft;
	 int Squadron;
	 
	  int getFmission() {
		 return Fmission;
	 }
	  void setFmission(int fmission) {
		 Fmission = fmission;
	 }
	  int getAircraft() {
		 return Aircraft;
	 }
	  void setAircraft(int aircraft) {
		 Aircraft = aircraft;
	 }
	  int getSquadron() {
		 return Squadron;
	 }
	  void setSquadron(int squadron) {
		 Squadron = squadron;
	 }
	  
	  Aircraft (){
		  	  super();
		      Fmission = 10;
			  Aircraft = 50;
			  Squadron = 100;
	  }// default cost ends here
	 
	 Aircraft(int f,String h, int t, int d, int v, int c, String l, double b, String cn ,int fm, int ai, int sq){
		 super(f,h,t,d,v,c,l,b,cn);
		 this.Fmission = fm;
		 this.Aircraft = ai;
		 this.Squadron = sq;
		 
	 }// parameterized ends here
	 
	 void display() {
		 super.display();
		 System.out.println("\nAircraft Fmission=" +this.Fmission);
		 System.out.println("Aircraft Aircraft=" +this.Aircraft);
		 System.out.println("Aircraft Squadron=" +this.Squadron);
	 }
	 void attack (){
		 System.out.println("attack mode Aircraft");
	 }
}// Aircraft ends here

class TestDefence {
	 public static void main(String[] args) {
		 Army a1 = new Army();
		 a1.display();
		 a1.attack();
		 
		 Navy n1 = new Navy();
		 n1.display();
		 n1.attack();
		 
		 Aircraft s1 = new Aircraft();
		 s1.display();
		 s1.attack();
	 }
	 
}


