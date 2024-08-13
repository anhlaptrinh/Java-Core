package baitap1;

import java.util.Scanner;

public class Cau3 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n;

	        // Yêu cầu người dùng nhập một số nguyên dương
	        while (true) {
	            System.out.print("Nhập một số nguyên dương lớn hơn 0: ");
	            if (scanner.hasNextInt()) {
	                n = scanner.nextInt();
	                if (n > 0) {
	                    break;
	                } else {
	                    System.out.println("Số nhập vào phải lớn hơn 0. Vui lòng thử lại.");
	                }
	            } else {
	                System.out.println("Đầu vào không hợp lệ. Vui lòng nhập một số nguyên dương.");
	                scanner.next(); // Xóa đầu vào không hợp lệ
	            }
	        }

	        // Tính tổng các số lẻ nhỏ hơn n
	        int sum = 0;
	        for (int i = 1; i < n; i += 2) {
	            sum += i;
	        }

	        // In ra kết quả
	        System.out.println("Tổng các số lẻ nguyên dương nhỏ hơn " + n + " là: " + sum);

	        scanner.close();
	    }
}
