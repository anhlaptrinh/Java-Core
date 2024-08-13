package cau1;

import java.util.Scanner;

public class HocSinh {
    private String ten;
    private int tuoi;
    private double[] diemSo;

    public HocSinh(String ten, int tuoi, double[] diemSo) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diemSo = diemSo;
    }

    // Phương thức để in thông tin
    public void inThongTin() {
        System.out.println("Tên: " + ten + ", Tuổi: " + tuoi);
        System.out.print("Điểm: ");
        for (double diem : diemSo) {
            System.out.print(diem + " ");
        }
        System.out.println();
    }

    // Phương thức để tính điểm trung bình
    public double tinhDiemTrungBinh() {
        if (diemSo.length == 0) return 0;
        double tongDiem = 0;
        for (double diem : diemSo) {
            tongDiem += diem;
        }
        return tongDiem / diemSo.length;
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tên học sinh:");
        String ten = scanner.nextLine();

        System.out.println("Nhập tuổi học sinh:");
        int tuoi = scanner.nextInt();

        System.out.println("Nhập số lượng điểm:");
        int soLuongDiem = scanner.nextInt();
        double[] diemSo = new double[soLuongDiem];

        System.out.println("Nhập các điểm:");
        for (int i = 0; i < soLuongDiem; i++) {
            System.out.printf("Điểm %d: ", i + 1);
            diemSo[i] = scanner.nextDouble();
        }

        HocSinh hocSinh = new HocSinh(ten, tuoi, diemSo);
        hocSinh.inThongTin();
        System.out.println("Điểm trung bình: " + hocSinh.tinhDiemTrungBinh());

        scanner.close();
    }
}
