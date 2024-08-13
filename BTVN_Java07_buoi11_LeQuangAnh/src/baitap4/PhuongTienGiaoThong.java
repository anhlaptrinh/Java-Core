package baitap4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class PhuongTienGiaoThong {
    protected String hangSanXuat;
    protected String tenPhuongTien;
    protected int namSanXuat;
    protected double vanTocToiDa;

    // Hàm khởi tạo không tham số
    public PhuongTienGiaoThong() {
        this.hangSanXuat = "";
        this.tenPhuongTien = "";
        this.namSanXuat = 0;
        this.vanTocToiDa = 0.0;
    }

    // Hàm khởi tạo với tham số
    public PhuongTienGiaoThong(String hangSanXuat, String tenPhuongTien, int namSanXuat, double vanTocToiDa) {
        this.hangSanXuat = hangSanXuat;
        this.tenPhuongTien = tenPhuongTien;
        this.namSanXuat = namSanXuat;
        this.vanTocToiDa = vanTocToiDa;
    }

    // Nhập thông tin phương tiện giao thông
    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập hãng sản xuất: ");
        this.hangSanXuat = scanner.nextLine();
        while (this.hangSanXuat.trim().isEmpty()) {
            System.out.print("Hãng sản xuất không được để trống. Nhập lại hãng sản xuất: ");
            this.hangSanXuat = scanner.nextLine();
        }

        System.out.print("Nhập tên phương tiện: ");
        this.tenPhuongTien = scanner.nextLine();
        while (this.tenPhuongTien.trim().isEmpty()) {
            System.out.print("Tên phương tiện không được để trống. Nhập lại tên phương tiện: ");
            this.tenPhuongTien = scanner.nextLine();
        }

        System.out.print("Nhập năm sản xuất: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Năm sản xuất không hợp lệ. Nhập lại năm sản xuất: ");
            scanner.next(); // Bỏ qua giá trị không hợp lệ
        }
        this.namSanXuat = scanner.nextInt();
        while (this.namSanXuat < 1886 || this.namSanXuat > 2024) { // Giả định năm sản xuất hợp lệ
            System.out.print("Năm sản xuất không hợp lệ. Nhập lại năm sản xuất (từ 1886 đến 2024): ");
            this.namSanXuat = scanner.nextInt();
        }

        System.out.print("Nhập vận tốc tối đa (km/h): ");
        while (!scanner.hasNextDouble()) {
            System.out.print("Vận tốc tối đa không hợp lệ. Nhập lại vận tốc tối đa: ");
            scanner.next(); // Bỏ qua giá trị không hợp lệ
        }
        this.vanTocToiDa = scanner.nextDouble();
        while (this.vanTocToiDa <= 0) { // Giả định vận tốc tối đa phải là số dương
            System.out.print("Vận tốc tối đa không hợp lệ. Nhập lại vận tốc tối đa (> 0): ");
            this.vanTocToiDa = scanner.nextDouble();
        }
    }

    // Xuất thông tin phương tiện giao thông
    public void xuatThongTin() {
        System.out.println("Hãng sản xuất: " + this.hangSanXuat);
        System.out.println("Tên phương tiện: " + this.tenPhuongTien);
        System.out.println("Năm sản xuất: " + this.namSanXuat);
        System.out.println("Vận tốc tối đa: " + this.vanTocToiDa + " km/h");
    }
}


 
