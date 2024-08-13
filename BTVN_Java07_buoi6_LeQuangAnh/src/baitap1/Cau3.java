package baitap1;

import java.util.Scanner;

public class Cau3 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Nhập vào 3 số nguyên
	        System.out.println("Nhập vào số thứ nhất: ");
	        int a = scanner.nextInt();

	        System.out.println("Nhập vào số thứ hai: ");
	        int b = scanner.nextInt();

	        System.out.println("Nhập vào số thứ ba: ");
	        int c = scanner.nextInt();

	        // Gọi hàm tính tổng 3 số
	        int sum = calculateSum(a, b, c);

	        // In ra tổng của 3 số
	        System.out.println("Tổng của 3 số là: " + sum);

	        scanner.close();
	    }

	    // Hàm tính tổng 3 số
	    public static int calculateSum(int a, int b, int c) {
	        return a + b + c;
	    }
}
