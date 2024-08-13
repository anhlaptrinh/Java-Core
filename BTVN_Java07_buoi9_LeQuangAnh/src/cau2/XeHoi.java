package cau2;

import java.util.Scanner;

public class XeHoi {
    private String hangSanXuat;
    private String mauSac;
    private int namSanXuat;

    // Constructor
    public XeHoi(String hangSanXuat, String mauSac, int namSanXuat) {
        this.hangSanXuat = hangSanXuat;
        this.mauSac = mauSac;
        this.namSanXuat = namSanXuat;
    }

    // Phương thức để hiển thị thông tin xe hơi
    public void hienThiThongTin() {
        System.out.println("Hãng sản xuất: " + hangSanXuat);
        System.out.println("Màu sắc: " + mauSac);
        System.out.println("Năm sản xuất: " + namSanXuat);
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập hãng sản xuất:");
        String hangSanXuat = scanner.nextLine();

        System.out.println("Nhập màu sắc:");
        String mauSac = scanner.nextLine();

        System.out.println("Nhập năm sản xuất:");
        int namSanXuat = scanner.nextInt();

        XeHoi xe = new XeHoi(hangSanXuat, mauSac, namSanXuat);
        xe.hienThiThongTin();

        scanner.close();
    }
}
