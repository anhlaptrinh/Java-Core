package baitap1;

import java.util.Scanner;

public class Cau4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập giá trị x
        System.out.print("Nhập giá trị x: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Đầu vào không hợp lệ. Vui lòng nhập một số nguyên.");
            scanner.next(); // Xóa đầu vào không hợp lệ
            System.out.print("Nhập giá trị x: ");
        }
        int x = scanner.nextInt();

        // Nhập giá trị n
        System.out.print("Nhập giá trị n: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Đầu vào không hợp lệ. Vui lòng nhập một số nguyên.");
            scanner.next(); // Xóa đầu vào không hợp lệ
            System.out.print("Nhập giá trị n: ");
        }
        int n = scanner.nextInt();

        // Tính tổng S(n)
        int sum = calculateSum(x, n);

        // In kết quả
        System.out.println("Tổng S(" + n + ") = " + sum);

        scanner.close();
    }

    // Hàm tính tổng S(n) = x + x^2 + x^3 + ... + x^n
    private static int calculateSum(int x, int n) {
        int sum = 0;
        int currentPower = x;

        for (int i = 1; i <= n; i++) {
            sum += currentPower;
            currentPower *= x; // Tính x^i cho lần lặp tiếp theo
        }

        return sum;
    }
}
