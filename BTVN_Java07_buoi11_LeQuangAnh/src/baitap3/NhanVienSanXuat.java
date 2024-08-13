package baitap3;

import java.util.Scanner;

public class NhanVienSanXuat extends NhanVien {
	 private int soSanPham;

	    public NhanVienSanXuat() {
	        super();
	        this.soSanPham = 0;
	    }

	    public NhanVienSanXuat(String hoTen, String ngaySinh, int soSanPham) {
	        super(hoTen, ngaySinh);
	        this.soSanPham = soSanPham;
	    }

	    @Override
	    public void tinhLuong() {
	        this.luong = 3000000 + this.soSanPham * 5000; // 3.000.000 là lương căn bản
	    }

	    @Override
	    public void nhapThongTin() {
	        super.nhapThongTin();
	        Scanner scanner = new Scanner(System.in);

	        // Nhập số sản phẩm
	        System.out.print("Nhập số sản phẩm: ");
	        while (!scanner.hasNextInt()) {
	            System.out.print("Số sản phẩm không hợp lệ. Nhập lại số sản phẩm: ");
	            scanner.next(); // Bỏ qua giá trị không hợp lệ
	        }
	        this.soSanPham = scanner.nextInt();
	        while (this.soSanPham < 0) {
	            System.out.print("Số sản phẩm không hợp lệ. Nhập lại số sản phẩm (>= 0): ");
	            this.soSanPham = scanner.nextInt();
	        }
	        tinhLuong();
	    }
}
