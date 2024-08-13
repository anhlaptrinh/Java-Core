package baitap2;

public class Cau3 {
	  public static void main(String[] args) {
	        // Tính số lượng số chia hết cho 3 từ 0 đến 1000 sử dụng vòng lặp for
	        int countFor = countDivisibleByThreeFor();
	        System.out.println("Số lượng số chia hết cho 3 từ 0 đến 1000 (sử dụng vòng lặp for) là: " + countFor);

	        // Tính số lượng số chia hết cho 3 từ 0 đến 1000 sử dụng vòng lặp while
	        int countWhile = countDivisibleByThreeWhile();
	        System.out.println("Số lượng số chia hết cho 3 từ 0 đến 1000 (sử dụng vòng lặp while) là: " + countWhile);
	    }

	    // Hàm tính số lượng số chia hết cho 3 từ 0 đến 1000 sử dụng vòng lặp for
	    private static int countDivisibleByThreeFor() {
	        int count = 0;
	        for (int i = 0; i <= 1000; i++) {
	            if (i % 3 == 0) {
	                count++;
	            }
	        }
	        return count;
	    }

	    // Hàm tính số lượng số chia hết cho 3 từ 0 đến 1000 sử dụng vòng lặp while
	    private static int countDivisibleByThreeWhile() {
	        int count = 0;
	        int i = 0;
	        while (i <= 1000) {
	            if (i % 3 == 0) {
	                count++;
	            }
	            i++;
	        }
	        return count;
	    }
}
