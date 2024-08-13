package baitap1;

import java.util.Scanner;

class Square {
    private double side; // Chiều rộng của hình vuông

    // Constructor để khởi tạo chiều rộng
    public Square(double side) {
        this.side = side;
    }

    // Phương thức tính diện tích hình vuông
    public double calculateArea() {
        return side * side;
    }

    // Phương thức tính chu vi hình vuông
    public double calculatePerimeter() {
        return 4 * side;
    }
}
public class Cau6 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Yêu cầu người dùng nhập vào chiều rộng của hình vuông
	        System.out.print("Nhập vào chiều rộng của hình vuông: ");
	        double side = scanner.nextDouble();

	        // Tạo đối tượng hình vuông với chiều rộng nhập vào
	        Square square = new Square(side);

	        // Tính và in ra diện tích hình vuông
	        double area = square.calculateArea();
	        System.out.println("Diện tích của hình vuông là: " + area);

	        // Tính và in ra chu vi hình vuông
	        double perimeter = square.calculatePerimeter();
	        System.out.println("Chu vi của hình vuông là: " + perimeter);
	    }
}
