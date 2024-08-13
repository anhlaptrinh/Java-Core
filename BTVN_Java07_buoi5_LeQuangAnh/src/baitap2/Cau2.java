package baitap2;

import java.util.Scanner;

public class Cau2 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Nhập giá trị n
	        System.out.print("Nhập giá trị n: ");
	        while (!scanner.hasNextInt()) {
	            System.out.println("Đầu vào không hợp lệ. Vui lòng nhập một số nguyên.");
	            scanner.next(); // Xóa đầu vào không hợp lệ
	            System.out.print("Nhập giá trị n: ");
	        }
	        int n = scanner.nextInt();

	        // Tính tổng các số chẵn từ 1 đến n sử dụng vòng lặp for
	        int sumFor = calculateSumEvenNumbersFor(n);
	        System.out.println("Tổng các số chẵn từ 1 đến " + n + " (sử dụng vòng lặp for) là: " + sumFor);

	        // Tính tổng các số chẵn từ 1 đến n sử dụng vòng lặp while
	        int sumWhile = calculateSumEvenNumbersWhile(n);
	        System.out.println("Tổng các số chẵn từ 1 đến " + n + " (sử dụng vòng lặp while) là: " + sumWhile);

	        scanner.close();
	    }

	    // Hàm tính tổng các số chẵn từ 1 đến n sử dụng vòng lặp for
	    private static int calculateSumEvenNumbersFor(int n) {
	        int sum = 0;
	        for (int i = 2; i <= n; i += 2) {
	            sum += i;
	        }
	        return sum;
	    }

	    // Hàm tính tổng các số chẵn từ 1 đến n sử dụng vòng lặp while
	    private static int calculateSumEvenNumbersWhile(int n) {
	        int sum = 0;
	        int i = 2;
	        while (i <= n) {
	            sum += i;
	            i += 2; 
	        }
	        return sum;
	    }
}
