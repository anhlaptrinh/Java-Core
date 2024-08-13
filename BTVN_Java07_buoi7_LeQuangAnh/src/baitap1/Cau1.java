package baitap1;

import java.util.Scanner;

public class Cau1 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Yêu cầu người dùng nhập vào một số nguyên
	        System.out.print("Nhập vào một số nguyên: ");
	        int number = scanner.nextInt();

	        // Kiểm tra và in kết quả
	        if (number > 0) {
	            System.out.println("Đây là số nguyên dương");
	        } else if (number < 0) {
	            System.out.println("Đây là số nguyên âm");
	        } else {
	            System.out.println("Đây là số 0");
	        }
	    }
}
