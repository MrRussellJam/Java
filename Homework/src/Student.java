
public class Student {
	String stuNo;
	String stuName;
	
	Student(){ };
	
	Student(String stuNo , String stuName){
		this.stuNo = stuNo;
		this.stuName = stuName;
	}
	
	
	public String getStuNo() {
		return stuNo;
	}
	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	
	@Override
	public String toString() {
		return stuNo + "    " + stuName + "        ";
	}
}
