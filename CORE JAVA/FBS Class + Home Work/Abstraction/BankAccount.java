package Abstraction;

import java.util.Scanner;


abstract class Account {

    int accNo;
    String accHolderName;
    double balance;
    static String bankName = "SBI";

    // Default Constructor
    Account() {
        this.accNo = 1001;
        this.accHolderName = "Om";
        this.balance = 50000;
        bankName = "SBI";
    }

    // Parameterized Constructor
    Account(int accNo, String accHolderName, double balance) {
        this.accNo = accNo;
        this.accHolderName = accHolderName;
        this.balance = balance;
        bankName = "SBI";
    }

    int getAccNo() {
        return accNo;
    }

    void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    String getAccHolderName() {
        return accHolderName;
    }

    void setAccHolderName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    static String getBankName() {
        return bankName;
    }

    
    
    @Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accHolderName=" + accHolderName + ", balance=" + balance + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	void withdraw() {
    	System.out.println("Process of Withdraw stratted");
    }
} // class Account ends here


class SavingAccount extends Account {

    double interestRate;
    static double minBal=1000;
    double amount;
    
    

    SavingAccount() {
        super(); 
        this.interestRate = 5.0;
  
    }

    SavingAccount(int accNo, String accHolderName, double balance, double interestRate,int a) {
        super(accNo, accHolderName, balance);
        this.interestRate = interestRate;
        this.amount=a;
    }

    double getInterestRate() {
        return interestRate;
    }

    void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
 
    
    @Override
	public String toString() {
		return "SavingAccount [interestRate=" + interestRate + ", amount=" + amount + ", accNo=" + accNo
				+ ", accHolderName=" + accHolderName + ", balance=" + balance + "]";
	}

	void withdraw() {
    	
    	if(this.balance - amount <= minBal) {
    		System.out.println("you are not eligible to withdrawal");
    		
    	}
    	else
    	{
    		System.out.println("Withdrawl succesfull");
    		System.out.println("withdrwal by :" +this.accHolderName);
    		System.out.println("current balance is" + (this.balance=(this.balance-this.amount)));
    	}
    	
    	
    }

} // class SavingAccount ends here


class CurrentAccount extends Account {

    double overdraftLimit;

    CurrentAccount() {
        super();
        this.overdraftLimit = 25000;
    }

    CurrentAccount(int accNo, String accHolderName, double balance, double overdraftLimit) {
        super(accNo, accHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    double getOverdraftLimit() {
        return overdraftLimit;
    }

    void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }


	@Override
	public String toString() {
		return "CurrentAccount [overdraftLimit=" + overdraftLimit + ", accNo=" + accNo + ", accHolderName="
				+ accHolderName + ", balance=" + balance + "]";
	}
    

} // class CurrentAccount ends here


class SalaryAccount extends Account {

    double loanAmount;
    int loanDuration; 

    SalaryAccount() {
        super();
        this.loanAmount = 100000;
        this.loanDuration = 24;
    }

   SalaryAccount(int accNo, String accHolderName, double balance, double loanAmount, int loanDuration) {
        super(accNo, accHolderName, balance);
        this.loanAmount = loanAmount;
        this.loanDuration = loanDuration;
    }

    double getLoanAmount() {
        return loanAmount;
    }

    void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    int getLoanDuration() {
        return loanDuration;
    }

    void setLoanDuration(int loanDuration) {
        this.loanDuration = loanDuration;
    }


	@Override
	public String toString() {
		return "SalaryAccount [loanAmount=" + loanAmount + ", loanDuration=" + loanDuration + ", accNo=" + accNo
				+ ", accHolderName=" + accHolderName + ", balance=" + balance + "]";
	}
    

} // class LoanAccount ends here


class Demo_Account {

    public static void main(String[] args) {

        Account a1;  // ✔ declare reference only (because Account is abstract)

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Balance that you want to withdraw :");
        int a = sc.nextInt();

        a1 = new SavingAccount(101, "shubham", 8000, 12, a);
        System.out.println(a1);
        a1.withdraw();
    }
}
