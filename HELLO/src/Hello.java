class Teacher{
	int age = 10;
	
	String name = "zssda";
}


class JavaTeacher extends Teacher{
	int age = 10;
	
	String name = "asdasd";
	public void print(){
		int debug = 0;
		System.out.println(this.name+"\n"+this.age);
		System.out.println(super.name+"\n"+super.age);
		debug = 1;
	}
	
}

class Hello{

	public static void main(String[] args){
		int debug = 0;
		JavaTeacher s = new JavaTeacher();
		s.print();
		debug = 1;
	}
	
}