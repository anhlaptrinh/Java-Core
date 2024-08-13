package baitap1;

import java.util.Scanner;

public class Cau1 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Nhập thông tin sinh viên
	        System.out.print("Nhập tên sinh viên: ");
	        String ten = scanner.nextLine();
	        System.out.print("Nhập mã sinh viên: ");
	        String maSV = scanner.nextLine();
	        System.out.print("Nhập điểm Toán: ");
	        double diemToan = scanner.nextDouble();
	        System.out.print("Nhập điểm Lý: ");
	        double diemLy = scanner.nextDouble();
	        System.out.print("Nhập điểm Hóa: ");
	        double diemHoa = scanner.nextDouble();

	        // Tính điểm trung bình
	        double diemTrungBinh = (diemToan + diemLy + diemHoa) / 3;

	        // Xếp loại
	        String xepLoai;
	        if (diemTrungBinh >= 9) {
	            xepLoai = "Xuất Sắc";
	        } else if (diemTrungBinh >= 8) {
	            xepLoai = "Giỏi";
	        } else if (diemTrungBinh >= 7) {
	            xepLoai = "Khá";
	        } else if (diemTrungBinh >= 5) {
	            xepLoai = "Trung Bình";
	        } else  {
	            xepLoai = "Yếu";
	        } 

	        // In kết quả
	        System.out.println("Tên: " + ten);
	        System.out.println("Mã SV: " + maSV);
	        System.out.println("Điểm Toán: " + diemToan);
	        System.out.println("Điểm Lý: " + diemLy);
	        System.out.println("Điểm Hóa: " + diemHoa);
	        System.out.println("Điểm Trung Bình: " + diemTrungBinh);
	        System.out.println("Xếp Loại: " + xepLoai);

	        scanner.close();
	    }
}
