package samples.demo;

public class Location {
	private String fname;
	private String lname = "Ismaty";

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public static void main(String[] args) {
		Location lname_loc = new Location();
		
	    System.out.println(lname_loc.lname);
	}
}
