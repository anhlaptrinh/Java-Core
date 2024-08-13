package baitap1;

import java.util.Scanner;

public class Phanso {
	 private int tuso;  // Tử số
	    private int mauso;  // Mẫu số

	    // Hàm khởi tạo không tham số
	    public Phanso() {
	        this.tuso = 0;
	        this.mauso = 1;  // Đặt mẫu số mặc định là 1 để tránh chia cho 0
	    }

	    // Hàm khởi tạo với tham số
	    public Phanso(int tuso, int mauso) {
	        this.tuso = tuso;
	        this.mauso = mauso;
	        toiGian();  // Rút gọn phân số ngay khi khởi tạo
	    }

	    // Phương thức để rút gọn phân số
	    private void toiGian() {
	        int gcd = gcd(tuso, mauso);
	        tuso /= gcd;
	        mauso /= gcd;
	    }

	    // Hàm tính ước số chung lớn nhất
	    private int gcd(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }

	    // Nhập phân số
	    public void nhap() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập tử số: ");
	        this.tuso = scanner.nextInt();
	        System.out.print("Nhập mẫu số: ");
	        this.mauso = scanner.nextInt();
	        if (mauso == 0) {
	            System.out.println("Mẫu số phải khác 0!");
	            this.mauso = 1;  // Đặt mẫu số mặc định để tránh chia cho 0
	        }
	        toiGian();
	    }

	    // Xuất phân số
	    public void xuat() {
	        System.out.println(tuso + "/" + mauso);
	    }

	    // Cộng hai phân số
	    public Phanso Cong(Phanso p) {
	        int t = this.tuso * p.mauso + p.tuso * this.mauso;
	        int m = this.mauso * p.mauso;
	        return new Phanso(t, m);
	    }

	    // Trừ hai phân số
	    public Phanso Tru(Phanso p) {
	        int t = this.tuso * p.mauso - p.tuso * this.mauso;
	        int m = this.mauso * p.mauso;
	        return new Phanso(t, m);
	    }

	    // Nhân hai phân số
	    public Phanso Nhan(Phanso p) {
	        int t = this.tuso * p.tuso;
	        int m = this.mauso * p.mauso;
	        return new Phanso(t, m);
	    }

	    // Chia hai phân số
	    public Phanso Chia(Phanso p) {
	        if (p.tuso == 0) {
	            System.out.println("Lỗi: Không thể chia cho phân số có tử số bằng 0.");
	            return new Phanso();  // Trả về phân số mặc định 0/1
	        }
	        int t = this.tuso * p.mauso;
	        int m = this.mauso * p.tuso;
	        return new Phanso(t, m);
	    }

	    // Hàm chính để kiểm tra các phương thức
	    public static void main(String[] args) {
	        Phanso ps1 = new Phanso();
	        Phanso ps2 = new Phanso();

	        System.out.println("Nhập phân số thứ nhất:");
	        ps1.nhap();
	        System.out.println("Nhập phân số thứ hai:");
	        ps2.nhap();

	        System.out.println("Phân số thứ nhất: ");
	        ps1.xuat();
	        System.out.println("Phân số thứ hai: ");
	        ps2.xuat();

	        System.out.println("Tổng hai phân số: ");
	        Phanso tong = ps1.Cong(ps2);
	        tong.xuat();

	        System.out.println("Hiệu hai phân số: ");
	        Phanso hieu = ps1.Tru(ps2);
	        hieu.xuat();

	        System.out.println("Tích hai phân số: ");
	        Phanso tich = ps1.Nhan(ps2);
	        tich.xuat();

	        System.out.println("Thương hai phân số: ");
	        Phanso thuong = ps1.Chia(ps2);
	        thuong.xuat();
	    }
}
