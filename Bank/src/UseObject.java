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
			System.out.println("���㣬ȡ��ʧ��!");
		Account li4 = new Account();
		if(!zhang3.withdraw(150))
			System.out.println("���㣬ת��ʧ�ܣ�");
		else 
			li4.deposit(150);
		System.out.println("�������Ϊ" + zhang3.getBalance());
		System.out.println("�������Ϊ" + li4.getBalance());
	}
}
