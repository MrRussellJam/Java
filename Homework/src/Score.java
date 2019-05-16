import java.util.Collections;
import java.util.Comparator;

public class Score{
	String stuNo;
	String courseNo;
	int score;
	
	Score(){ };
	
	Score(String stuNo , String coureNo , int score){
		this.stuNo = stuNo;
		this.courseNo = coureNo;
		this.score = score;
	}
	
	
	
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	public String getCourseNo() {
		return courseNo;
	}
	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}
	public int getScore() {
		return score;
	}



	public void setScore(int score) {
		this.score = score;
	}



	@Override
	public String toString() {
		return score + "\n";
	}

}
