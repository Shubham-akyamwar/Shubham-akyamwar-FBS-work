package inheritance;

public class MediaAccount {
	
	String username;
	String email;
	int posts;
	String country;
	int likes;
	
	 String getUsername() {
		return username;
	}
	 void setUsername(String username) {
		this.username = username;
	}
	 String getEmail() {
		return email;
	}
	 void setEmail(String email) {
		this.email = email;
	}
	 int getPosts() {
		return posts;
	}
	 void setPosts(int posts) {
		this.posts = posts;
	}
	 String getCountry() {
		return country;
	}
	 void setCountry(String country) {
		this.country = country;
	}
	 int getLikes() {
		return likes;
	}
	 void setLikes(int likes) {
		this.likes = likes;
	}
	
	 MediaAccount(){
		 username = "shubham";
		 email = "abc@gmail.com";
		 posts = 50;
		 country = "indian";
		 likes = 100;
	 } // default constructor
	 
	 MediaAccount(String username, String email, int posts, String country, int likes){
		 this.username = username;
		 this.email = email;
		 this.posts = posts;
		 this.country = country;
		 this.likes = likes;
	 }// parameterized constructor ends
	 
	 void display() {
		 System.out.println("\nMediaAccount username=" +this.username);
		 System.out.println("MediaAccount email=" +this.email);
		 System.out.println("MediaAccount posts=" +this.posts);
		 System.out.println("MediaAccount country=" +this.country);
		 System.out.println("MediaAccount likes=" +this.likes);
	 }
}// MediaAccount ends here

class instagram extends MediaAccount {
	 
	 	int followers;
	 	int highlight;
	 	int storyArchievs;
	 	int postArchieved;
	 	
		 int getFollowers() {
			return followers;
		}
		 void setFollowers(int followers) {
			this.followers = followers;
		}
		 int getHighlight() {
			return highlight;
		}
		 void setHighlight(int highlight) {
			this.highlight = highlight;
		}
		 int getStoryArchievs() {
			return storyArchievs;
		}
		 void setStoryArchievs(int storyArchievs) {
			this.storyArchievs = storyArchievs;
		}
		 int getPostArchieved() {
			return postArchieved;
		}
		 void setPostArchieved(int postArchieved) {
			this.postArchieved = postArchieved;
		}
		 
		 instagram(){
			 super();
			 followers = 500;
			 highlight = 20;
			 storyArchievs = 30;
			 postArchieved = 10;
		 }// default constructor ends 
	 	
	 	instagram(String username, String email, int posts, String country, int likes, int followers, int highlight, int storyArchievs, int postArchieved){
	 		super( username, email, posts, country,likes);
	 		this.followers = followers;
	 		this.highlight = highlight;
	 		this.storyArchievs = storyArchievs;
	 		this.postArchieved = postArchieved;
	 	}// parameterized constructor ends
	 	
	 	void display() {
	 		super.display();
	 		System.out.println("\ninstagram followers=" +this.followers);
	 		System.out.println("instagram highlight=" +this.highlight);
	 		System.out.println("instagram storyArchieved=" +this.storyArchievs);
	 		System.out.println("instagram postArchieved=" +this.postArchieved);
	 	}
} // instagram ends here

class linkedin extends MediaAccount {
	
	 	int connection;
	 	int profileview;
	 	int jobsappiled;
	 	
		 int getConnection() {
			return connection;
		}
		 void setConnection(int connection) {
			this.connection = connection;
		}
		 int getProfileview() {
			return profileview;
		}
		 void setProfileview(int profileview) {
			this.profileview = profileview;
		}
		 int getJobsappiled() {
			return jobsappiled;
		}
		 void setJobsappiled(int jobsappiled) {
			this.jobsappiled = jobsappiled;
		}
	 	
		 linkedin(){
			 super();
			    connection = 700;
			 	profileview = 250;
			 	jobsappiled = 40;
		 }// default constructor
		 
		 linkedin(String username, String email, int posts, String country, int likes,int connection,int profileview, int jobsappiled){
			 super(username, email, posts, country,likes);
			 this.connection = connection;
		     this.profileview = profileview;
		     this.jobsappiled = jobsappiled;
			 
		 } //parameterized constructor
		 
		 void display() {
			 super.display();
			 System.out.println("\nlinkedin connection=" + this.connection);
			 System.out.println("linkedin profileview=" + this.profileview);
			 System.out.println("linkedin jobsappiled=" + this.jobsappiled);
		 } 	
}// linkedin ends here

class Youtube extends MediaAccount {
	
		int subscribe;
		double watchtime;
		boolean monetized;
		double estimated;
		public int getSubscribe() {
			return subscribe;
		}
		 void setSubscribe(int subscribe) {
			this.subscribe = subscribe;
		}
		 double getWatchtime() {
			return watchtime;
		}
		 void setWatchtime(double watchtime) {
			this.watchtime = watchtime;
		}
		 boolean isMonetized() {
			return monetized;
		}
		 void setMonetized(boolean monetized) {
			this.monetized = monetized;
		}
		 double getEstimated() {
			return estimated;
		}
		 void setEstimated(double estimated) {
			this.estimated = estimated;
		}
		
		 Youtube(){
			 super();
			    subscribe =12500;
				watchtime = 4825.75;
				monetized = true;
				estimated = 15600.50;
		 }// default constructor
		 
		 Youtube(String username, String email, int posts, String country, int likes,int subscribe,double watchtime, boolean monetized, double estimated){
			super(username, email, posts, country,likes);
			this.subscribe =subscribe;
			this.watchtime =watchtime;
			this.monetized =monetized;
			this.estimated =estimated;
		 }  //parameterized constructor
		 
		 void display() {
			 super.display();
			 System.out.println("\nYoutube subscribe=" + this.subscribe);
			 System.out.println("Youtube watchtime=" + this.watchtime);
			 System.out.println("Youtube monetized=" + this.isMonetized());
			 System.out.println("Youtube estimated=" + this.estimated);
		 }
		
}// Youtube ends here

class TestMediaAccount {
	
	public static void main(String[] args) {
		instagram t1 = new instagram();
		t1.display();
		
		linkedin l1 = new linkedin();
		l1.display();
		
		Youtube y1 = new Youtube();
		y1.display();
	}
}
