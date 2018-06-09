import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HW_1 {
	
	static void prt(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		prt("Pleas input the month:");
		int month; 
		try {
			System.out.println("please input a count:");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String inputLine1 = in.readLine();
			month = Integer.parseInt(inputLine1);
		}catch(Exception exc) {
			System.out.println("用户输入的数据有误");
			return;
		}
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:{
				prt("31");
				break;
			}	
			case 4:
			case 6:
			case 9:
			case 11:{
				prt("30");
				break;
			}
			default: prt("28 or 29");
		}
	}
}
