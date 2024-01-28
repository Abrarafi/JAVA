package Lab_test_1.P1_BankAccountManager;

public class Main {
    public static void main(String args[])
	{
		BankAccount account1=new BankAccount("12345","John Doe",1000.0);
		BankAccount account2=new BankAccount("67890","Jane Smith",500.0);
		account1.deposit(500.0);
		account2.withdraw(200.0);
		account1.displayAccountDetails();
		account2.displayAccountDetails();
	}
}
