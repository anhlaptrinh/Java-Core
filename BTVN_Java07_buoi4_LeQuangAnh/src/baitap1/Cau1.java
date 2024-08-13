package baitap1;

import java.util.Scanner;

public class Cau1 {

	public static void main(String[] args) {
		/*
		 * Nhập tên và năm sinh của 3 sinh viên.
		 * Hãy viết chương trình in ra sinh viên trẻ tuổi nhất
		 */
		int max=0,namSinh;
		String tenSinhvien="";
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.print("Nhập tên sinh viên thứ "+(i+1)+": ");
			 String ten=sc.nextLine();
			do {
				System.out.print("Nhập năm sinh của sinh viên thứ "+(i+1)+": ");
				namSinh=sc.nextInt();
				if(namSinh<1990) System.out.println("Năm Sinh phải lớn hơn hoặc bằng 1990!");
			}while(namSinh<1990);
			sc.nextLine();
			if(namSinh>max) { 
				max=namSinh;
				tenSinhvien=ten;
			}
		}
		System.out.println("Sinh viên trẻ nhất có tên là "+tenSinhvien+" có năm sinh là "+max);

	}

}
