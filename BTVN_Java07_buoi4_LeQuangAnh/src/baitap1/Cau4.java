package baitap1;

import java.util.Scanner;

public class Cau4 {
	  public static void main(String[] args) {
		  /*
			 * Cho biết tên và tọa độ nhà của 3 sinh viên
			 * Cho biết tọa độ của trường học
			 * Hãy viết chương trình in ra tên tên sinh viên ở xa trường đại học nhất
			 */
	        Scanner scanner = new Scanner(System.in);

	        // Nhập tọa độ của trường học
	        System.out.println("Nhập tọa độ của trường học:");
	        System.out.print("X: ");
	        int xTruong = scanner.nextInt();
	        System.out.print("Y: ");
	        int yTruong = scanner.nextInt();
	        System.out.print("Z: ");
	        int zTruong = scanner.nextInt();
	        scanner.nextLine(); // Đọc dòng mới còn lại

	        int[] toaDoTruong = {xTruong, yTruong, zTruong};

	        // Nhập thông tin của 3 sinh viên
	        Object[][] toaDo3D = new Object[3][4];
	        for (int i = 0; i < 3; i++) {
	            System.out.println("Nhập thông tin cho sinh viên " + (i + 1) + ":");
	            System.out.print("Tên: ");
	            String ten = scanner.nextLine();
	            System.out.print("Tọa độ X: ");
	            int x = scanner.nextInt();
	            System.out.print("Tọa độ Y: ");
	            int y = scanner.nextInt();
	            System.out.print("Tọa độ Z: ");
	            int z = scanner.nextInt();
	            scanner.nextLine(); // Đọc dòng mới còn lại

	            toaDo3D[i][0] = ten;
	            toaDo3D[i][1] = x;
	            toaDo3D[i][2] = y;
	            toaDo3D[i][3] = z;
	        }

	        Object[] toaDoXaNhat = null;
	        double maxDistance = -1;

	        // Duyệt qua từng sinh viên và tính khoảng cách đến trường
	        for (Object[] toado : toaDo3D) {
	            int toadoX = (int) toado[1];
	            int toadoY = (int) toado[2];
	            int toadoZ = (int) toado[3];

	            double distance = calculateDistance(toadoX, toadoY, toadoZ, toaDoTruong[0], toaDoTruong[1], toaDoTruong[2]);

	            if (distance > maxDistance) {
	                maxDistance = distance;
	                toaDoXaNhat = toado;
	            }
	        }

	        // In ra tên sinh viên ở xa trường đại học nhất
	        if (toaDoXaNhat != null) {
	            System.out.println("Sinh viên ở xa trường đại học nhất là: " + toaDoXaNhat[0]);
	        }

	        scanner.close();
	    }

	    public static double calculateDistance(int x1, int y1, int z1, int x2, int y2, int z2) {
	        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) + Math.pow(z1 - z2, 2));
	    }
}
