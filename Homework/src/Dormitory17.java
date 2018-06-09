import java.util.Scanner;

public class Dormitory17 {
	final int roommates = 5;            //宿舍最大人数
	static int residueStu = 44;         //未安排的学生人数
	public boolean isFull = false;      //宿舍是否满人
	private int studentAmount = 0;      //宿舍现有多少人

	public Dormitory17(){
		
	}

	public Dormitory17(int sNumber){
		setStuNum(sNumber);
	}
	
	public static void main(String[] args) {
		Dormitory17 data [][] = new Dormitory17[2][5];
		Scanner in = new Scanner(System.in);
		int n;

		Dormitory17 aRoom = new Dormitory17(5);
		aRoom.judgeIsFull(aRoom.studentAmount);

		n=in.nextInt();
		Dormitory17 bRoom = new Dormitory17(n);
		bRoom.judgeIsFull(bRoom.studentAmount);


		n=in.nextInt();
		Dormitory17 cRoom = new Dormitory17(n);
		cRoom.judgeIsFull(cRoom.studentAmount);

		Dormitory17 dRoom = new Dormitory17(3);
		dRoom.judgeIsFull(dRoom.studentAmount);

		Dormitory17 eRoom = new Dormitory17(4);
		eRoom.judgeIsFull(eRoom.studentAmount);

		Dormitory17 fRoom = new Dormitory17(1);
		fRoom.judgeIsFull(fRoom.studentAmount);

		Dormitory17 gRoom = new Dormitory17(2);
		gRoom.judgeIsFull(gRoom.studentAmount);

		n=in.nextInt();
		Dormitory17 hRoom = new Dormitory17(n);
		hRoom.judgeIsFull(hRoom.studentAmount);

		n=in.nextInt();
		Dormitory17 iRoom = new Dormitory17(n);
		iRoom.judgeIsFull(iRoom.studentAmount);

		n=in.nextInt();
		Dormitory17 jRoom = new Dormitory17(n);
		jRoom.judgeIsFull(jRoom.studentAmount);
		in.close();

		data[0][0] = aRoom;
		data[0][1] = bRoom;
		data[0][2] = cRoom;
		data[0][3] = dRoom;
		data[0][4] = eRoom;
		data[1][0] = fRoom;
		data[1][1] = gRoom;
		data[1][2] = hRoom;
		data[1][3] = iRoom;
		data[1][4] = jRoom;
		
		System.out.println("未安排宿舍人数:" + Dormitory17.residueStu);
		int i,j;
		n=0;
		for(i=0;i<2;i++)
			for(j=0;j<5;j++) {
				System.out.println(n+1 + ".宿舍人数:" + data[i][j].studentAmount);
				if(data[i][j].isFull == true) System.out.println("宿舍已满人:真");
				else System.out.println("宿舍已满人:假");
				n++;
			}
		
		
	}
	
	public void setStuNum(int number) {
		if(number > this.roommates) number = this.roommates;
		if(number > residueStu) number = residueStu;
		studentAmount = number;
		Dormitory17.update(number);
	}
	
	public static void update(int number) {
		residueStu = residueStu - number;
	}
	
	public void judgeIsFull(int number) {
		if(number==this.roommates) this.isFull = true;
		else this.isFull = false;
	}
	
	public int getAmount() {
		return this.studentAmount;
	}
	
	
}