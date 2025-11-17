package Abstraction;

abstract class Artist {
    String name;
    String artStyle;

    Artist() {
        this.name = "Unknown Artist";
        this.artStyle = "General Art";
    }

    Artist(String name, String artStyle) {
        this.name = name;
        this.artStyle = artStyle;
    }
    

     String getName() {
		return name;
	}

	 void setName(String name) {
		this.name = name;
	}

	 String getArtStyle() {
		return artStyle;
	}

	 void setArtStyle(String artStyle) {
		this.artStyle = artStyle;
	}

	abstract void perform();

    
    public String toString() {
    	return super.toString() + "Name: " + name + "Art Style: " + artStyle;
    }
}

class Singer extends Artist {
    String genre;
    String famousSong;

    Singer() {
        super();
        this.genre = "Classical";
        this.famousSong = "Unknown";
    }

    Singer(String name, String artStyle, String genre, String famousSong) {
        super(name, artStyle);
        this.genre = genre;
        this.famousSong = famousSong;
    }
    

     String getGenre() {
		return genre;
	}

	 void setGenre(String genre) {
		this.genre = genre;
	}

	 String getFamousSong() {
		return famousSong;
	}

	 void setFamousSong(String famousSong) {
		this.famousSong = famousSong;
	}

	void perform() {
        System.out.println(name + " is singing a " + genre + " song: \"" + famousSong + "\".");
    }

	@Override
	public String toString() {
		return "Singer [genre=" + genre + ", famousSong=" + famousSong + ", name=" + name + ", artStyle=" + artStyle
				+ "]";
	}
        
    
   
}

class Painter extends Artist {
    String paintingStyle;
    String famousPainting;

    Painter() {
        super();
        this.paintingStyle = "Modern";
        this.famousPainting = "Untitled";
    }

    Painter(String name, String artStyle, String paintingStyle, String famousPainting) {
        super(name, artStyle);
        this.paintingStyle = paintingStyle;
        this.famousPainting = famousPainting;
    }
    

     String getPaintingStyle() {
		return paintingStyle;
	}

	 void setPaintingStyle(String paintingStyle) {
		this.paintingStyle = paintingStyle;
	}

	 String getFamousPainting() {
		return famousPainting;
	}

	 void setFamousPainting(String famousPainting) {
		this.famousPainting = famousPainting;
	}

	void perform() {
        System.out.println(name + " is painting a masterpiece in " + paintingStyle + " style.");
    }

	@Override
	public String toString() {
		return "Painter [paintingStyle=" + paintingStyle + ", famousPainting=" + famousPainting + ", name=" + name
				+ ", artStyle=" + artStyle + "]";
	}

   
}

class Actor extends Artist {
    String movieName;
    String roleType;

    Actor() {
        super();
        this.movieName = "Unknown";
        this.roleType = "Supporting";
    }

    Actor(String name, String artStyle, String movieName, String roleType) {
        super(name, artStyle);
        this.movieName = movieName;
        this.roleType = roleType;
    }
    

     String getMovieName() {
		return movieName;
	}

	 void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	 String getRoleType() {
		return roleType;
	}

	 void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	void perform() {
        System.out.println(name + " is acting as " + roleType + " in the movie \"" + movieName + "\".");
    }

	@Override
	public String toString() {
		return "Actor [movieName=" + movieName + ", roleType=" + roleType + ", name=" + name + ", artStyle=" + artStyle
				+ "]";
	}

   
    
}

class TestArtist {
    public static void main(String[] args) {
        Artist a1;

        a1 = new Singer("Lata Mangeshkar", "Singing", "Classical / Playback", "Lag Jaa Gale");
        System.out.println(a1);
        a1.perform();

        a1 = new Painter("M. F. Husain", "Painting", "Modern / Cubist", "Horses Series");
        System.out.println(a1);
        a1.perform();

        a1 = new Actor("Amitabh Bachchan", "Acting", "Sholay", "Lead Role");
        System.out.println(a1);
        a1.perform();
    }
}



