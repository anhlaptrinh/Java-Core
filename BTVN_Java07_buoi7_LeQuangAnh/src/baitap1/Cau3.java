package baitap1;

import java.util.Scanner;

public class Cau3 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n;

	        // Vòng lặp để đảm bảo người dùng nhập vào một số nguyên dương
	        do {
	            System.out.print("Nhập vào một số nguyên dương: ");
	            n = scanner.nextInt();
	            
	            if (n <= 0) {
	                System.out.println("Vui lòng nhập một số nguyên dương.");
	            }
	        } while (n <= 0);

	        int sum = 0;

	        // Tính tổng các số chẵn từ 0 đến n
	        for (int i = 0; i <= n; i++) {
	            if (i % 2 == 0) {
	                sum += i;
	            }
	        }

	        // In ra tổng các số chẵn
	        System.out.println("Tổng các số chẵn từ 0 đến " + n + " là: " + sum);
	    }
}
