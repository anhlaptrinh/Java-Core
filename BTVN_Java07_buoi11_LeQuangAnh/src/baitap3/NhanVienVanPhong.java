package baitap3;

import java.util.Scanner;

public class NhanVienVanPhong extends NhanVien {
    private int soNgayLamViec;

    public NhanVienVanPhong() {
        super();
        this.soNgayLamViec = 0;
    }

    public NhanVienVanPhong(String hoTen, String ngaySinh, int soNgayLamViec) {
        super(hoTen, ngaySinh);
        this.soNgayLamViec = soNgayLamViec;
    }

    @Override
    public void tinhLuong() {
        this.luong = this.soNgayLamViec * 100000;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner scanner = new Scanner(System.in);

        // Nhập số ngày làm việc
        System.out.print("Nhập số ngày làm việc: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Số ngày làm việc không hợp lệ. Nhập lại số ngày làm việc: ");
            scanner.next(); // Bỏ qua giá trị không hợp lệ
        }
        this.soNgayLamViec = scanner.nextInt();
        while (this.soNgayLamViec < 0 || this.soNgayLamViec > 31) { // Giả định số ngày làm việc trong tháng
            System.out.print("Số ngày làm việc không hợp lệ. Nhập lại số ngày làm việc (từ 0 đến 31): ");
            this.soNgayLamViec = scanner.nextInt();
        }
        tinhLuong();
    }
}
