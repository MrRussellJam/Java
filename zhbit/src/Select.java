import java.util.*;

public class Select {
	String Alibaba = "Alibaba";
	String ofo = "ofo";
	String Mobike = "Mobike";
	
	public char selectColor() {
		char[] color = new char[]{'红','黄','蓝','绿','白','黑','紫'};
		int i;
		System.out.println("1.红");
		System.out.println("2.黄");
		System.out.println("3.蓝");
		System.out.println("4.绿");
		System.out.println("5.白");
		System.out.println("6.黑");
		System.out.println("7.紫");
		System.out.println("选择想要的颜色:");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		i = in.nextInt();
		if(i>7 || i<1 ) {
			System.out.println("输入格式错误");
			System.out.println("随机选取颜色");
			i = (int)(1+Math.random()*7);
		}
		return color[i];
	}

	public String selectBussiness(){
		int k;
		String Bussiness = null;
		System.out.println("1.Alibaba");
		System.out.println("2.ofo");
		System.out.println("3.Mobike");
		System.out.println("选择想要的公司:");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		k = in.nextInt();
		if(k>3 || k<1 ) {
			System.out.println("输入格式错误");
			System.out.println("随机选取公司");
			k = (int)(1+Math.random()*3);
		}
		switch(k) {
			case 1:
				Bussiness = this.Alibaba;
				break;
			case 2:
				Bussiness = this.ofo;
				break;
			case 3:
				Bussiness = this.Mobike;
				break;
		}
		
		return Bussiness;
	}
}
