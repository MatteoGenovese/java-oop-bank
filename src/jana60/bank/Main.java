package jana60.bank;

public class Main {
	
	
	public static void main(String[] args) {
		
		BankAccount user1 = new BankAccount(111111, "Matteo");
		
		System.out.println("------------------------------------------");
		
		System.out.println("getAccountOwner:"+user1.getAccountNumber());
		System.out.println("------------------------------------------");
		
		System.out.println("getAccountOwner:"+user1.getAccountOwner());
		System.out.println("------------------------------------------");
		
		System.out.println("getAccountOwner:"+user1.getBalance());
		System.out.println("------------------------------------------");
		
		user1.getMoney(200);
		System.out.println(user1);
		System.out.println("------------------------------------------");
		
		
		user1.AddMoney(200);
		System.out.println(user1);
		System.out.println("------------------------------------------");
		
		user1.getMoney(200);
		System.out.println(user1);
		System.out.println("------------------------------------------");
		
		
	}

}
