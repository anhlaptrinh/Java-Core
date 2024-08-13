package baitap4;

public class BankAccount {
	 protected String accountNumber;
	    protected String accountHolder;
	    protected double balance;

	    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
	        this.accountNumber = accountNumber;
	        this.accountHolder = accountHolder;
	        this.balance = initialBalance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Đã gửi: " + amount+"đ");
	        } else {
	            System.out.println("Số tiền gửi phải là số dương.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Đã rút: " + amount);
	        } else {
	            System.out.println("Số dư không đủ hoặc số tiền rút không hợp lệ.");
	        }
	    }

	    public void display_info() {
	        System.out.println("Số tài khoản: " + accountNumber);
	        System.out.println("Chủ tài khoản: " + accountHolder);
	        System.out.println("Số dư: " + balance);
	    }
}
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double initialBalance, double interestRate) {
        super(accountNumber, accountHolder, initialBalance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Đã thêm lãi suất: " + interest);
        System.out.println("Số dư hiện tại sau khi thêm lãi suất: " + balance);
    }

    @Override
    public void display_info() {
        super.display_info();
        System.out.println("Lãi suất: " + interestRate + "%");
    }
}
class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder, double initialBalance, double overdraftLimit) {
        super(accountNumber, accountHolder, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance + overdraftLimit) >= amount) {
            balance -= amount;
            System.out.println("Đã rút:: " + amount);
        } else {
            System.out.println("Số dư không đủ hoặc số tiền rút không hợp lệ.");
        }
    }

    @Override
    public void display_info() {
        super.display_info();
        System.out.println("Giới hạn thấu chi: " + overdraftLimit);
    }
}