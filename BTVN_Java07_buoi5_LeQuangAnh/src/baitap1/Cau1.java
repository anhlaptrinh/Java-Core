package baitap1;

import java.util.Random;
import java.util.Scanner;

public class Cau1 {
	 private static final String[] choices = {"Bao", "Kéo", "Búa"};
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        int userWins = 0;
	        int computerWins = 0;

	        while (true) {
	            System.out.println("Chọn: 0 - Dừng, 1 - Bao, 2 - Kéo, 3 - Búa");
	            int userChoice = getUserChoice(scanner);

	            if (userChoice == 0) {
	                break;
	            }

	            int computerChoice = random.nextInt(3) + 1;
	            System.out.println("Bạn chọn: " + choices[userChoice - 1]);
	            System.out.println("Máy chọn: " + choices[computerChoice - 1]);

	            int result = getResult(userChoice, computerChoice);
	            if (result == 1) {
	                System.out.println("Bạn thắng!");
	                userWins++;
	            } else if (result == -1) {
	                System.out.println("Máy thắng!");
	                computerWins++;
	            } else {
	                System.out.println("Hòa!");
	            }

	            System.out.println("Tỉ số hiện tại - Bạn: " + userWins + " Máy: " + computerWins);
	        }

	        System.out.println("Trò chơi kết thúc!");
	        System.out.println("Tỉ số cuối cùng - Bạn: " + userWins + " Máy: " + computerWins);
	        scanner.close();
	    }

	    // Phương thức lấy đầu vào từ người chơi và kiểm tra tính hợp lệ
	    private static int getUserChoice(Scanner scanner) {
	        int choice;
	        while (true) {
	            System.out.print("Nhập lựa chọn của bạn: ");
	            if (scanner.hasNextInt()) {
	                choice = scanner.nextInt();
	                if (choice >= 0 && choice <= 3) {
	                    break;
	                } else {
	                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn 0, 1, 2, hoặc 3.");
	                }
	            } else {
	                System.out.println("Vui lòng nhập một số.");
	                scanner.next(); // Loại bỏ đầu vào không phải số
	            }
	        }
	        return choice;
	    }

	    // Phương thức xác định kết quả của ván chơi
	    private static int getResult(int userChoice, int computerChoice) {
	        if (userChoice == computerChoice) {
	            return 0;
	        }

	        switch (userChoice) {
	            case 1: // Bao
	                return (computerChoice == 3) ? 1 : -1;
	            case 2: // Kéo
	                return (computerChoice == 1) ? 1 : -1;
	            case 3: // Búa
	                return (computerChoice == 2) ? 1 : -1;
	        }
	        return 0;
	    }
}
