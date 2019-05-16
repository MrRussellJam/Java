package Movie;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo
{
	
	public static void main(String[] args)
	{
		Movie movie_1 = new Movie("疯狂的石头" , 2);
		MovieSchedule schedule_1 = new MovieSchedule(1,2010,7,12,20,20);
		Seat seat_1 = new Seat(10,12);
		MovieTicket Ticket_1 = new MovieTicket(movie_1 , schedule_1 , seat_1);
		Ticket_1.print();
		
		
		Movie movie_2 = new Movie("疯狂的石头" , 2);
		MovieSchedule schedule_2 = new MovieSchedule(1,2010,7,12,20,20);
		Seat seat_2 = new Seat(10,13);
		MovieTicket Ticket_2 = new MovieTicket(movie_2 , schedule_2 , seat_2);
		Ticket_2.print();
		
		Movie movie_3 = new Movie("2012" , 4);
		MovieSchedule schedule_3 = new MovieSchedule(2,2010,7,14,19,40);
		Seat seat_3 = new Seat(8,8);
		MovieTicket Ticket_3 = new MovieTicket(movie_3 , schedule_3 , seat_3);
		Ticket_3.print();
		
		Movie movie_4 = new Movie("2012" , 4);
		MovieSchedule schedule_4 = new MovieSchedule(2,2010,7,14,19,40);
		Seat seat_4 = new Seat(8,9);
		MovieTicket Ticket_4 = new MovieTicket(movie_4 , schedule_4 , seat_4);
		Ticket_4.print();

		
		List<MovieTicket> Ticket_List = new ArrayList<MovieTicket>();
		
		Ticket_List.add(Ticket_1);
		Ticket_List.add(Ticket_2);
		Ticket_List.add(Ticket_3);
		Ticket_List.add(Ticket_4);
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("***************************");
		try {
			FileOutputStream fileOut = new FileOutputStream(new File("d:\\Workspace\\Homework\\Ticket_List.txt"));
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(Ticket_List);
			fileOut.close();
			out.close();
			System.out.println("--------序列化成功!--------");
			System.out.println("***************************");
		}catch(IOException e) {
			e.printStackTrace();
		}
		List<MovieTicket> Serializable_List = new ArrayList<MovieTicket>();
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("d:\\Workspace\\Homework\\Ticket_List.txt")));
			try {
				Serializable_List = (ArrayList)in.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			in.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		for(MovieTicket temp : Serializable_List){
			temp.print();
		}
		System.out.println("--------反序列化成功!--------");
		
	}
	
}
