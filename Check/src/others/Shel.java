package others;

import java.util.Scanner;

public class Shel {
	final double normaldigital=60;//定义及格分数
	static int score;//定义分数
	private static boolean isjige =true;     //判断是否及格
	public int number=10;     //定义人数

	public Shel(){
		
	}

	public Shel(int score){
		Shel.score=score;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] arr = new int[10][1];
		System.out.println(arr.length);
		for(int i= 0;i<arr.length;i++){
		arr[i][0] = input.nextInt();
		}
		for(int i= 0;i<arr.length;i++){
			int n=arr[i][0];
			if (n>=60) {
				setIsjige(true);
				System.out.println("真");
			}
			if(n<60) {
				setIsjige(false);
			System.out.println("假");
			}
		}
		input.close();
	}

	public static boolean isIsjige() {
		return isjige;
	}

	public static void setIsjige(boolean isjige) {
		Shel.isjige = isjige;
	}

}