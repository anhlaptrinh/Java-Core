package baitap1;

import java.util.Scanner;

public class Cau1_2 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Yêu cầu người dùng nhập vào một số nguyên
	        System.out.print("Nhập vào một số nguyên: ");
	        int number = scanner.nextInt();

	        // Kiểm tra và in kết quả
	        if (isPrime(number)) {
	            System.out.println(number+" là Số nguyên tố");
	        } else {
	            System.out.println(number+" không phải số nguyên tố");
	        }
	    }

	    // Hàm kiểm tra số nguyên tố
	    public static boolean isPrime(int num) {
	        // Số nguyên tố phải lớn hơn 1
	        if (num <= 1) {
	            return false;
	        }

	        // Kiểm tra các số từ 2 đến căn bậc hai của num
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false; // Nếu num chia hết cho i, thì nó không phải là số nguyên tố
	            }
	        }

	        return true; // Nếu không chia hết cho bất kỳ số nào, thì nó là số nguyên tố
	    }
}
