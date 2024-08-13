package baitap1;

import java.util.Scanner;

public class Cau5 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Nhập số tiền gửi ban đầu
	        System.out.print("Nhập số tiền gửi ban đầu (VND): ");
	        double initialAmount = getValidDoubleInput(scanner);

	        // Nhập số tiền mục tiêu
	        System.out.print("Nhập số tiền mục tiêu (VND): ");
	        double targetAmount = getValidDoubleInput(scanner);

	        // Nhập lãi suất tiết kiệm (tính theo phần trăm)
	        System.out.print("Nhập lãi suất tiết kiệm hàng năm (phần trăm): ");
	        double interestRate = getValidDoubleInput(scanner);

	        // Tính số năm cần chờ đợi
	        int years = calculateYears(initialAmount, targetAmount, interestRate);

	        // In ra kết quả
	        System.out.println("Số năm ít nhất cần chờ đợi là: " + years);

	        scanner.close();
	    }

	    // Hàm lấy đầu vào hợp lệ từ người dùng
	    private static double getValidDoubleInput(Scanner scanner) {
	        while (!scanner.hasNextDouble()) {
	            System.out.println("Đầu vào không hợp lệ. Vui lòng nhập một số.");
	            scanner.next(); // Xóa đầu vào không hợp lệ
	            System.out.print("Nhập lại: ");
	        }
	        return scanner.nextDouble();
	    }

	    // Hàm tính số năm cần thiết để số tiền đạt mục tiêu
	    private static int calculateYears(double initialAmount, double targetAmount, double interestRate) {
	        int years = 0;
	        double currentAmount = initialAmount;

	        while (currentAmount < targetAmount) {
	            currentAmount += currentAmount * (interestRate / 100);
	            years++;
	        }

	        return years;
	    }
}
