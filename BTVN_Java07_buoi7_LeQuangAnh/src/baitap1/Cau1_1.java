package baitap1;

import java.util.Scanner;

public class Cau1_1 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Yêu cầu người dùng nhập vào một số nguyên
	        System.out.print("Nhập vào một số nguyên: ");
	        int number = scanner.nextInt();

	        // Kiểm tra và in kết quả
	        if (number % 2 == 0) {
	            System.out.println("Số chẵn");
	        } else {
	            System.out.println("Số lẻ");
	        }
	    }
}
