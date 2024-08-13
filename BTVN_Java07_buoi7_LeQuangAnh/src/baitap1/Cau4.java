package baitap1;

import java.util.Scanner;

public class Cau4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập vào số lượng phần tử
        System.out.print("Nhập vào số lượng phần tử n: ");
        int n = scanner.nextInt();

        // Khởi tạo mảng với kích thước n
        int[] array = new int[n];
        
        // Nhập vào các phần tử của mảng
        System.out.println("Nhập vào " + n + " phần tử số nguyên:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Tính tổng các phần tử
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }

        // Tính giá trị trung bình
        double average = (double) sum / n;

        // In ra giá trị trung bình
        System.out.println("Giá trị trung bình của các phần tử trong mảng là: " + average);
    }
}
