package CT1;

public class BankAccount {

	private String firstName;
	private String lastName;
	private int accountID;
	private double balance;
	
	public void constructor() {
		balance = 0;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String newFirstName) {
		this.firstName = newFirstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String newLastName) {
		this.lastName = newLastName;
	}
	
	public int getAccountID() {
		return accountID;
	}
	
	public void setAccountID(int newAccountID) {
		this.accountID = newAccountID;
	}
	
	public void deposit(double value) {
		balance += value;
	}
	public void withdrawal(double value) {
		if (value <= balance) {
			balance -= value;
		}
		else {
			balance -= value;
			System.out.println("You have overdrawn your account by -$" + (balance * -1));
			System.out.println("$30 overdraft fee has been applied.");
			System.out.println();
			balance = balance - 30; 
		}
	}
	
	public void accountSummary() {
		System.out.println("Your account summary is as follows:");
		System.out.println("Account holder & ID: " + firstName + " " + lastName + " - " 
		+ accountID);
		if (balance < 0) {
		System.out.println("Your balance is: -$" + (balance * -1));
		}
		else {
			System.out.println("Your balance is: $" + balance);
		}
	}
}	
	
