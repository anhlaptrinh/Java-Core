package baitap1;

import java.util.Scanner;

public class Cau2 {
	public static void main(String[] args) {
		//Cho 3 số nguyên hãy viết chương trình xuất ra có bao nhiêu số chẵn, lẻ
		int count=0;
		
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.print("Nhập số nguyên thứ "+(i+1)+" : ");
			int soNguyen=sc.nextInt();
			sc.nextLine();
			if(soNguyen%2==0) count++;
			
		}
		System.out.println("Có "+count+" số chẵn và "+(3-count)+" số lẻ");
	}
}
