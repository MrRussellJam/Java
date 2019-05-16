public class Course {

	public static void main(String[] args) {
		// 创建一个二维数组，表示每个月的天数  
		int[][] daysMonth = {
				{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
				{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } };

		int sumDays = 0; // 经过的天数  

		//1777-5-0
		int year = 1777;
		int month = 4; // 初始化的月份是5月
		int day = 0; //初始化的号是0

		while (true) {

			int type = leapType(year);
			int[] dm = daysMonth[type];
			while (month < 12) {

				while (day < dm[month]) {
					sumDays++;
					day++;
					if (sumDays == 8113) {
						break ok;
					}

				}
                                //进入下一月
				month++;
				day = 0;
			}

	//进入下一年
			month = 0;
			year++;
		}

		System.out.println(year + "-" + (month + 1) + "-" + (day - 1));
	}

	// 如果是平年，返回0；如果是闰年，返回1  
	private static int leapType(int year) {
		int flag;
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			flag = 1;
		} else {
			flag = 0;
		}
		return flag;
	}

}


//
//public class Course {
//	String courseNo;
//	String courseName;
//	
//	Course(){ };
//	
//	Course(String courseNo , String courseName){
//		this.courseNo = courseNo;
//		this.courseName = courseName;
//	}
//	
//	
//	public String getCourseNo() {
//		return courseNo;
//	}
//	public void setCourseNo(String courseNo) {
//		this.courseNo = courseNo;
//	}
//	public String getCourseName() {
//		return courseName;
//	}
//	public void setCourseName(String courseName) {
//		this.courseName = courseName;
//	}
//	@Override
//	public String toString() {
//		return this.courseNo + "    " + this.courseName + "        " ;
//	}
//}
