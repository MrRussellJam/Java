package Movie;

import java.io.Serializable;

public class Movie implements Serializable {
	String MovieName;//电影名称
	MovieType MovieType;//电影类型


	Movie(String name,int i)
	{
		this.MovieName = name;
		switch(i) {
			case 1:
				this.MovieType = MovieType.Romantic;
				break;
			case 2:
				this.MovieType = MovieType.ComedyFilms;
				break;
			case 3:
				this.MovieType = MovieType.ActionFilm;
				break;
			case 4:
				this.MovieType = MovieType.SciFi;
				break;
		}
	}
	
//	@Override
//	public String toString()
//	{
//		return 
//	}
	
}
