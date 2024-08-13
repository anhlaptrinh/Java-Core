package baitap4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankManagement {
	 private static BankAccount savingsAccount = null;
	    private static BankAccount checkingAccount = null;
	    private static Map<String, BankAccount> accounts = new HashMap<>();
	    private static String loggedInAccountNumber = null;

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        boolean running = true;

	        while (running) {
	            System.out.println(">>>>>>>>>>>>>>>>Hệ Thống Quản Lý Ngân Hàng>>>>>>>>>>>>>>>>");
	            System.out.println("1. Đăng ký tài khoản");
	            System.out.println("2. Đăng nhập tài khoản");
	            System.out.println("3. Gửi tiền vào tài khoản tiết kiệm");
	            System.out.println("4. Rút tiền từ tài khoản tiết kiệm");
	            System.out.println("5. Thêm lãi suất vào tài khoản tiết kiệm");
	            System.out.println("6. Gửi tiền vào tài khoản thanh toán");
	            System.out.println("7. Rút tiền từ tài khoản thanh toán");
	            System.out.println("8. Hiển thị thông tin tài khoản tiết kiệm");
	            System.out.println("9. Hiển thị thông tin tài khoản thanh toán");
	            System.out.println("10. Đăng xuất");
	            System.out.println("11. Thoát");
	            System.out.print("Chọn chức năng (1-11): ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline left-over

	            switch (choice) {
	                case 1:
	                    // Đăng ký tài khoản
	                    registerAccount(scanner);
	                    break;

	                case 2:
	                    // Đăng nhập tài khoản
	                    loginAccount(scanner);
	                    break;

	                case 3:
	                    // Gửi tiền vào tài khoản tiết kiệm
	                    if (loggedInAccountNumber != null && savingsAccount != null) {
	                        System.out.print("Số tiền gửi vào tài khoản tiết kiệm: ");
	                        double depositSavings = scanner.nextDouble();
	                        scanner.nextLine(); // Consume newline left-over
	                        savingsAccount.deposit(depositSavings);
	                    } else {
	                        System.out.println("Vui lòng đăng nhập tài khoản tiết kiệm trước.");
	                    }
	                    break;

	                case 4:
	                    // Rút tiền từ tài khoản tiết kiệm
	                    if (loggedInAccountNumber != null && savingsAccount != null) {
	                        System.out.print("Số tiền rút từ tài khoản tiết kiệm: ");
	                        double withdrawSavings = scanner.nextDouble();
	                        scanner.nextLine(); // Consume newline left-over
	                        savingsAccount.withdraw(withdrawSavings);
	                    } else {
	                        System.out.println("Vui lòng đăng nhập tài khoản tiết kiệm trước.");
	                    }
	                    break;

	                case 5:
	                    // Thêm lãi suất vào tài khoản tiết kiệm
	                    if (loggedInAccountNumber != null && savingsAccount != null) {
	                        ((SavingsAccount) savingsAccount).addInterest();
	                    } else {
	                        System.out.println("Vui lòng đăng nhập tài khoản tiết kiệm trước.");
	                    }
	                    break;

	                case 6:
	                    // Gửi tiền vào tài khoản thanh toán
	                    if (loggedInAccountNumber != null && checkingAccount != null) {
	                        System.out.print("Số tiền gửi vào tài khoản thanh toán: ");
	                        double depositChecking = scanner.nextDouble();
	                        scanner.nextLine(); // Consume newline left-over
	                        checkingAccount.deposit(depositChecking);
	                    } else {
	                        System.out.println("Vui lòng đăng nhập tài khoản thanh toán trước.");
	                    }
	                    break;

	                case 7:
	                    // Rút tiền từ tài khoản thanh toán
	                    if (loggedInAccountNumber != null && checkingAccount != null) {
	                        System.out.print("Số tiền rút từ tài khoản thanh toán: ");
	                        double withdrawChecking = scanner.nextDouble();
	                        scanner.nextLine(); // Consume newline left-over
	                        checkingAccount.withdraw(withdrawChecking);
	                    } else {
	                        System.out.println("Vui lòng đăng nhập tài khoản thanh toán trước.");
	                    }
	                    break;

	                case 8:
	                    // Hiển thị thông tin tài khoản tiết kiệm
	                    if (loggedInAccountNumber != null && savingsAccount != null) {
	                        savingsAccount.display_info();
	                    } else {
	                        System.out.println("Vui lòng đăng nhập tài khoản tiết kiệm trước.");
	                    }
	                    break;

	                case 9:
	                    // Hiển thị thông tin tài khoản thanh toán
	                    if (loggedInAccountNumber != null && checkingAccount != null) {
	                        checkingAccount.display_info();
	                    } else {
	                        System.out.println("Vui lòng đăng nhập tài khoản thanh toán trước.");
	                    }
	                    break;

	                case 10:
	                    // Đăng xuất
	                    loggedInAccountNumber = null;
	                    System.out.println("Đăng xuất thành công.");
	                    break;

	                case 11:
	                    System.out.println("Thoát...");
	                    running = false;
	                    break;

	                default:
	                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn từ 1 đến 11.");
	                    break;
	            }
	        }

	        scanner.close();
	    }

	    private static void registerAccount(Scanner scanner) {
	        System.out.println("Đăng ký tài khoản:");
	        System.out.print("Loại tài khoản (1: Tiết kiệm, 2: Thanh toán): ");
	        int accountType = scanner.nextInt();
	        scanner.nextLine(); // Consume newline left-over

	        System.out.print("Số tài khoản: ");
	        String accountNumber = scanner.nextLine();
	        System.out.print("Chủ tài khoản: ");
	        String accountHolder = scanner.nextLine();
	        System.out.print("Số dư ban đầu: ");
	        double initialBalance = scanner.nextDouble();

	        if (accountType == 1) {
	            System.out.print("Lãi suất: ");
	            double interestRate = scanner.nextDouble();
	            scanner.nextLine(); // Consume newline left-over
	            savingsAccount = new SavingsAccount(accountNumber, accountHolder, initialBalance, interestRate);
	            accounts.put(accountNumber, savingsAccount);
	            System.out.println("Tài khoản tiết kiệm đã được đăng ký thành công.");
	        } else if (accountType == 2) {
	            System.out.print("Giới hạn thấu chi: ");
	            double overdraftLimit = scanner.nextDouble();
	            scanner.nextLine(); // Consume newline left-over
	            checkingAccount = new CheckingAccount(accountNumber, accountHolder, initialBalance, overdraftLimit);
	            accounts.put(accountNumber, checkingAccount);
	            System.out.println("Tài khoản thanh toán đã được đăng ký thành công.");
	        } else {
	            System.out.println("Lựa chọn không hợp lệ.");
	        }
	    }

	    private static void loginAccount(Scanner scanner) {
	        System.out.println("Đăng nhập tài khoản:");
	        System.out.print("Số tài khoản: ");
	        String accountNumber = scanner.nextLine();

	        BankAccount account = accounts.get(accountNumber);
	        if (account != null) {
	            loggedInAccountNumber = accountNumber;
	            System.out.println("Đăng nhập thành công vào tài khoản: " + accountNumber);
	        } else {
	            System.out.println("Tài khoản không tồn tại. Vui lòng đăng ký trước.");
	        }
	    }
}
