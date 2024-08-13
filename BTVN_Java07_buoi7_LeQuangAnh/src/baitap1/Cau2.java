package baitap1;

import java.util.Scanner;

public class Cau2 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Yêu cầu người dùng nhập vào một số nguyên từ 1 đến 10
	        System.out.print("Nhập vào một số nguyên từ 1 đến 10: ");
	        int number = scanner.nextInt();

	        // Kiểm tra và in kết quả
	        switch (number) {
	            case 1:
	                System.out.println(number+"->Một");
	                break;
	            case 2:
	                System.out.println(number+"->Hai");
	                break;
	            case 3:
	                System.out.println(number+"->Ba");
	                break;
	            case 4:
	                System.out.println(number+"->Bốn");
	                break;
	            case 5:
	                System.out.println(number+"->Năm");
	                break;
	            case 6:
	                System.out.println(number+"->Sáu");
	                break;
	            case 7:
	                System.out.println(number+"->Bảy");
	                break;
	            case 8:
	                System.out.println(number+"->Tám");
	                break;
	            case 9:
	                System.out.println(number+"->Chín");
	                break;
	            case 10:
	                System.out.println(number+"->Mười");
	                break;
	            default:
	                System.out.println("Số nhập không hợp lệ. Vui lòng nhập một số từ 1 đến 10.");
	                break;
	        }
	    }
}
