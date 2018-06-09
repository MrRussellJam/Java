import java.util.Scanner;

public class ExpectionCode {
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=0;
		int k = 0;
		String s = null;
		int[] intArray = new int[4];
		try {
			for(i=0;i<4;i++) {
				s = in.nextLine();
				intArray[i] = Integer.parseInt(s);
			}
		}catch(ArrayIndexOutOfBoundsException ex) {
			k=1;
		}catch(NumberFormatException ex) {
			k=2;
		}
		switch(k) {
			case 1:
				System.out.print("出现异常为数组越界");
				break;
			case 2:
				System.out.print("出现异常为输入不为整数");
				break;
			default:
					System.out.println("未出现异常");
		}
		
	}
	
}
