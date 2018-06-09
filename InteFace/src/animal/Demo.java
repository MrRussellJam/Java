package animal;

public class Demo {
	public static void main(String[] args) {
		Animal a = new Cat();
		Animal b = new Dog();
		a.eatFood();
		a.sleep();
		b.eatFood();
		b.sleep();
		int[][] s = new int[10][2];
		System.out.println(s.length);
	}

}
