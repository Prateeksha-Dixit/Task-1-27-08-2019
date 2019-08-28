package com.worldpay.bank;
import static java.lang.System.out;

public class BankAccount {


		private int accno;
		private String name,atype;
		private double balance;
		private static double totalDeposit;
		private static double totalWithdraw;
		private static double totalBalance;
		private static int totalAccount;

		/*-----------------------------Default Constructor--------------------------------------*/
		
		public BankAccount() {
			totalAccount++;
			
		}
		
		/*-----------------Parameterize Constructor for initializing BankAccount object--------------------------------------*/
		
		public BankAccount(int accno, String name, String type, double balance) {
			super();
			this.accno = accno;
			this.name = name;
			this.atype = type;
			this.balance = balance;
			totalBalance+=balance;
			totalAccount++;
			
		}
		
		/*-----------------------------Method for adding details of account--------------------------------------*/
		
		public void addAccountDetails(int accno, String name, String type, double balance) {
			this.accno = accno;
			this.name = name;
			this.atype = type;
			this.balance = balance;
			totalBalance+=balance;
		}
		
		/*---------------------------------Method for Account Details--------------------------------------*/
		
		public void showAccountDetails() {
			
			out.println("Account number: "+accno);
			out.println("Account Holder name: "+name);
			out.println("Account type: "+atype);
			out.println("Account balance: "+balance);
			
			
		}
		
		/*-----------------------------------Method for withdrawing money --------------------------------------*/
		
		public void withdraw(double amount) {
			balance-=amount;
			totalWithdraw+=amount;
			totalBalance-=amount;
			out.println("Balance left after withdraw: "+balance);
			
		}
		
		/*-----------------------------------Method for Depositing money--------------------------------------*/
		
		public void deposit(double amount) {
			balance+=amount;
			totalDeposit+=amount;
			totalBalance+=amount;
			out.println("Balance after deposit: "+balance);
			
			
		}
		
		/*-----------------------------Method for showing all transactions--------------------------------------*/
		
		public static void showTotalTransaction() {
			out.println("Total deposited amount : +"+totalDeposit);
			out.println("Total withdrawal amount : -"+totalWithdraw);
			
			
		}
		
		/*--------------------------Method for showing average balance--------------------------------------*/
		
		public static void avgBalance() {
			System.out.println("Average balance is "+(totalBalance/totalAccount));
			
		}
		
		/*-----------------------------------Driver Method-------------------------------------*/
		public static void main(String []args) {
         BankAccount a1=new BankAccount(01,"akansha", "savings", 100000);
         a1.showAccountDetails();
         a1.withdraw(5000);
         a1.deposit(25000);
         out.println();
       
         
         BankAccount a2=new BankAccount();
         a2.addAccountDetails(02, "Prateeksha", "savings", 200000);
         a2.showAccountDetails();
         a2.withdraw(5000);
         a2.deposit(2000);
         out.println();
         
         
         BankAccount a3=new BankAccount();
         a3.addAccountDetails(02, "Handay", "savings", 18000);
         a3.showAccountDetails();
         a3.withdraw(2000);
         a3.deposit(3000);
         out.println();
         
         BankAccount a4=new BankAccount();
         a4.addAccountDetails(02, "Kkay", "salary", 20000);
         a4.showAccountDetails();
         a4.withdraw(8000);
         a4.deposit(6000);
         out.println();
         
         showTotalTransaction();
         avgBalance();
         
		}
         
         
	

}
