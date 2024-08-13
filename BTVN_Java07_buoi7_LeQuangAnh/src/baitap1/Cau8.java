package baitap1;

import java.util.Scanner;

public class Cau8 {
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

        // In ra các phần tử là số chẵn
        System.out.println("Các phần tử là số chẵn trong mảng là:");
        boolean hasEven = false; // Biến kiểm tra có số chẵn hay không
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
                hasEven = true;
            }
        }

        if (!hasEven) {
            System.out.println("Không có số chẵn trong mảng.");
        }
    }
}
