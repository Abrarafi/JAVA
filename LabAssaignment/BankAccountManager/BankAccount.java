package Lab_test_1.P1_BankAccountManager;

public class BankAccount {
    String accountNumber;
	String accountHolderName;
	double balance;
	BankAccount(String s1,String s2, double bal)
	{
		accountNumber=s1;
		accountHolderName=s2;
		balance=bal;
	}
	public void deposit(double amount)
	{
		balance+=amount;
	}
	public void withdraw(double amount)
	{
		balance-=amount;
	}
	public void displayAccountDetails()
	{
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder: "+ accountHolderName);
		System.out.println("Balance: "+balance);
		System.out.println();
	}
}
