package baitap2;

public class Cau1 {
	 public static void main(String[] args) {
	        // In số nguyên dương lẻ nhỏ hơn 100
	        System.out.println("Số nguyên dương lẻ nhỏ hơn 100:");
	        System.out.println("------------Vòng Lặp For--------------");
	        printOddNumbersFor();
	        System.out.println("------------Vòng Lặp While------------");
	        printOddNumbersWhile();
	        
	        // In số nguyên dương chẵn nhỏ hơn 100
	        System.out.println("\nSố nguyên dương chẵn nhỏ hơn 100:");
	        System.out.println("------------Vòng Lặp For--------------");
	        printEvenNumbersFor();
	        System.out.println("------------Vòng Lặp While------------");
	        printEvenNumbersWhile();
	    }

	    // Hàm in số lẻ nhỏ hơn 100 sử dụng vòng lặp for
	    private static void printOddNumbersFor() {
	        for (int i = 1; i < 100; i += 2) {
	            System.out.println(i);
	        }
	    }

	    // Hàm in số lẻ nhỏ hơn 100 sử dụng vòng lặp while
	    private static void printOddNumbersWhile() {
	        int i = 1;
	        while (i < 100) {
	            System.out.println(i);
	            i += 2;
	        }
	    }

	    // Hàm in số chẵn nhỏ hơn 100 sử dụng vòng lặp for
	    private static void printEvenNumbersFor() {
	        for (int i = 2; i < 100; i += 2) {
	            System.out.println(i);
	        }
	    }

	    // Hàm in số chẵn nhỏ hơn 100 sử dụng vòng lặp while
	    private static void printEvenNumbersWhile() {
	        int i = 2;
	        while (i < 100) {
	            System.out.println(i);
	            i += 2;
	        }
	    }
}
