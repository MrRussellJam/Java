
import java.util.*;

public class ScroeManageSystem {

	public static void main(String[] args)
	{
		
		List<Course> course = new ArrayList<Course>();
		List<Score> score = new ArrayList<Score>();
		List<Student> stu = new ArrayList<Student>();

		stu.add(new Student("S001","郑东红"));
		stu.add(new Student("S002","陈明丽"));
		stu.add(new Student("S003","黄文杰"));

		course.add(new Course("C001","嵌入式编程原理"));
		course.add(new Course("C002","计算机专业英语"));
		course.add(new Course("C003","微机接口与技术"));
		

		score.add(new Score("S002" , "C001" , 82));
		score.add(new Score("S001" , "C003" , 67));
		score.add(new Score("S003" , "C003" , 83));
		

		score.add(new Score("S003" , "C002" , 81));
		score.add(new Score("S001" , "C002" , 90));
		score.add(new Score("S002" , "C002" , 73));

		score.add(new Score("S002" , "C003" , 85));
		score.add(new Score("S003" , "C001" , 92));
		score.add(new Score("S001" , "C001" , 76));
		
		Collections.sort(score,new Comparator<Score>()
		{
			@Override
			public int compare(Score o1, Score o2) { // 先对成绩的课程编号排序
				return o1.courseNo.compareTo(o2.courseNo);
			}
		}  );
		
		
		Collections.sort(score,new Comparator<Score>()
		{
			@Override
			public int compare(Score o1, Score o2) { // 再对学号的课程编号排序
				return o1.stuNo.compareTo(o2.stuNo);
			}
		}  );
		
		System.out.println("学号        姓名        课程编号        课程名称            成绩");
		
		for(Score temp:score)
		{
			for(Student stuTemp : stu) 
			{
				if(stuTemp.stuNo.compareTo(temp.stuNo) == 0) 
				{
					System.out.print(stuTemp.toString());
				}
			}
			for(Course courseTemp : course) 
			{
				if(courseTemp.courseNo.compareTo(temp.courseNo) == 0)
				{
					System.out.print(courseTemp.toString());
				}
			}
			
			System.out.print(temp.toString());
		}
		System.out.println("**********************************************");
		
		System.out.println("课程编号        课程名称        平均分");
		for(Course temp : course)
		{
			int sum = 0;
			int i = 0;
			for(Score scoreTemp : score) 
			{
				if(temp.courseNo.compareTo(scoreTemp.courseNo) == 0)
				{
					i++;
					sum += scoreTemp.score;
				}
			}
			System.out.println(temp.toString() + sum/3);
		}
	}
	
}
