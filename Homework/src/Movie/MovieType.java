package Movie;

import java.io.Serializable;

public enum MovieType implements Serializable
{
	Romantic("����Ƭ") , ComedyFilms("ϲ��Ƭ") , ActionFilm("����Ƭ") , SciFi("�ƻ�Ƭ");
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

