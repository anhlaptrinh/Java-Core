package baitap1;

import java.util.Random;

public class Cau7 {
	 public static void main(String[] args) {
	        int n = 10; // Số lượng phần tử của mảng
	        int[] array = new int[n];
	        Random random = new Random();

	        // Khởi tạo mảng với các giá trị ngẫu nhiên
	        for (int i = 0; i < n; i++) {
	            array[i] = random.nextInt(100); // Tạo số nguyên ngẫu nhiên từ 0 đến 99
	        }

	        // Hiển thị mảng vừa tạo
	        System.out.println("Mảng vừa tạo là:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(array[i] + " ");
	        }
	    }
}
