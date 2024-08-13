package cau4;

import java.util.Scanner;

public class TestPhuongTien {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int luaChon;

	        do {
	        	System.out.println("========================================");
	            System.out.println("Chọn loại phương tiện (nhập 0 để thoát):");
	            System.out.println("1. Xe Hơi");
	            System.out.println("2. Xe Máy");
	            luaChon = scanner.nextInt();
	            scanner.nextLine();  // Đọc bỏ ký tự newline còn lại sau nextInt()

	            if (luaChon == 0) {
	                System.out.println("Đã thoát chương trình.");
	                break;  // Thoát vòng lặp nếu người dùng nhập 0
	            }

	            if (luaChon == 1 || luaChon == 2) {
	                System.out.println("Nhập hãng sản xuất:");
	                String hangSanXuat = scanner.nextLine();

	                System.out.println("Nhập màu sắc:");
	                String mauSac = scanner.nextLine();

	                System.out.println("Nhập năm sản xuất:");
	                int namSanXuat = scanner.nextInt();

	                if (luaChon == 1) {
	                    System.out.println("Nhập số cửa:");
	                    int soCua = scanner.nextInt();
	                    scanner.nextLine();  // Đọc bỏ ký tự newline còn lại sau nextInt()
	                    XeHoi xeHoi = new XeHoi(hangSanXuat, mauSac, namSanXuat, soCua);
	                    xeHoi.hienThiThongTin();
	                } else if (luaChon == 2) {
	                    System.out.println("Nhập số bánh:");
	                    int soBanh = scanner.nextInt();
	                    scanner.nextLine();  // Đọc bỏ ký tự newline còn lại sau nextInt()
	                    XeMay xeMay = new XeMay(hangSanXuat, mauSac, namSanXuat, soBanh);
	                    xeMay.hienThiThongTin();
	                }
	            } else {
	                System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
	            }

	        } while (luaChon != 0);

	        scanner.close();
	    }

}
