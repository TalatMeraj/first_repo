package aap_java_8;
//Advantage-we can sort the object any of the parameters, name,rating, year, you can sorting.
//Comprator can sort based on multiple identifier.
import java.util.ArrayList;//5
//import java.util.ArrayList();
import java.util.Collections;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
	   
//		String str="star";
//		String str="titanic";
//		String str="KGF";
		Movie m1= new Movie("Star",2023,5);
		Movie m2= new Movie("Titanic",1997,6);
		Movie m3=new Movie("KGF",2021,2);
		
		List<Movie> movies =new ArrayList<Movie>();
		movies.add(m1);
        movies.add(m2);
        movies.add(m3);

       // System.out.println(movies);
        NameCompare name = new NameCompare();
		Collections.sort(movies,name);
		
		for(Movie movie : movies) {
			System.out.println(movie.getName());
			System.out.println(movie.getYear());
			System.out.println(movie.getRating());
		}
		
	}
}
