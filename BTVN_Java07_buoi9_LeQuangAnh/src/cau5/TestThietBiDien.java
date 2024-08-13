package cau5;

import java.util.Scanner;

public class TestThietBiDien {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int luaChon;

	        do {
	        	System.out.println("====================================");
	            System.out.println("Chọn loại thiết bị (nhập 0 để thoát):");
	            System.out.println("1. Máy Điều Hòa");
	            System.out.println("2. Máy Sấy");
	            luaChon = scanner.nextInt();
	            scanner.nextLine();  // Đọc bỏ ký tự newline còn lại sau nextInt()

	            if (luaChon == 0) {
	                System.out.println("Đã thoát chương trình.");
	                break;  // Thoát vòng lặp nếu người dùng nhập 0
	            }

	            if (luaChon == 1 || luaChon == 2) {
	                System.out.println("Nhập tên thiết bị:");
	                String ten = scanner.nextLine();

	                System.out.println("Nhập công suất (watts):");
	                int congSuat = scanner.nextInt();

	                if (luaChon == 1) {
	                    System.out.println("Chọn chức năng (1. Làm lạnh, 2. Làm nóng):");
	                    int chucNang = scanner.nextInt();
	                    boolean lamLanh = (chucNang == 1);
	                    System.out.println("Nhập công suất làm lạnh (BTU):");
	                    int congSuatLamLanh = scanner.nextInt();
	                    scanner.nextLine();  // Đọc bỏ ký tự newline còn lại sau nextInt()
	                    System.out.println("Nhập chế độ điều hòa:");
	                    String cheDoDieuHoa = scanner.nextLine();
	                    System.out.println("Nhập diện tích phục vụ (m2):");
	                    double dienTichPhucVu = scanner.nextDouble();
	                    DieuHoa dieuHoa = new DieuHoa(ten, congSuat, lamLanh, congSuatLamLanh, cheDoDieuHoa, dienTichPhucVu);
	                    dieuHoa.hienThiThongTin();
	                    dieuHoa.chucNang();
	                } else if (luaChon == 2) {
	                    System.out.println("Chọn chức năng (1. Có sấy, 2. Không sấy):");
	                    int chucNang = scanner.nextInt();
	                    boolean coSay = (chucNang == 1);
	                    scanner.nextLine();  // Đọc bỏ ký tự newline còn lại sau nextInt()
	                    String tocDoSay;
	                    String cheDoSay;
	                    double dungTich;

	                    if (coSay) {
	                        System.out.println("Nhập tốc độ sấy (nhanh, vừa, chậm):");
	                        tocDoSay = scanner.nextLine();
	                        System.out.println("Nhập chế độ sấy (sấy khô, sấy hơi nước):");
	                        cheDoSay = scanner.nextLine();
	                        System.out.println("Nhập dung tích sấy (lít):");
	                        dungTich = scanner.nextDouble();
	                    } else {
	                        tocDoSay = "";
	                        cheDoSay = "";
	                        dungTich = 0;
	                    }
	                    MaySay maySay = new MaySay(ten, congSuat, coSay, tocDoSay, cheDoSay, dungTich);
	                    maySay.hienThiThongTin();
	                    maySay.chucNang();
	                }
	            } else {
	                System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
	            }

	        } while (luaChon != 0);

	        scanner.close();
	    }
}
