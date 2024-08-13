package baitap1;

import java.util.Scanner;

public class Cau5 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Yêu cầu người dùng nhập vào số lượng phần tử của mảng
	        System.out.print("Nhập vào số lượng phần tử của mảng: ");
	        int n = scanner.nextInt();

	        // Khởi tạo mảng với kích thước n
	        int[] array = new int[n];
	        
	        // Nhập vào các phần tử của mảng
	        System.out.println("Nhập vào " + n + " phần tử số nguyên:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Phần tử thứ " + (i + 1) + ": ");
	            array[i] = scanner.nextInt();
	        }

	        // Tìm số lớn nhất và số nhỏ nhất
	        int max = array[0];
	        int min = array[0];

	        for (int i = 1; i < n; i++) {
	            if (array[i] > max) {
	                max = array[i];
	            }
	            if (array[i] < min) {
	                min = array[i];
	            }
	        }

	        // In ra số lớn nhất và số nhỏ nhất
	        System.out.println("Số lớn nhất trong mảng là: " + max);
	        System.out.println("Số nhỏ nhất trong mảng là: " + min);
	    }
}
