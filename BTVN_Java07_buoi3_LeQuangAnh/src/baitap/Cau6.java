package baitap;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Cau6 {

	public static void main(String[] args) {
		// Viết chương trình nhập vào USD => VND biết tỉ giá VND-USD là 23.500đ
		System.out.print("Nhập vào USD: ");
		Scanner sc=new Scanner(System.in);
		@SuppressWarnings("deprecation")
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("vi", "VN"));
		NumberFormat usdFormat = NumberFormat.getCurrencyInstance(Locale.US);
		float usd=sc.nextFloat();
		System.out.println("=> "+usdFormat.format(usd)+" = "+currencyFormat.format(usd*23500));
	}

}
