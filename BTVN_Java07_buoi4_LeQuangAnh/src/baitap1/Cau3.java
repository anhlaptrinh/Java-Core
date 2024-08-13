package baitap1;

import java.util.Scanner;

public class Cau3 {
	 public static void main(String[] args) {
			/*
			 * Cho biết tên năm sinh giới tính của 3 cán bộ
			 * Hãy viết chương trình tìm ra cán bộ Nam trẻ nhất
			 */
	        // Tạo một Scanner để nhận dữ liệu từ bàn phím
	        Scanner scanner = new Scanner(System.in);

	        // Tạo mảng chứa thông tin của 3 cán bộ
	        Object[][] Canbo = new Object[3][3];

	        // Nhập thông tin cho từng cán bộ
	        for (int i = 0; i < Canbo.length; i++) {
	            System.out.println("Nhập thông tin cho cán bộ " + (i + 1) + ":");

	            System.out.print("Tên: ");
	            String name = scanner.nextLine();

	            System.out.print("Giới tính (Nam/Nữ): ");
	            String genderInput = scanner.nextLine();
	            boolean gender = genderInput.equalsIgnoreCase("Nam");

	            System.out.print("Năm sinh: ");
	            int yearOfBirth = scanner.nextInt();
	            scanner.nextLine(); // Đọc dòng mới còn lại

	            // Gán thông tin vào mảng
	            Canbo[i][0] = name;
	            Canbo[i][1] = gender;
	            Canbo[i][2] = yearOfBirth;
	        }

	        Object[] youngestMale = null;

	        // Duyệt qua từng cán bộ trong mảng
	        for (Object[] canbo : Canbo) {
	            boolean gender = (Boolean) canbo[1];
	            int yearOfBirth = (Integer) canbo[2];

	            // Kiểm tra xem cán bộ đó có phải là Nam hay không
	            if (gender) {
	                // Nếu youngestMale chưa được gán hoặc cán bộ hiện tại trẻ hơn youngestMale
	                if (youngestMale == null || yearOfBirth > (Integer) youngestMale[2]) {
	                    youngestMale = canbo;
	                }
	            }
	        }

	        // In ra thông tin cán bộ Nam trẻ nhất
	        if (youngestMale != null) {
	            System.out.println("Cán bộ Nam trẻ nhất là: ");
	            System.out.println("Tên: " + youngestMale[0]);
	            System.out.println("Năm sinh: " + youngestMale[2]);
	        } else {
	            System.out.println("Không có cán bộ Nam nào trong danh sách.");
	        }

	        // Đóng Scanner
	        scanner.close();
	    }
}
