package baitap2;

import java.util.Scanner;

public class VanDongVien {
	  private String hoten;         
	    private int tuoi;             
	    private String monthidau;     
	    private double cannang;       
	    private double chieucao;      

	    // Khởi tạo không tham số
	    public VanDongVien() {
	        this.hoten = "";
	        this.tuoi = 0;
	        this.monthidau = "";
	        this.cannang = 0.0;
	        this.chieucao = 0.0;
	    }

	    // Khởi tạo 5 tham số
	    public VanDongVien(String hoten, int tuoi, String monthidau, double cannang, double chieucao) {
	        this.hoten = hoten;
	        this.tuoi = tuoi;
	        this.monthidau = monthidau;
	        this.cannang = cannang;
	        this.chieucao = chieucao;
	    }

	    // Phương thức nhập dữ liệu với kiểm tra validate
	    public void nhap() {
	        Scanner scanner = new Scanner(System.in);

	        // Nhập và kiểm tra họ tên
	        System.out.print("Nhập họ tên: ");
	        this.hoten = scanner.nextLine();
	        while (this.hoten.trim().isEmpty()) {
	            System.out.print("Họ tên không được để trống. Nhập lại họ tên: ");
	            this.hoten = scanner.nextLine();
	        }

	        // Nhập và kiểm tra tuổi
	        System.out.print("Nhập tuổi: ");
	        while (!scanner.hasNextInt()) {
	            System.out.print("Tuổi không hợp lệ. Nhập lại tuổi: ");
	            scanner.next(); // Bỏ qua giá trị không hợp lệ
	        }
	        this.tuoi = scanner.nextInt();
	        while (this.tuoi <= 0 || this.tuoi > 150) { // Giả định tuổi hợp lệ từ 1 đến 150
	            System.out.print("Tuổi không hợp lệ. Nhập lại tuổi (từ 1 đến 150): ");
	            this.tuoi = scanner.nextInt();
	        }

	        scanner.nextLine(); // Đọc ký tự newline còn lại

	        // Nhập và kiểm tra môn thi đấu
	        System.out.print("Nhập môn thi đấu: ");
	        this.monthidau = scanner.nextLine();
	        while (this.monthidau.trim().isEmpty()) {
	            System.out.print("Môn thi đấu không được để trống. Nhập lại môn thi đấu: ");
	            this.monthidau = scanner.nextLine();
	        }

	        // Nhập và kiểm tra cân nặng
	        System.out.print("Nhập cân nặng (kg): ");
	        while (!scanner.hasNextDouble()) {
	            System.out.print("Cân nặng không hợp lệ. Nhập lại cân nặng: ");
	            scanner.next(); // Bỏ qua giá trị không hợp lệ
	        }
	        this.cannang = scanner.nextDouble();
	        while (this.cannang <= 0 || this.cannang > 300) { // Giả định cân nặng hợp lệ từ 0 đến 300 kg
	            System.out.print("Cân nặng không hợp lệ. Nhập lại cân nặng (từ 0 đến 300 kg): ");
	            this.cannang = scanner.nextDouble();
	        }

	        // Nhập và kiểm tra chiều cao
	        System.out.print("Nhập chiều cao (cm): ");
	        while (!scanner.hasNextDouble()) {
	            System.out.print("Chiều cao không hợp lệ. Nhập lại chiều cao: ");
	            scanner.next(); // Bỏ qua giá trị không hợp lệ
	        }
	        this.chieucao = scanner.nextDouble();
	        while (this.chieucao <= 0 || this.chieucao > 300) { // Giả định chiều cao hợp lệ từ 0 đến 300 cm
	            System.out.print("Chiều cao không hợp lệ. Nhập lại chiều cao (từ 0 đến 300 cm): ");
	            this.chieucao = scanner.nextDouble();
	        }
	    }

	    // Phương thức xuất dữ liệu
	    public void xuat() {
	        System.out.println("Họ tên: " + this.hoten);
	        System.out.println("Tuổi: " + this.tuoi);
	        System.out.println("Môn thi đấu: " + this.monthidau);
	        System.out.println("Cân nặng: " + this.cannang + " kg");
	        System.out.println("Chiều cao: " + this.chieucao + " cm");
	    }

	    // Phương thức so sánh hai vận động viên
	    public boolean lonHon(VanDongVien other) {
	        if (this.chieucao > other.chieucao) {
	            return true;
	        } else if (this.chieucao == other.chieucao) {
	            return this.cannang > other.cannang;
	        }
	        return false;
	    }

	    // Hàm chính để kiểm tra các phương thức
	    public static void main(String[] args) {
	        VanDongVien vd1 = new VanDongVien();
	        VanDongVien vd2 = new VanDongVien();

	        System.out.println("Nhập thông tin vận động viên 1:");
	        vd1.nhap();
	        System.out.println("Nhập thông tin vận động viên 2:");
	        vd2.nhap();

	        System.out.println("\nThông tin vận động viên 1:");
	        vd1.xuat();
	        System.out.println("Thông tin vận động viên 2:");
	        vd2.xuat();

	        System.out.println("\nSo sánh hai vận động viên:");
	        if (vd1.lonHon(vd2)) {
	            System.out.println("Vận động viên 1 lớn hơn vận động viên 2.");
	        } else {
	            System.out.println("Vận động viên 1 không lớn hơn vận động viên 2.");
	        }
	    }
}
