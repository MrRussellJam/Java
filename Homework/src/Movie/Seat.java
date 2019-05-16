package Movie;

import java.io.Serializable;

public class Seat implements Serializable
{
	private int Line; //��
	private int Seat; //λ
	
	Seat() { }
	Seat(int line,int seat)
	{
		this.Line = line;
		this.Seat = seat;
	}
	public int getLine() {
		return Line;
	}
	public void setLine(int line) {
		Line = line;
	}
	public int getSeat() {
		return Seat;
	}
	public void setSeat(int seat) {
		Seat = seat;
	}
	
	@Override
	public String toString()
	{
		return this.Line + "��" + this.Seat + "��";
	}
	
}
