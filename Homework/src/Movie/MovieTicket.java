package Movie;

import java.io.Serializable;

public class MovieTicket implements Serializable
{
	Movie Movie;
	MovieSchedule Schedule;
	Seat Seat;
	
	MovieTicket() {}
	
	MovieTicket(Movie inMovie, MovieSchedule inMovieSchedule , Seat inSeat )
	{
		this.Movie = inMovie;
		this.Schedule = inMovieSchedule;
		this.Seat = inSeat;
	}
	
	public void print()
	{
		System.out.println(Movie.MovieName);
		System.out.println("���� : " + Movie.MovieType.toString());
		System.out.println("��ӳ��  : ��ӳ��" + Schedule.ScreeningHall);
		System.out.println("ʱ�� : " + Schedule.MovieTime.toString());
		System.out.println("��λ : " + Seat.toString());
		System.out.println("*************************************");
	}
}
