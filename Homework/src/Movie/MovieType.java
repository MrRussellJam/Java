package Movie;

import java.io.Serializable;

public enum MovieType implements Serializable
{
	Romantic("°®ÇéÆ¬") , ComedyFilms("Ï²¾çÆ¬") , ActionFilm("¶¯×÷Æ¬") , SciFi("¿Æ»ÃÆ¬");
	String name;
	
	MovieType(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return this.name;
	}
}

