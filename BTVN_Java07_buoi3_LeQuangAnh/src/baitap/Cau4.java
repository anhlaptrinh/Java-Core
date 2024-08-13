package baitap;

import java.util.Scanner;

public class Cau4 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
//	        System.out.print("Nhập số lượng: ");
//	        int k=scanner.nextInt();
	        // Khai báo và khởi tạo mảng n với kích thước 5
	        float[] n = new float[5]; //tổng quát hơn có thể cho nhập tự động 
	        		//cho nhập k là số phần tử trong mảng và khai báo float[] n=new float[k] 
	        int sum=0;
	        // Nhập các giá trị cho mảng
	        System.out.println("Hãy nhập 5 số");
	        for (int i = 0; i < n.length; i++) {
	            System.out.print("Nhập số thứ " + (i + 1) + ": ");
	            n[i] = scanner.nextFloat();
	            sum+=n[i];
	        }
	        
	        System.out.println("Giá trị trung bình của 5 số là: "+(int)sum/n.length); //hoặc chia 5
	}
}
