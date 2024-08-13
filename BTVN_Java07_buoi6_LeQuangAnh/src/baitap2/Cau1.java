package baitap2;

import java.util.Scanner;

public class Cau1 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int carType = 0;
	        while (carType < 1 || carType > 3) {
	            System.out.println("Chọn loại xe:");
	            System.out.println("1: GrabCar");
	            System.out.println("2: Grab SUV");
	            System.out.println("3: GrabBlack");
	            carType = scanner.nextInt();

	            if (carType < 1 || carType > 3) {
	                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
	            }
	        }

	        double km = -1;
	        while (km < 0) {
	            System.out.println("Nhập vào số KM đi được (>= 0):");
	            km = scanner.nextDouble();

	            if (km < 0) {
	                System.out.println("Số KM không hợp lệ. Vui lòng nhập lại.");
	            }
	        }

	        int waitTime = -1;
	        while (waitTime < 0) {
	            System.out.println("Nhập vào thời gian chờ (phút) (>= 0):");
	            waitTime = scanner.nextInt();

	            if (waitTime < 0) {
	                System.out.println("Thời gian chờ không hợp lệ. Vui lòng nhập lại.");
	            }
	        }

	        // Tính tổng tiền
	        double totalFare = calculateFare(carType, km, waitTime);

	        // In hoá đơn chi tiết
	        printInvoice(carType, km, waitTime, totalFare);

	        scanner.close();
	    }

	    // Hàm tính tiền dựa trên loại xe, số km và thời gian chờ
	    public static double calculateFare(int carType, double km, int waitTime) {
	        double baseFare = 0;
	        double farePerKm = 0;
	        double fareAbove19Km = 0;
	        double waitingFare = 0;

	        switch (carType) {
	            case 1: // GrabCar
	                baseFare = 8000;
	                farePerKm = 7500;
	                fareAbove19Km = 7000;
	                waitingFare = 2000;
	                break;
	            case 2: // Grab SUV
	                baseFare = 9000;
	                farePerKm = 8500;
	                fareAbove19Km = 8000;
	                waitingFare = 3000;
	                break;
	            case 3: // GrabBlack
	                baseFare = 10000;
	                farePerKm = 9500;
	                fareAbove19Km = 9000;
	                waitingFare = 3500;
	                break;
	            default:
	                System.out.println("Loại xe không hợp lệ.");
	                return 0;
	        }

	        double totalFare = 0;

	        if (km <= 1) {
	            totalFare = baseFare;
	        } else if (km <= 19) {
	            totalFare = baseFare + (km - 1) * farePerKm;
	        } else {
	            totalFare = baseFare + 18 * farePerKm + (km - 19) * fareAbove19Km;
	        }

	        totalFare += (waitTime / 3) * waitingFare;

	        return totalFare;
	    }

	    // Hàm in hoá đơn chi tiết
	    public static void printInvoice(int carType, double km, int waitTime, double totalFare) {
	        String carTypeName = "";
	        switch (carType) {
	            case 1:
	                carTypeName = "GrabCar";
	                break;
	            case 2:
	                carTypeName = "Grab SUV";
	                break;
	            case 3:
	                carTypeName = "GrabBlack";
	                break;
	        }

	        System.out.println("Hoá đơn chi tiết:");
	        System.out.println("Loại xe: " + carTypeName);
	        System.out.println("Số KM: " + km);
	        System.out.println("Thời gian chờ: " + waitTime + " phút");
	        System.out.println("Tổng tiền: " + totalFare + " VND");
	    }
}
