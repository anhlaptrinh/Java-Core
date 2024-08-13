package baitap;

import java.util.Scanner;

public class Cau2 {

	public static void main(String[] args) {
		//tính giá trị biểu thức P(x)=ax^n với a là số thực n là số nguyên không âm và x cho trước
		int x=2;
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Nhập số thực a: ");
		float a=sc.nextFloat();
		do {
			System.out.print("Nhập n là số nguyên không âm: ");
			n=sc.nextInt();
			if(n<0) System.out.println("Vui lòng nhập số không âm!");
			
		}while(n<0);
		double ketqua=Math.pow(x, n)*a;
		System.out.println("giá trị biểu thức P(x)=ax^n là: "+ketqua);

	}

}
