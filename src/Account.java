
public class Account {

	private String name;
	private double balance;
	
	public Account(String name, double balance)
	{
		this.name = name;
		do
		{
			if (balance > 0.0)
				this.balance = balance;
			else
			{
				System.out.println("The balance is negative please try again.");		
			}
		} while (balance < 0.0);
	}
	
	public void deposit(double depositAmount)
	{
		if (depositAmount > 0.0)
			balance = balance + depositAmount;
		else
			System.out.println("Deposit amount is not valid.");
	}
	
	public void withdraw(double withdrawAmount)
	{
		if (withdrawAmount <= balance)
			balance = balance - withdrawAmount;
		else
			System.out.println("Withdrawal amount exceeded account balance.");
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	public static void main(String[]args) {
		
	}
	

}
