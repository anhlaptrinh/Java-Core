package cau3;

import java.util.Random;
import java.util.Scanner;

public class TroChoi {
	   private String tenTroChoi;
	    private int soLuotChoi;
	    private int luotThangNguoiChoi;
	    private int luotThangMayTinh;

	    // Constructor
	    public TroChoi(String tenTroChoi) {
	        this.tenTroChoi = tenTroChoi;
	        this.soLuotChoi = 0;
	        this.luotThangNguoiChoi = 0;
	        this.luotThangMayTinh = 0;
	    }

	    // Phương thức để bắt đầu trò chơi
	    public void batDauTroChoi() {
	        Scanner scanner = new Scanner(System.in);
	        String[] luaChon = {"Kéo", "Búa", "Bao"};
	        Random random = new Random();
	        boolean dangChoi = true;

	        while (dangChoi) {
	            System.out.println("Chọn Kéo (0), Búa (1), Bao (2) hoặc Nhập -1 để thoát:");
	            int luaChonNguoiChoi = scanner.nextInt();
	            
	            if (luaChonNguoiChoi == -1) {
	                dangChoi = false;
	                break;
	            }

	            if (luaChonNguoiChoi < 0 || luaChonNguoiChoi > 2) {
	                System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
	                continue;
	            }

	            int luaChonMayTinh = random.nextInt(3);
	            System.out.println("Bạn chọn: " + luaChon[luaChonNguoiChoi]);
	            System.out.println("Máy tính chọn: " + luaChon[luaChonMayTinh]);

	            if (luaChonNguoiChoi == luaChonMayTinh) {
	                System.out.println("Hòa!");
	            } else if ((luaChonNguoiChoi == 0 && luaChonMayTinh == 2) ||
	                       (luaChonNguoiChoi == 1 && luaChonMayTinh == 0) ||
	                       (luaChonNguoiChoi == 2 && luaChonMayTinh == 1)) {
	                System.out.println("Bạn thắng!");
	                luotThangNguoiChoi++;
	            } else {
	                System.out.println("Bạn thua!");
	                luotThangMayTinh++;
	            }

	            soLuotChoi++;
	        }

	        scanner.close();
	        ketThucTroChoi();
	    }

	    // Phương thức để kết thúc trò chơi
	    public void ketThucTroChoi() {
	        System.out.println("Kết thúc trò chơi.");
	        System.out.println("Tổng số lượt chơi: " + soLuotChoi);
	        System.out.println("Số lần người chơi thắng: " + luotThangNguoiChoi);
	        System.out.println("Số lần máy tính thắng: " + luotThangMayTinh);
	    }

	    // Phương thức để hiển thị thông tin trò chơi
	    public void hienThiThongTin() {
	        System.out.println("Tên trò chơi: " + tenTroChoi);
	        System.out.println("Số lượt chơi: " + soLuotChoi);
	        System.out.println("Số lần người chơi thắng: " + luotThangNguoiChoi);
	        System.out.println("Số lần máy tính thắng: " + luotThangMayTinh);
	    }

	    // Main method for testing
	    public static void main(String[] args) {
	        TroChoi game = new TroChoi("Kéo Búa Bao");
	        game.hienThiThongTin();
	        game.batDauTroChoi();
	    }
}
