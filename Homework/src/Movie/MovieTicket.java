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
		System.out.println("类型 : " + Movie.MovieType.toString());
		System.out.println("放映厅  : 放映厅" + Schedule.ScreeningHall);
		System.out.println("时间 : " + Schedule.MovieTime.toString());
		System.out.println("座位 : " + Seat.toString());
		System.out.println("*************************************");
	}
}
