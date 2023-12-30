package aap_java_8;//1
//Comparable Statement:-can sort based on any one identifier.D-28/7/23..Comprable can sort based on any one identifier.
//Comparator Statement seprate class..D-31/7/23.
public class Movie {
	
	private String name;
	private int year;
	private int rating;
	
	public Movie(String name,int year,int rating) {
		this.name=name;
		this.year=year;
		this.rating=rating;
		
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	public int getRating() {
		return rating;
	}
}
//	@Override
//	public int compareTo (Movie o) {
//		
//		return year-o.year;
//	}


