package CT1;

class CheckingAccount extends BankAccount {
	
	private double interestRate;
	
	public CheckingAccount() {
		super();
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double newInterestRate) {
		this.interestRate = newInterestRate;
	}
		
		public void displayAccount() {
			accountSummary();
			System.out.println("You have an interest rate of " + interestRate + "%");
		}
	}


