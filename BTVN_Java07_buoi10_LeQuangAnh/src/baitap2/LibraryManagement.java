package baitap2;

import java.util.Scanner;

public class LibraryManagement {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // Hiển thị menu
        	System.out.println("-------------------------");
            System.out.println("Library Management System");
            System.out.println("1. Add TextBook");
            System.out.println("2. Add ReferenceBook");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1, 2, 3): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    // Nhập thông tin cho Sách giáo khoa
                    System.out.println("\nEnter TextBook Information:");
                    System.out.print("Title: ");
                    String textBookTitle = scanner.nextLine();
                    System.out.print("Author: ");
                    String textBookAuthor = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String textBookIsbn = scanner.nextLine();
                    System.out.print("Subject: ");
                    String textBookSubject = scanner.nextLine();

                    TextBook textBook = new TextBook(textBookTitle, textBookAuthor, textBookIsbn, textBookSubject);

                    // Hiển thị thông tin sách giáo khoa
                    System.out.println("\nTextBook Info:");
                    textBook.display_info();
                    break;

                case 2:
                    // Nhập thông tin cho Sách tham khảo
                    System.out.println("\nEnter ReferenceBook Information:");
                    System.out.print("Title: ");
                    String refBookTitle = scanner.nextLine();
                    System.out.print("Author: ");
                    String refBookAuthor = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String refBookIsbn = scanner.nextLine();
                    System.out.print("Field: ");
                    String refBookField = scanner.nextLine();

                    ReferenceBook referenceBook = new ReferenceBook(refBookTitle, refBookAuthor, refBookIsbn, refBookField);

                    // Hiển thị thông tin sách tham khảo
                    System.out.println("\nReferenceBook Info:");
                    referenceBook.display_info();
                    break;

                case 3:
                    // Thoát chương trình
                    System.out.println("Exiting...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
                    break;
            }
        }

        scanner.close();
    }
}
