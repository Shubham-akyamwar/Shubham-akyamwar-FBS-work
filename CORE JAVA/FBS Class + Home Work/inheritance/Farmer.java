package inheritance;

public class Farmer {
		
	int id;
	String name;
	double area;
	String city;
	double annualincome;
	int equipment;
	
	 int getId() {
		return id;
	}
	 void setId(int id) {
		this.id = id;
	}
	 String getName() {
		return name;
	}
	 void setName(String name) {
		this.name = name;
	}
	 double getArea() {
		return area;
	}
	 void setArea(double area) {
		this.area = area;
	}
	 String getCity() {
		return city;
	}
	 void setCity(String city) {
		this.city = city;
	}
	 double getAnnualincome() {
		return annualincome;
	}
	 void setAnnualincome(double annualincome) {
		this.annualincome = annualincome;
	}
	 int getEquipment() {
		return equipment;
	}
	 void setEquipment(int equipment) {
		this.equipment = equipment;
	}
	
	 Farmer(){
		 
		     id = 9552;
			 name = "shantanu";
			 area = 80*20;
			 city = "nanded";
			 annualincome = 50000;
			 equipment = 10;
			 
	 }// default constructor ends 
	 
	 Farmer(int id, String name, double area, String city, double annualincome, int equipment) {
		
		 this.id =id;
		 this.name = name;
		 this.area = area;
		 this.city = city;
		 this.annualincome = annualincome;
		 this.equipment = equipment;
	 } // parameterized constructor ends
	 
	 void display(){
		 System.out.println("Farmer id=" +this.id);
		 System.out.println("Farmer name=" +this.name);
		 System.out.println("Farmer area=" +this.area);
		 System.out.println("Farmer city=" +this.city);
		 System.out.println("Farmer annualincome=" +this.annualincome);
		 System.out.println("Farmer equipment=" +this.equipment);
		 
	 }
	 	 	
}// farmer class ends here

class Dairyfarmer extends Farmer {
	
		String cattle;
		double milkperday;
		String licenceno;
		
		 String getCattle() {
			return cattle;
		}
		 void setCattle(String cattle) {
			this.cattle = cattle;
		}
		 double getMilkperday() {
			return milkperday;
		}
		 void setMilkperday(double milkperday) {
			this.milkperday = milkperday;
		}
		 String getLicenceno() {
			return licenceno;
		}
		 void setLicenceno(String licenceno) {
			this.licenceno = licenceno;
		}
		 
	Dairyfarmer(){
		
		super();
		cattle = "cow";
		milkperday = 12.5;
		licenceno = "MH25DA1234";
	}// default constructor ends
	
	
	Dairyfarmer(int id, String name, double area, String city, double annualincome, int equipment, String cattle, double milkperday, String licenceno){
		super( id, name, area, city, annualincome, equipment);
		this.cattle = cattle;
		this.milkperday = milkperday;
		this.licenceno = licenceno;
	}// parameterized constructor ends
	
	void display() {
		super.display();
		System.out.println("\nDairyfarmer cattle=" +this.cattle);
		System.out.println("Dairyfarmer milkperday=" +this.milkperday);
		System.out.println("Dairyfarmer licenceno=" +this.licenceno);
	}
		
} // dairyfarmer ends here

class poultryFarmer extends Farmer {
	  
	 int hens;
	 String name;
	 int shades;
	 int eggsProduced;
	 
	  int getHens() {
		 return hens;
	 }
	  void setHens(int hens) {
		 this.hens = hens;
	 }
	  String getName() {
		 return name;
	 }
	  void setName(String name) {
		 this.name = name;
	 }
	  int getShades() {
		 return shades;
	 }
	  void setShades(int shades) {
		 this.shades = shades;
	 }
	  int getEggsProduced() {
		 return eggsProduced;
	 }
	  void setEggsProduced(int eggsProduced) {
		 this.eggsProduced = eggsProduced;
	 }
	  
	  poultryFarmer() {
		  super();
		   hens = 1000;
		   name = "shyam";
		   shades = 10;
		   eggsProduced = 120;
	  } // default constructor ends
	  
	  poultryFarmer(int id, String name, double area, String city, double annualincome, int equipment,int hens,  int shades, int eggsProduced){
		  super(id, name, area, city, annualincome, equipment);
		  
		  this.hens = hens;
		  this.name = name;
		  this.shades = shades;
		  this.eggsProduced = eggsProduced;
	  }// parameterized constructor ends here
	  
	  void display() {
		  super.display();
		  System.out.println("\npoultryFarmer hens=" +this.hens);
		  System.out.println("poultryFarmer name=" +this.name);
		  System.out.println("poultryFarmer shades=" +this.shades);
		  System.out.println("poultryFarmer eggsproduced=" +this.eggsProduced);
	  }
	 	
}// poultryFarmer ends here

class organicFarmer extends Farmer {
	
	  int organicId;
	  String organicType;
	  String fertilizar;
	  
	   int getOrganicId() {
		  return organicId;
	  }
	   void setOrganicId(int organicId) {
		  this.organicId = organicId;
	  }
	   String getOrganicType() {
		  return organicType;
	  }
	   void setOrganicType(String organicType) {
		  this.organicType = organicType;
	  }
	   String getFertilizar() {
		  return fertilizar;
	  }
	   void setFertilizar(String fertilizar) {
		  this.fertilizar = fertilizar;
	  }
	  
	   organicFarmer(){
		   
		   super();
		       organicId = 9890;
			   organicType  = "Vermicompost";
			   fertilizar = "Cow Manure";
	   }// default constructor ends 
	   
	   organicFarmer(int id, String name, double area, String city, double annualincome, int equipment,int organicId,String organicType, String fertilizar ){
		   super(id, name, area, city, annualincome, equipment);
		   
		   this.organicId = organicId;
		   this.organicType = organicType;
		   this.fertilizar = fertilizar;
	   }// parameterized constructor ends
	   
	   void display() {
		   super.display();
		   System.out.println("\norganicFarmer organicId=" + this.organicId);
		   System.out.println("organicFarmer organicType=" + this.organicType);
		   System.out.println("organicFarmer fertilizar=" + this.fertilizar);
	   }
}// organicFarmer ends here

class TestFarmer {
	public static void main(String[] args) {
		Dairyfarmer d1 = new Dairyfarmer();
		d1.display();
		
		poultryFarmer p1 = new poultryFarmer();
		p1.display();
		
		organicFarmer o1 = new organicFarmer();
		o1.display();
	}
}





