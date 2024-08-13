package baitap4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class QuanLyPhuongTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin một phương tiện giao thông
        System.out.println("Nhập thông tin phương tiện giao thông:");
        PhuongTienGiaoThong ptg = new PhuongTienGiaoThong();
        ptg.nhapThongTin();
        System.out.println("\nThông tin phương tiện giao thông:");
        ptg.xuatThongTin();

        // Nhập thông tin cho n ô tô
        System.out.print("\nNhập số lượng ô tô: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Số lượng ô tô không hợp lệ. Nhập lại số lượng ô tô: ");
            scanner.next(); // Bỏ qua giá trị không hợp lệ
        }
        int n = scanner.nextInt();
        while (n <= 0) { // Giả định số lượng ô tô phải là số dương
            System.out.print("Số lượng ô tô không hợp lệ. Nhập lại số lượng ô tô (> 0): ");
            n = scanner.nextInt();
        }

        List<Oto> danhSachOto = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhập thông tin ô tô thứ " + (i + 1) + ":");
            Oto oto = new Oto();
            oto.nhapThongTin();
            danhSachOto.add(oto);
        }

        // Xuất thông tin các ô tô
        System.out.println("\nThông tin các ô tô:");
        for (Oto oto : danhSachOto) {
            oto.xuatThongTin();
            System.out.println();
        }

        // Tìm và in các ô tô có cùng vận tốc
        System.out.print("\nNhập vận tốc để tìm các ô tô có cùng vận tốc (km/h): ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Vận tốc không hợp lệ. Nhập lại vận tốc: ");
            scanner.next(); // Bỏ qua giá trị không hợp lệ
        }
        double vanTocTim = scanner.nextDouble();
        while (vanTocTim <= 0) { // Giả định vận tốc phải là số dương
            System.out.print("Vận tốc không hợp lệ. Nhập lại vận tốc (> 0): ");
            vanTocTim = scanner.nextDouble();
        }

        System.out.println("\nCác ô tô có vận tốc tối đa " + vanTocTim + " km/h:");
        boolean found = false;
        for (Oto oto : danhSachOto) {
            if (oto.vanTocToiDa == vanTocTim) {
                oto.xuatThongTin();
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có ô tô nào có vận tốc tối đa " + vanTocTim + " km/h.");
        }
    }
}