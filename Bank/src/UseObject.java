class Account{
	private double balance = 0;
	
	public void deposit(double amount){
		balance = balance + amount;
	}
	
	public boolean withdraw(double amount){
		if (amount <= balance){
			balance = balance - amount;
			return true;
		}else
			return false;
	}
	
	public double getBalance(){
		return balance;
	}
}

public class UseObject {
	public static void main(String[] args){
		Account zhang3 = new Account();
		zhang3.deposit(500);
		if(!zhang3.withdraw(100))
			System.out.println("余额不足，取款失败!");
		Account li4 = new Account();
		if(!zhang3.withdraw(150))
			System.out.println("余额不足，转账失败！");
		else 
			li4.deposit(150);
		System.out.println("张三余额为" + zhang3.getBalance());
		System.out.println("李四余额为" + li4.getBalance());
	}
}
