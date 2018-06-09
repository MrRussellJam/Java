package boringWork1;

import java.util.*;

class DealWork{
	public int average(int[] array) {
		int aver = 0;
		for(int i = 0;i < 10;i++) {
			aver += array[i];
		}
		
		return aver;
	}
}

public class Work3 {
	
	public static void main(String[] args) {
		int[] array = new int[10];
		Scanner in = new Scanner(System.in);
		
		int aver = 0,max = 0,min = 0;
		
		System.out.println("请输入十个数字（以空格隔开）:");
		for(int i = 0;i < 10;i++) {
			array[i] = in.nextInt();
		}
		
		max = array[0];
		min = array[0];
		
		for(int i = 0;i < 10;i++) {
			aver += array[i];
		}
		aver /= 10;
		
		for(int i = 0;i < 10;i++) {
			if(max < array[i]) 
				max = array[i];
			if(min > array[i]) 
				min = array[i];
		}

		System.out.println("平均值是:" + aver);
		System.out.println("最大值是:" + max);
		System.out.println("最小值是:" + min);
		
	}
	
}
