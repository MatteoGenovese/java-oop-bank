package jana60.bank;

public class BankAccount {
	
	private int accountNumber;
	private String accountOwner;
	private float balance;
	
	public BankAccount(int accountNumber, String accountOwner) {
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
		this.balance = 0;
	}
		
	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountOwner() {
		return accountOwner;
	}
	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}

	
	public void AddMoney(float money) {
		this.balance+=money;
	}
	
	public void getMoney(float moneyRequired) {
		if((this.balance-moneyRequired)<0)
		{
			System.out.println("It is not possible to get this amount of money, please check your balance.");
		}
		else {
			this.balance-=moneyRequired;
		}
	}
	
	public float getBalance() {
		return this.balance;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "accountNumber: "+accountNumber+
				"\naccountOwner: "+accountOwner+
				"\nbalance: "+balance;
	}

}
