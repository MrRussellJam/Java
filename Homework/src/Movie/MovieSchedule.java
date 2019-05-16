package Movie;

import java.io.Serializable;


public class MovieSchedule implements Serializable {
	int ScreeningHall;//放映厅
	DateTime MovieTime; // 放映时间

	MovieSchedule(){}
	MovieSchedule(int i,int year,int month,int day,int hour,int minute)
	{
		this.ScreeningHall = i;
		MovieTime = new DateTime(year,month,day,hour,minute);
	}
}

class DateTime implements Serializable
{
	int year,month,day,hour,minute;
	DateTime(){}
	DateTime(int year,int month,int day,int hour,int minute)
	{
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
	}
	
	@Override
	public String toString()
	{
		return year + "年" + month + "月" + day + "日"
				+" " + hour + "时" + minute + "分";
	}
}
