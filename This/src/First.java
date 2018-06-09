
public class First {
	private int i = 0;
	First increment() {
		i++;
		return this;
	}
	
	void print() {
		System.out.println("i=" + i);
	}
	
	public static void main(String[] args) {
		First x = new First();
		x.increment().increment().increment().print();
		System.out.println(x.increment());
	}
}
