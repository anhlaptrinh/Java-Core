package baitap1;

import java.util.Scanner;

public class Cau2 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Nhập vào một số nguyên
	        System.out.println("Nhập vào một số nguyên: ");
	        int number = scanner.nextInt();

	        // Gọi hàm kiểm tra số chẵn lẻ
	        if (isEven(number)) {
	            System.out.println("Số " + number + " là số chẵn.");
	        } else {
	            System.out.println("Số " + number + " là số lẻ.");
	        }

	        scanner.close();
	    }

	    // Hàm kiểm tra số chẵn
	    public static boolean isEven(int number) {
	        return number % 2 == 0;
	    }
}
