package Abstraction;

 abstract class Farmer {

	int Farmerid;
	String Farmername;
	double Landarea;
	String City;
	double Annualincome;
	int Noofequipment;
	double InsuranceAmt;

	Farmer()

	{

		Farmerid = 102;
		Farmername = "Unknown";
		Landarea = 7.0;
		City = "Lonar";
		Annualincome = 150000.0;
		Noofequipment = 50;
		InsuranceAmt = 45000;
	}

	Farmer(int farmerid, String farmername, double landarea, String city, double annualincome, int noofequipment,
			double insuranceAmt) {
		super();
		Farmerid = farmerid;
		Farmername = farmername;
		Landarea = landarea;
		City = city;
		Annualincome = annualincome;
		Noofequipment = noofequipment;
		InsuranceAmt = insuranceAmt;
	}

	int getFarmerid() {
		return Farmerid;
	}

	void setFarmerid(int farmerid) {
		Farmerid = farmerid;
	}

	String getFarmername() {
		return Farmername;
	}

	void setFarmername(String farmername) {
		Farmername = farmername;
	}

	double getLandarea() {
		return Landarea;
	}

	void setLandarea(double landarea) {
		Landarea = landarea;
	}

	String getCity() {
		return City;
	}

	void setCity(String city) {
		City = city;
	}

	double getAnnualincome() {
		return Annualincome;
	}

	void setAnnualincome(double annualincome) {
		Annualincome = annualincome;
	}

	int getNoofequipment() {
		return Noofequipment;
	}

	void setNoofequipment(int noofequipment) {
		Noofequipment = noofequipment;
	}

	double getInsuranceAmt() {
		return InsuranceAmt;
	}

	void setInsuranceAmt(double insuranceAmt) {
		InsuranceAmt = insuranceAmt;
	}
	
	void Calsubsidy() {
	  System.out.println("recievd subsidy");
	}
	
	public String toString() {
		return super.toString()+"Farmerid is :  " + this.Farmerid +"Farmername is :  " + this.Farmername + "Landarea is :  " + this.Landarea + "City is :  " + this.City +"Annualincome is :  " + this.Annualincome +"Noofequipment is :  " + this.Noofequipment +"InsuranceAmt is :  " + this.InsuranceAmt; 
	}

	

}

class Organicfarmer extends Farmer {

	int OrganicestId;
	String Croptype;
	String Fertilizerused;

	Organicfarmer() {
		super();
		OrganicestId = 123;
		Croptype = "Wheat";
		Fertilizerused = "Chemical";

	}

	Organicfarmer(int organicestId, String croptype, String fertilizerused) {
		super();
		OrganicestId = organicestId;
		Croptype = croptype;
		Fertilizerused = fertilizerused;
	}

	int getOrganicestId() {
		return OrganicestId;
	}

	void setOrganicestId(int organicestId) {
		OrganicestId = organicestId;
	}

	String getCroptype() {
		return Croptype;
	}

	void setCroptype(String croptype) {
		Croptype = croptype;
	}

	String getFertilizerused() {
		return Fertilizerused;
	}

	void setFertilizerused(String fertilizerused) {
		Fertilizerused = fertilizerused;
	}

