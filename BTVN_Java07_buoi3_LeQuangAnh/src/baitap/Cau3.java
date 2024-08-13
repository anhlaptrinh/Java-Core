package baitap;

import java.util.Scanner;

public class Cau3 {
	public static void main(String[] args) {
		//viết chương trình tính nhập số nguyên dương n với 2 kí số và tính tổng 2 kí số
		Scanner sc=new Scanner(System.in);
		int n=0;
		int sum=0;
		do {
	        System.out.print("Nhập số nguyên dương n với 2 chữ số: ");
	        n = sc.nextInt();
	        if (n < 10 || n >= 100) {
	            System.out.println("Vui lòng nhập n là số nguyên dương và có 2 chữ số!");
	        }
	    } while (n < 10 || n >= 100);
	    
	    while (n != 0) {
	        sum += n % 10;
	        n /= 10;
	    }
		System.out.print("Tổng 2 kí số của n là "+sum );
		
	}
}
