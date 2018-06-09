
public class Demo1 {

	public static void main(String[] args) {
		FirstWork s1 = new FirstWork();
		s1.print();
		FirstWork.InFirst inS1 = s1.new InFirst();
		inS1.inPrint();
		
	}
	
}
