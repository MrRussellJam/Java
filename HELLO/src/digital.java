import java.util.Scanner;

public class digital {
	static int sum=0;
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("����10������:  ");
		int i=0;
		int [] a=new int [10];
		for(i=0;i<=9;i++){
			a[i]=in.nextInt();
			}
		in.close();
		int j=0;int sum=0,max=0,min=999999;
			double ave=0.0;
			for(j=0;j<10;j++) {
				sum=sum+a[j];
			if (a[j]>max) 
				max=a[j];
			if (a[j]<min) 
				min=a[j];	
			}
			ave=sum*1.0/10;
			System.out.print("���ֵΪ:"+max);
			System.out.print("��СֵΪ:"+min);
			System.out.print("��Ϊ:"+sum);
			System.out.print("ƽ��ֵΪ:"+ave);
			}
	}