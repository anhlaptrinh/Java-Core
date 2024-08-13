package baitap1;

import java.util.Scanner;

public class Cau1 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Nhập vào 3 số a, b, c
	        System.out.println("Nhập vào số thứ nhất (a): ");
	        int a = scanner.nextInt();

	        System.out.println("Nhập vào số thứ hai (b): ");
	        int b = scanner.nextInt();

	        System.out.println("Nhập vào số thứ ba (c): ");
	        int c = scanner.nextInt();

	        // Gọi hàm tìm số lớn nhất
	        int max = findMax(a, b, c);

	        // In ra số lớn nhất
	        System.out.println("Số lớn nhất trong 3 số là: " + max);

	        scanner.close();
	    }

	    // Hàm tìm số lớn nhất trong 3 số
	    public static int findMax(int a, int b, int c) {
	        int max = a; // Giả sử a là số lớn nhất

	        if (b > max) {
	            max = b; // Nếu b lớn hơn max hiện tại, cập nhật max là b
	        }

	        if (c > max) {
	            max = c; // Nếu c lớn hơn max hiện tại, cập nhật max là c
	        }

	        return max; // Trả về số lớn nhất
	    }
}
