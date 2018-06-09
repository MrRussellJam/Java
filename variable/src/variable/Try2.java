package variable;

public class Try2 {
	public static void main(String[] args) {
		int i;
		int j;
		int a=8;
		int k=1;
		
		for(i=1;i<=9;i++) {
			for(j=0;j<a;j++){
				System.out.print(" ");
			}
			a--;
			if(k==1) System.out.println(k);
			else {
				for(j=0;j<k*k-1;j++) {
					System.out.println(k);
				}
			}
		}
	}
	
	/**public static void main(String[] agrs)
	{
		int num[] = new int[10];
		int i,j=10;
		for(i=0;i<10;i++) {
			num[i]=++j+i;
		}
		for(i=0;i<10;i++) {
			System.out.print(num[i]+" ");
		}
	}
	*/
	
	/**public static void main(String[] args) {
		System.out.println("Java\nÓï\bÑÔ");
		System.out.println("Java\rÓïÑÔ");
		System.out.println("Java\tÓïÑÔ");;
	}
	*/
	
	/**
	public static void main(String[] args) {
		char c1 = 'A',c2;
		int i;
		i = c1 + 1;
		c2 = (char)i;
		boolean x=c1>c2;
		boolean y=c1<c2;
		System.out.println(x);
		System.out.println(y);
		System.out.println(Math.pow(c1, 2) + c2);
		System.out.println(c1 + "," + c2);
	}
	*/
}

