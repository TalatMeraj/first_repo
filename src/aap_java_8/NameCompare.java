package aap_java_8;//4

import java.util.Comparator;

public class NameCompare implements Comparator<Movie> {
	@Override
	public int compare(Movie m1 , Movie m2) {
		return m1.getName().compareTo(m2.getName());
	}

}
