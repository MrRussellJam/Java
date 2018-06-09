 import java.io.BufferedReader;
import java.io.InputStreamReader;




/**
public class Bank {
		
		public class xxx{
			public static double balance = 10000000;

		}
		
		public static void deposit (double amount){
			balance = balance + amount;
		}
		
		public static boolean whithdraw(double amount){
			if(amount<=balance){
				balance = balance - amount;
				return true;
			}
			else return false;
		}
		
		public static double getBalance(){
			return balance;
		}
		
		public static void main(String[] args){
			int c;
			int x;
			double amount;
			System.out.println("1.save money");
			System.out.println("2.put the balance");
			System.out.println("3.look at the balance");
			try{
				System.out.println("Please select a option");
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				String inputLine1 = in.readLine();
				c = Integer.parseInt(inputLine1);
			}catch(Exception exc){
				System.out.println("You touch a error");
				return;
			}
			
			switch(c){
				case(1):{
					try{
						System.out.println("How much do you want to save.");
						BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
						String inputLine2 = in.readLine();
						amount = Integer.parseInt(inputLine2);
					}catch(Exception exc){
						System.out.println("You touch a error");
						return;
					}
					deposit(amount);
				}
				case(2):
					try{
						BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
						System.out.println("How much do you want to get.");
						String inputLine2 = in.readLine();
						amount = Integer.parseInt(inputLine2);
					}catch(Exception exc){
						System.out.println("You touch a error");
						return;
					}
					whithdraw(amount);
				case(3):
					x = getBalance;
					System.out.println("your balance:" + x);
			}
			
		
		
		}
}

*/