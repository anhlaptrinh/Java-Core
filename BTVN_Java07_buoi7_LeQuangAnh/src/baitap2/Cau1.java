package baitap2;

import java.util.Scanner;

public class Cau1 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Nhập số phần tử của mảng
	        System.out.print("Nhập số lượng phần tử của mảng: ");
	        int n = scanner.nextInt();
	        int[] array = inputArray(n);

	        while (true) {
	            // Hiển thị menu
	            System.out.println("\nMenu:");
	            System.out.println("1. Xuất mảng");
	            System.out.println("2. Tìm số lớn nhất và vị trí của nó");
	            System.out.println("3. Tìm số âm đầu tiên và vị trí của nó");
	            System.out.println("4. Tìm số âm lớn nhất và vị trí của nó");
	            System.out.println("5. Tính tổng các số chẵn");
	            System.out.println("6. Đếm có bao nhiêu số âm");
	            System.out.println("7. Tổng các số âm");
	            System.out.println("8. Tìm số x trong mảng");
	            System.out.println("9. Thoát");
	            System.out.print("Chọn chức năng (1-9): ");
	            
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    outputArray(array);
	                    break;
	                case 2:
	                    findMax(array);
	                    break;
	                case 3:
	                    findFirstNegative(array);
	                    break;
	                case 4:
	                    findMaxNegative(array);
	                    break;
	                case 5:
	                    sumEvenNumbers(array);
	                    break;
	                case 6:
	                    countNegativeNumbers(array);
	                    break;
	                case 7:
	                    sumNegativeNumbers(array);
	                    break;
	                case 8:
	                    System.out.print("Nhập số cần tìm: ");
	                    int x = scanner.nextInt();
	                    findNumber(array, x);
	                    break;
	                case 9:
	                    System.out.println("Thoát chương trình.");
	                    return; // Thoát khỏi chương trình
	                default:
	                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại.");
	            }
	        }
	    }

	    // Hàm nhập mảng
	    public static int[] inputArray(int n) {
	        Scanner scanner = new Scanner(System.in);
	        int[] array = new int[n];
	        for (int i = 0; i < n; i++) {
	            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
	            array[i] = scanner.nextInt();
	        }
	        return array;
	    }

	    // Hàm xuất mảng
	    public static void outputArray(int[] array) {
	        System.out.print("Mảng: ");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

	    // Tìm số lớn nhất và vị trí của nó
	    public static void findMax(int[] array) {
	        int max = array[0];
	        int position = 0;
	        for (int i = 1; i < array.length; i++) {
	            if (array[i] > max) {
	                max = array[i];
	                position = i;
	            }
	        }
	        System.out.println("Số lớn nhất là " + max + " ở vị trí " + (position + 1));
	    }

	    // Tìm số âm đầu tiên và vị trí của nó
	    public static void findFirstNegative(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] < 0) {
	                System.out.println("Số âm đầu tiên là " + array[i] + " ở vị trí " + (i + 1));
	                return;
	            }
	        }
	        System.out.println("Không có số âm trong mảng.");
	    }

	    // Tìm số âm lớn nhất và vị trí của nó
	    public static void findMaxNegative(int[] array) {
	        int maxNegative = Integer.MIN_VALUE;
	        int position = -1;
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] < 0 && array[i] > maxNegative) {
	                maxNegative = array[i];
	                position = i;
	            }
	        }
	        if (position != -1) {
	            System.out.println("Số âm lớn nhất là " + maxNegative + " ở vị trí " + (position + 1));
	        } else {
	            System.out.println("Không có số âm trong mảng.");
	        }
	    }

	    // Tính tổng các số chẵn
	    public static void sumEvenNumbers(int[] array) {
	        int sum = 0;
	        for (int num : array) {
	            if (num % 2 == 0) {
	                sum += num;
	            }
	        }
	        System.out.println("Tổng các số chẵn là " + sum);
	    }

	    // Đếm có bao nhiêu số âm
	    public static void countNegativeNumbers(int[] array) {
	        int count = 0;
	        for (int num : array) {
	            if (num < 0) {
	                count++;
	            }
	        }
	        System.out.println("Có " + count + " số âm trong mảng.");
	    }

	    // Tổng các số âm
	    public static void sumNegativeNumbers(int[] array) {
	        int sum = 0;
	        for (int num : array) {
	            if (num < 0) {
	                sum += num;
	            }
	        }
	        System.out.println("Tổng các số âm là " + sum);
	    }

	    // Tìm x trong mảng
	    public static void findNumber(int[] array, int x) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == x) {
	                System.out.println("Tìm thấy số " + x + " ở vị trí " + (i + 1));
	                return;
	            }
	        }
	        System.out.println("Không tìm thấy số " + x + " trong mảng.");
	    }
}
