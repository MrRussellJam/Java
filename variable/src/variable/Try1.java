package variable;
import java.io.*;
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
 */

public class Try1 {
	public static void swap(int[] a,int[] b) {
		int temp = 0;
		temp = a[0];
		a[0] = b[0];
		b[0] = temp;
	}
	
	public static void main(String[] args) {
		int[] x =new int[1] ;
		int[] y = new int[1];
		
		try {
			System.out.println("请输入两个数值");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String inputLine1 = in.readLine();
			x[0] = Integer.parseInt(inputLine1);
			String inputLine2 = in.readLine();
			y[0] = Integer.parseInt(inputLine2);
		}catch(Exception exc) {
			System.out.println("用户输入的数据有误");
			return;
		}

		System.out.println(x[0] + "," + y[0]);
		swap(x,y);
		System.out.println(x[0] + "," + y[0]);
	}
	
	/**
	public static double max(double x,double y) {
		double z;
		if(x>=y) z = x;
		else z = y;
		return z;
	}
	
	public static void main(String[] args) {
		
		double value1,value2,value3;
		System.out.println("请输入三个Double类的数值");
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String inputLine1 = in.readLine();
			value1 = Double.parseDouble(inputLine1);
			String inputLine2 = in.readLine();
			value2 = Double.parseDouble(inputLine2);
			String inputLine3 = in.readLine();
			value3 = Double.parseDouble(inputLine3);
		}catch(Exception exc) {
			System.out.print("用户没有输入一个合法的数值");
			return;
		}
		double temp;
		temp=max(value1,max(value2,value3));
		System.out.println("最大值为" + temp);
	}
	*/
	/**
	class DataOnly{
		int i = 10;
		float f = 1.4f;
		boolean b = false;
	}
	
	public static void main(String[] args) {
		Try1 b =new Try1();
		
		DataOnly d = b.new DataOnly();
		d.b = true;
		d.f = 9.2f;
		d.i = 100;
		
		System.out.println(d.i);
		System.out.println(d.f);
		System.out.println(d.b);
	}
*/
	/**
	public static void main(String[] args) {
		int i;
		int j;
		int a=8;
		int k=1;
		char s='H';
		
		
		for(i=1;i<=9;i++) {
			for(j=0;j<a;j++){
				System.out.print(" ");
			}
			a--;
			if(k==1) System.out.print(k);
			else {
				for(j=0;j<k*2-1;j++) {
					System.out.print(k);
				}
			}
			k++;
			System.out.print("\n");
		}
		a=1;
		for(i=1;i<=8;i++) {
			if(s<'A') break;
			for(j=0;j<73-s;j++)
				System.out.print(" ");
			for(j=0;j<(s-64)*2 - 1;j++)
				System.out.print(s);
			s--;
			System.out.print("\n");
		}
	}
	*/
	
	/**
	public static void main(String[] args) {
		double d = 3.1415926;
		int n = (int) d;
		System.out.println("d="+d);
		System.out.println(n);
	}*/
}
