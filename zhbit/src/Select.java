import java.util.*;

public class Select {
	String Alibaba = "Alibaba";
	String ofo = "ofo";
	String Mobike = "Mobike";
	
	public char selectColor() {
		char[] color = new char[]{'��','��','��','��','��','��','��'};
		int i;
		System.out.println("1.��");
		System.out.println("2.��");
		System.out.println("3.��");
		System.out.println("4.��");
		System.out.println("5.��");
		System.out.println("6.��");
		System.out.println("7.��");
		System.out.println("ѡ����Ҫ����ɫ:");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		i = in.nextInt();
		if(i>7 || i<1 ) {
			System.out.println("�����ʽ����");
			System.out.println("���ѡȡ��ɫ");
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
		System.out.println("ѡ����Ҫ�Ĺ�˾:");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		k = in.nextInt();
		if(k>3 || k<1 ) {
			System.out.println("�����ʽ����");
			System.out.println("���ѡȡ��˾");
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
