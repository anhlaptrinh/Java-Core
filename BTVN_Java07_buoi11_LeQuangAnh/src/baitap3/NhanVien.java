package baitap3;

import java.util.Scanner;

abstract class NhanVien {
    protected String hoTen;
    protected String ngaySinh;
    protected double luong;

    public NhanVien() {
        this.hoTen = "";
        this.ngaySinh = "";
        this.luong = 0.0;
    }

    public NhanVien(String hoTen, String ngaySinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.luong = 0.0;
    }

    public abstract void tinhLuong();
    
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập họ tên
        System.out.print("Nhập họ tên: ");
        this.hoTen = scanner.nextLine();
        while (this.hoTen.trim().isEmpty()) {
            System.out.print("Họ tên không được để trống. Nhập lại họ tên: ");
            this.hoTen = scanner.nextLine();
        }
        
        // Nhập ngày sinh
        System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
        this.ngaySinh = scanner.nextLine();
        while (!isValidDate(this.ngaySinh)) {
            System.out.print("Ngày sinh không hợp lệ. Nhập lại ngày sinh (dd/MM/yyyy): ");
            this.ngaySinh = scanner.nextLine();
        }

        // Tính lương
        tinhLuong();
    }

    private boolean isValidDate(String date) {
        // Kiểm tra định dạng ngày sinh (dd/MM/yyyy)
        return date.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    public void xuatThongTin() {
        System.out.println("Họ tên: " + this.hoTen);
        System.out.println("Ngày sinh: " + this.ngaySinh);
        System.out.println("Lương: " + this.luong);
    }
}




 
 