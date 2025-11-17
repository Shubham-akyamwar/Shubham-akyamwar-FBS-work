package Abstraction;


abstract class MusicalInstrument {
    String name;
    String type;
    double price;

    MusicalInstrument() {
        name = "Unknown";
        type = "General";
        price = 0.0;
    }

    MusicalInstrument(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
    String getType() {
        return type;
    }
    void setType(String type) {
        this.type = type;
    }
    double getPrice() {
        return price;
    }
    void setPrice(double price) {
        this.price = price;
    }


   abstract void playSound() ;

	@Override
	public String toString() {
		return "MusicalInstrument [name=" + name + ", type=" + type + ", price=" + price + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
    
}

class Guitar extends MusicalInstrument {
    int numberOfStrings;

    Guitar() {
        super();
        numberOfStrings = 0;
    }

    Guitar(String name, String type, double price, int numberOfStrings) {
        super(name, type, price);
        this.numberOfStrings = numberOfStrings;
    }
    
     int getNumberOfStrings() {
		return numberOfStrings;
	}

	 void setNumberOfStrings(int numberOfStrings) {
		this.numberOfStrings = numberOfStrings;
	}


    void playSound() {
        System.out.println(" Guitar is strumming...");
    }

	@Override
	public String toString() {
		return "Guitar [numberOfStrings=" + numberOfStrings + ", name=" + name + ", type=" + type + ", price=" + price
				+ "]";
	}
    
}

class Piano extends MusicalInstrument {
    int numberOfKeys;

    Piano() {
        super();
        numberOfKeys = 0;
    }

    Piano(String name, String type, double price, int numberOfKeys) {
        super(name, type, price);
        this.numberOfKeys = numberOfKeys;
    }
    
     int getNumberOfKeys() {
		return numberOfKeys;
	}

	 void setNumberOfKeys(int numberOfKeys) {
		this.numberOfKeys = numberOfKeys;
	}

	

    void playSound() {
        System.out.println(" Piano is playing a melody...");
    }

	@Override
	public String toString() {
		return "Piano [numberOfKeys=" + numberOfKeys + ", name=" + name + ", type=" + type + ", price=" + price + "]";
	}
    
}

class Flute extends MusicalInstrument {
    String material;

    Flute() {
        super();
        material = "Unknown";
    }

    Flute(String name, String type, double price, String material) {
        super(name, type, price);
        this.material = material;
    }

     String getMaterial() {
		return material;
	}

	 void setMaterial(String material) {
		this.material = material;
	}

	
    void playSound() {
        System.out.println(" Flute is producing a soothing tone...");
    }

	@Override
	public String toString() {
		return "Flute [material=" + material + ", name=" + name + ", type=" + type + ", price=" + price + "]";
	}
    
}

class TestInstrument {
    public static void main(String[] args) {
        MusicalInstrument m1 = new Guitar("Yamaha F310", "String", 8500, 6);
        System.out.println("*----------------------------*");
        m1.playSound();
        System.out.println(m1);
        System.out.println("*----------------------------*");

        m1 = new Piano("Casio CTK-3500", "Keyboard", 12000, 61);
        System.out.println("*----------------------------*");
        m1.playSound();
        System.out.println(m1);
        System.out.println("*----------------------------*");

        m1 = new Flute("Bamboo Flute", "Wind", 800, "Bamboo");
        System.out.println("*----------------------------*");
        m1.playSound();
        System.out.println(m1);
        System.out.println("*----------------------------*");
    }
}