package assignmentPackage2;
/*
 * Assignment 4:- Design a class for a bank which should support the following operations.
    		1. Deposit a certain amount into an account,
    		2. Withdrawing a certain amount from an account,
  			3. Return a value specifying the amount (i.e. balance) in an amount.
 */
public class Assignment4 {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		b1.checkBalance();
		b1.deposit(1000);
		b1.checkBalance();
		b1.withdraw(5000);
		BankAccount b2 = new BankAccount(25000);
		b2.checkBalance();
		b2.withdraw(1200);
		b2.checkBalance();
	}
	
	public static class BankAccount {
		private int balance;
		
		public BankAccount() {
			balance = 0;
		}
		
		public BankAccount(int bal) {
			balance = bal;
		}
		
		public void deposit(int amnt) {
			balance += amnt;
		}
		
		public void withdraw(int amnt) {
			if(balance - amnt >= 0) {
				balance -= amnt;
			}
			else {
				System.out.println("Insufficient Funds");
			}
		}
		
		public void checkBalance() {
			System.out.println("Balance: " + balance);
		}
	}

}
