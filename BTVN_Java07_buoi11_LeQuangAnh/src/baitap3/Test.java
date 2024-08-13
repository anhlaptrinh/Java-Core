package baitap3;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin cho nhân viên văn phòng
        System.out.println("Nhập thông tin nhân viên văn phòng:");
        NhanVienVanPhong nvvp = new NhanVienVanPhong();
        nvvp.nhapThongTin();

        // Nhập thông tin cho nhân viên sản xuất
        System.out.println("\nNhập thông tin nhân viên sản xuất:");
        NhanVienSanXuat nvpx = new NhanVienSanXuat();
        nvpx.nhapThongTin();

        // Xuất thông tin
        System.out.println("\nThông tin nhân viên văn phòng:");
        nvvp.xuatThongTin();

        System.out.println("\nThông tin nhân viên sản xuất:");
        nvpx.xuatThongTin();
    }
}	
