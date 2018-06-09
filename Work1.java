package boringWork1;

public class Work1 {
	public static void main(String[] args){
		int i,j,k;
		
		k = 8;
		
		for(i=1;i<=9;i++) {
			
			for(j=1;j<=k;j++) {
				System.out.print(" ");
			}
			
			k--;
			
			for(j = 1;j<=2*i-1;j++) {
				System.out.print(i);
			}
			
			System.out.println();
		}
		
		k++;
		
		for(i = 72;i >= 65; i--) {
			
			for(j=0;j<=k;j++) {
				System.out.print(" ");
			}
			
			k++;
			
			for(j=0;j<2*(i-65)+1;j++) {
				System.out.print((char)i);
			}

			System.out.println();
		}
		
		
	}

}
