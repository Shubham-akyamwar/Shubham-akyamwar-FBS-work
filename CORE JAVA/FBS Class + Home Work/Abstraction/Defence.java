package Abstraction;

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
	 
	 void attack (){
		 System.out.println("attack mode activated");
	 }
	 
	 
	public String toString() {
		return super.toString() + "Defence Fmission" +this.Fmission +"Defence Head" +this.Head +"Defence Troops" +this.Troops + "Defence Dept" +this.Dept +"Defence Vehical" +this.Vehical +"Defence casualties" +this.casualties +"Defence LocationHeadquater" +this.LocationHeadquater + "Defence budget" +this.budget + "Defence CountName" +this.CountName;   
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
	  
	  void attack (){
			 System.out.println("Army attack");
		 }
	  
	  
	 public String toString() {
		 return super.toString() +"\nSArmy Tanks=" +this.tanks +"Army Granite=" +this.granite +"Army Guns=" +this.guns +"Army Bataline=" +this.bataline;
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
	  
	  void attack (){
			 System.out.println("attack mode Navy");
		 }
	  

	  public String toString() {
		  return super.toString() + "\nNavy Ships=" +this.Ships +"Navy submariens=" +this.submariens + "Navy torpedoes=" +this.torpedoes;
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
	 
	 void attack (){
		 System.out.println("attack mode Aircraft");
	 }
	 
	
	 public String toString() {
		 return super.toString() +"\nAircraft Fmission=" +this.Fmission + "Aircraft Aircraft=" +this.Aircraft +"Aircraft Squadron=" +this.Squadron;
	 }
	 
}// Aircraft ends here

class TestDefence {
	 public static void main(String[] args) {
		 Defence a1;
		  a1 = new Army();
		 System.out.println(a1);
		 
		  a1 = new Navy();
		 System.out.println(a1);
		 
		  a1 = new Aircraft();
		 System.out.println(a1);
		 
		 a1.attack();
		 a1.attack();
		 a1.attack();
		 a1.attack();
	 }
	 
}


