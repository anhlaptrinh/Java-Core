package baitap2;

import java.util.Scanner;

public class Tinhtien {

	public static void main(String[] args) {
		/*
		 * Viết chương trình nhập vào thông tin 1 mặt hàng Tên, số lượng, đơn giá. 
		 * Tính và xuất tiền phải trả dựa theo quy tắc: 
		 * Nếu mua với số lượng từ 50 đến 100 sẽ được giảm 8%, 
		 * mua với số lượng trên 100 thì số lượng từ 100 trở đi sẽ được giảm 12%.
		 * */
		Scanner sc=new Scanner(System.in);
		double Tong=0;
		int soLuong=0,soLuongMatHang=0;
		System.out.print("Nhập tên mặt hàng: ");
		String matHang=sc.nextLine();
		System.out.print("Nhập đơn giá: ");
		float donGia=sc.nextFloat();
		do {
			System.out.print("Nhập số lượng Mặt Hàng: ");
			soLuongMatHang=sc.nextInt();
			 System.out.print("Nhập số lượng muốn mua: ");
			 soLuong=sc.nextInt();
			 if(soLuong<=0 || soLuongMatHang<=0) System.out.println("Vui lòng nhâp số lượng lớn hơn 0!");
			 if(soLuongMatHang<soLuong)System.out.println("Mặt hàng không đủ số lượng để mua!");
		}while(soLuong<=0  || soLuongMatHang<soLuong);
		sc.nextLine();
		
		if(50<=soLuong && soLuong<=100) {
			Tong=donGia*0.08;
			System.out.println("Tổng tiền cần phải trả cho "+matHang+" (giảm 8%) là: "+Tong);
		}else if(soLuong<50) System.out.println("Tổng tiền cần phải trả cho "+matHang+" (không giảm giá) là: "+donGia);
		 else {
			Tong=donGia*0.12;
			System.out.println("Tổng tiền cần phải trả cho "+matHang+" (giảm 12%) là: "+Tong);
		}
				
	}

}
