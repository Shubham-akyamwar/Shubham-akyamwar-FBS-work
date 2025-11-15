package Polymorphism;

class Farmer {

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

	void display() {
		System.out.println("Farmerid is :  " + this.Farmerid);
		System.out.println("Farmername is :  " + this.Farmername);
		System.out.println("Landarea is :  " + this.Landarea);
		System.out.println("City is :  " + this.City);
		System.out.println("Annualincome is :  " + this.Annualincome);
		System.out.println("Noofequipment is :  " + this.Noofequipment);
		System.out.println("InsuranceAmt is :  " + this.InsuranceAmt);

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
	
	void dispaly() {

		super.display();
		System.out.println("OrganicestId is : " + this.OrganicestId);
		System.out.println("Croptype  is : " + this.Croptype);
		System.out.println("Fertilizerused is : " + this.Fertilizerused);

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

		void display() {

			super.display();
			System.out.println("PoultryFarmname is : " + this.PoultryFarmname);
			System.out.println("NumberofChickens is : " + this.NumberofChickens);
			System.out.println("NumberofHens is : " + this.NumberofHens);
			System.out.println("NumberofSheds is : " + this.NumberofSheds);
			System.out.println("EggsProducedPerday is : " + this.EggsProducedPerday);
			System.out.println("ShedCapacity is : " + this.ShedCapacity);
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

			void display() {
				
				super.display();
				System.out.println("NoOfCattles is : " + this.NoOfCattles);
				System.out.println("milkeProducedPerday is : " + this.milkeProducedPerday);
				System.out.println("dairyLicenceNo is : " + this.dairyLicenceNo);

			}

		}	

class TestFarmer {
    public static void main(String[] args) {

        System.out.println("\n");
        Farmer f2 = new Farmer(201, "Suresh", 12.5, "Nagpur", 250000.0, 40, 50000.0);
        f2.display();

        System.out.println("\n");
        Organicfarmer of1 = new Organicfarmer();
        of1.dispaly(); 

        System.out.println("\n");
        dairyFarmer d1 = new dairyFarmer();
        d1.display();

        System.out.println("\n");
        PoultryFarm p1 = new PoultryFarm();
        p1.display();
        
        f2.Calsubsidy();
        of1.Calsubsidy();
        d1.Calsubsidy();
        p1.Calsubsidy();
    }
}
