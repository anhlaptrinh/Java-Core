package baitap1;

public class Cau2 {
	 public static void main(String[] args) {
	        int n = 1;
	        int sum = 0;

	        // Tìm số nguyên dương nhỏ nhất n sao cho tổng từ 1 đến n > 10000
	        while (sum <= 10000) {
	            sum += n;
	            n++;
	        }

	        // Sau khi ra khỏi vòng lặp, n đã tăng thêm 1, nên cần giảm 1 để có giá trị đúng
	        n--;

	        // In ra kết quả
	        System.out.println("Số nguyên dương nhỏ nhất n sao cho 1 + 2 + ... + n > 10000 là: " + n);
	        System.out.println("Tổng của dãy số từ 1 đến " + n + " là: " + sum);
	    }
}
