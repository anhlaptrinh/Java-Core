package baitap1;

import java.util.Scanner;

public class Cau4 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Nhập vào hai số nguyên
	        System.out.println("Nhập vào số thứ nhất: ");
	        int num1 = scanner.nextInt();

	        System.out.println("Nhập vào số thứ hai: ");
	        int num2 = scanner.nextInt();

	        // Hiển thị menu lựa chọn phép tính
	        System.out.println("Chọn phép tính:");
	        System.out.println("1: Cộng (+)");
	        System.out.println("2: Trừ (-)");
	        System.out.println("3: Nhân (*)");
	        System.out.println("4: Chia (/)");
	        int choice = scanner.nextInt();

	        // Gọi hàm thực hiện phép tính và in kết quả
	        String result = calculate(num1, num2, choice);

	        // In kết quả
	        System.out.println("Kết quả: " + result);

	        scanner.close();
	    }

	    // Hàm thực hiện phép tính
	    public static String calculate(int a, int b, int operation) {
	        String result = "";

	        switch (operation) {
	            case 1:
	                result = String.valueOf(a + b);
	                break;
	            case 2:
	                result = String.valueOf(a - b);
	                break;
	            case 3:
	                result = String.valueOf(a * b);
	                break;
	            case 4:
	                if (b != 0) {
	                    result = String.valueOf((double) a / b);
	                } else {
	                    result = "Lỗi: Không thể chia cho 0.";
	                }
	                break;
	            default:
	                result = "Lựa chọn không hợp lệ.";
	        }

	        return result;
	    }
	    
}
