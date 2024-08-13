package baitap;

import java.util.Scanner;

public class Cau5 {

	public static void main(String[] args) {
		// Nhập vào độ C => độ F: F=(Cx1.8)+32
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhập vào độ C: ");
		float c=sc.nextFloat();
		System.out.println("=>Độ F = "+(c*1.8+32));
		

	}

}
