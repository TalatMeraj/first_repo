package aap_java_8;//2

import java.util.Comparator;

public class MovieYear  implements Comparator<Movie>{

	@Override
	public int compare(Movie m1, Movie m2) {
		{
			if(m1.getYear() < m2.getYear())
				return -1;
			if(m1.getYear() > m2.getYear())
				return 1;
			else
				return 0;
		}
	}
}
