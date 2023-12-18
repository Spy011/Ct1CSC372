package CT1;

public class Test {
	
	public static void main(String[] args) {
		CheckingAccount testAccount = new CheckingAccount();
		testAccount.setFirstName("Steve");
		testAccount.setLastName("Yanez");
		testAccount.setAccountID(7541);
		testAccount.deposit(15000);
		testAccount.setInterestRate(5.0);
		testAccount.displayAccount();
		System.out.println();
		System.out.println("$12000 has been withdrawn");
		System.out.println();
		testAccount.withdrawal(12000);
		testAccount.displayAccount();
		System.out.println();
		System.out.println("Attempting to withdrawal $3100");
		testAccount.withdrawal(3100);
		testAccount.displayAccount();
	}

}
