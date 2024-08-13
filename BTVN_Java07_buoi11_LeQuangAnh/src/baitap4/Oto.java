package baitap4;

import java.util.Scanner;

public class Oto extends PhuongTienGiaoThong {
    private int soChoNgoi;
    private String kieuDongCo;

    // Hàm khởi tạo không tham số
    public Oto() {
        super();
        this.soChoNgoi = 0;
        this.kieuDongCo = "";
    }

    // Hàm khởi tạo với tham số
    public Oto(String hangSanXuat, String tenPhuongTien, int namSanXuat, double vanTocToiDa, int soChoNgoi, String kieuDongCo) {
        super(hangSanXuat, tenPhuongTien, namSanXuat, vanTocToiDa);
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số chỗ ngồi: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Số chỗ ngồi không hợp lệ. Nhập lại số chỗ ngồi: ");
            scanner.next(); // Bỏ qua giá trị không hợp lệ
        }
        this.soChoNgoi = scanner.nextInt();
        while (this.soChoNgoi <= 0) { // Giả định số chỗ ngồi phải là số dương
            System.out.print("Số chỗ ngồi không hợp lệ. Nhập lại số chỗ ngồi (> 0): ");
            this.soChoNgoi = scanner.nextInt();
        }

        scanner.nextLine(); // Đọc ký tự newline còn lại

        System.out.print("Nhập kiểu động cơ: ");
        this.kieuDongCo = scanner.nextLine();
        while (this.kieuDongCo.trim().isEmpty()) {
            System.out.print("Kiểu động cơ không được để trống. Nhập lại kiểu động cơ: ");
            this.kieuDongCo = scanner.nextLine();
        }
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Số chỗ ngồi: " + this.soChoNgoi);
        System.out.println("Kiểu động cơ: " + this.kieuDongCo);
    }
}