	void Calsubsidy() {
		  System.out.println("recievd subsidy");
		}
	

	
	public String toString() {
		return super.toString()+"OrganicestId is : " + this.OrganicestId +"Croptype  is : " + this.Croptype + "Fertilizerused is : " + this.Fertilizerused;
	}
	
}

	class PoultryFarm extends Farmer {

		String PoultryFarmname;
		int NumberofChickens;
		int NumberofHens;
		int NumberofSheds;
		int EggsProducedPerday;
		int ShedCapacity;

		PoultryFarm() {
			super();
			PoultryFarmname = "Unknown Farm";
			NumberofChickens = 0;
			NumberofHens = 0;
			NumberofSheds = 0;
			EggsProducedPerday = 0;
			ShedCapacity = 0;
		}

		PoultryFarm(String poultryFarmname, int numberofChickens, int numberofHens, int numberofSheds,
				int eggsProducedPerday, int shedCapacity) {
			super();
			PoultryFarmname = poultryFarmname;
			NumberofChickens = numberofChickens;
			NumberofHens = numberofHens;
			NumberofSheds = numberofSheds;
			EggsProducedPerday = eggsProducedPerday;
			ShedCapacity = shedCapacity;
		}

		String getPoultryFarmname() {
			return PoultryFarmname;
		}

		void setPoultryFarmname(String poultryFarmname) {
			PoultryFarmname = poultryFarmname;
		}

		int getNumberofChickens() {
			return NumberofChickens;
		}

		void setNumberofChickens(int numberofChickens) {
			NumberofChickens = numberofChickens;
		}

		int getNumberofHens() {
			return NumberofHens;
		}

		void setNumberofHens(int numberofHens) {
			NumberofHens = numberofHens;
		}

		int getNumberofSheds() {
			return NumberofSheds;
		}

		void setNumberofSheds(int numberofSheds) {
			NumberofSheds = numberofSheds;
		}

		int getEggsProducedPerday() {
			return EggsProducedPerday;
		}

		void setEggsProducedPerday(int eggsProducedPerday) {
			EggsProducedPerday = eggsProducedPerday;
		}

		int getShedCapacity() {
			return ShedCapacity;
		}

		void setShedCapacity(int shedCapacity) {
			ShedCapacity = shedCapacity;
		}
		
		void Calsubsidy() {
			  System.out.println("recievd subsidy");
			}

		
		public String toString() {
			return super.toString()+ "PoultryFarmname is : " + this.PoultryFarmname +"NumberofChickens is : " + this.NumberofChickens +"NumberofHens is : " + this.NumberofHens + "NumberofSheds is : " + this.NumberofSheds + "EggsProducedPerday is : " + this.EggsProducedPerday + "ShedCapacity is : " + this.ShedCapacity;   
		}
		

		
	}

class dairyFarmer extends Farmer 
{
	
			int NoOfCattles;
			double milkeProducedPerday;
			int dairyLicenceNo;

			dairyFarmer() {

				super();
				NoOfCattles = 0;
				this.milkeProducedPerday = 0;
				this.dairyLicenceNo = 0;
			}

			dairyFarmer(int noOfCattles, double milkeProducedPerday, int dairyLicenceNo) {
				super();
				NoOfCattles = noOfCattles;
				this.milkeProducedPerday = milkeProducedPerday;
				this.dairyLicenceNo = dairyLicenceNo;
			}

			int getNoOfCattles() {
				return NoOfCattles;
			}

			void setNoOfCattles(int noOfCattles) {
				NoOfCattles = noOfCattles;
			}

			double getMilkeProducedPerday() {
				return milkeProducedPerday;
			}

			void setMilkeProducedPerday(double milkeProducedPerday) {
				this.milkeProducedPerday = milkeProducedPerday;
			}

			int getDairyLicenceNo() {
				return dairyLicenceNo;
			}

			void setDairyLicenceNo(int dairyLicenceNo) {
				this.dairyLicenceNo = dairyLicenceNo;
			}
			
			public String toString() {
				return super.toString()+ "NoOfCattles is : " + this.NoOfCattles +"milkeProducedPerday is : " + this.milkeProducedPerday +"dairyLicenceNo is : " + this.dairyLicenceNo;
			}

		}	

class TestFarmer {
    public static void main(String[] args) {

        System.out.println("\n");
        Farmer f2 ;
        
        System.out.println("\n");
        f2 = new Organicfarmer();
        System.out.println(f2);

        System.out.println("\n");
        f2 = new dairyFarmer();
        System.out.println(f2);

        System.out.println("\n");
        f2 = new PoultryFarm();
        System.out.println(f2);
        
        f2.Calsubsidy();
        f2.Calsubsidy();
        f2.Calsubsidy();
        f2.Calsubsidy();
    }
}
