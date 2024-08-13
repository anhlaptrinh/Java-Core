package baitap5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManagement {
	private static List<Book> books = new ArrayList<>();
    private static List<User> users = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo dữ liệu giả
        initializeData();

        boolean running = true;
        while (running) {
            System.out.println("--------------------------------------");
            System.out.println("Hệ Thống Quản Lý Thư Viện");
            System.out.println("1. Mượn sách");
            System.out.println("2. Trả sách");
            System.out.println("3. Hiển thị thông tin tất cả người dùng");
            System.out.println("4. Tìm kiếm thông tin người dùng theo ID");
            System.out.println("5. Hiển thị thông tin sách");
            System.out.println("6. Tạo thêm người dùng");
            System.out.println("7. Tạo thêm sách");
            System.out.println("8. Thoát");
            System.out.print("Chọn chức năng (1-8): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    // Mượn sách
                    System.out.print("Nhập ID người dùng: ");
                    String borrowUserId = scanner.nextLine();
                    User borrower = findUserById(borrowUserId);
                    if (borrower == null) {
                        System.out.println("Người dùng không tồn tại.");
                        break;
                    }
                    System.out.println("Nhập số lượng sách muốn mượn: ");
                    int n = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left-over
                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhập tiêu đề sách để mượn: ");
                        String borrowTitle = scanner.nextLine();
                        Book bookToBorrow = findBookByTitle(borrowTitle);
                        if (bookToBorrow != null) {
                            borrower.borrow(bookToBorrow);
                        } else {
                            System.out.println("Sách không tồn tại.");
                        }
                    }
                    break;

                case 2:
                    // Trả sách
                    System.out.print("Nhập ID người dùng: ");
                    String returnUserId = scanner.nextLine();
                    User returner = findUserById(returnUserId);
                    if (returner == null) {
                        System.out.println("Người dùng không tồn tại.");
                        break;
                    }
                    System.out.print("Nhập tiêu đề sách để trả: ");
                    String returnTitle = scanner.nextLine();
                    Book bookToReturn = findBookByTitle(returnTitle);
                    if (bookToReturn != null) {
                        returner.return_book(bookToReturn);
                    } else {
                        System.out.println("Sách không tồn tại.");
                    }
                    break;

                case 3:
                    // Hiển thị thông tin tất cả người dùng
                    System.out.println("Danh sách người dùng:");
                    for (User user : users) {
                        user.display_info();
                        System.out.println();
                    }
                    break;

                case 4:
                    // Tìm kiếm thông tin người dùng theo ID
                    System.out.print("Nhập ID người dùng: ");
                    String userId = scanner.nextLine();
                    User user = findUserById(userId);
                    if (user != null) {
                        user.display_info();
                    } else {
                        System.out.println("Người dùng không tồn tại.");
                    }
                    break;

                case 5:
                    // Hiển thị thông tin sách
                    System.out.println("Danh sách sách:");
                    for (Book book : books) {
                        book.display_info();
                        System.out.println();
                    }
                    break;

                case 6:
                    // Tạo thêm người dùng
                    System.out.print("Nhập ID người dùng mới: ");
                    String newUserId = scanner.nextLine();
                    System.out.print("Nhập tên người dùng mới: ");
                    String newUserName = scanner.nextLine();
                    if (findUserById(newUserId) != null) {
                        System.out.println("ID người dùng đã tồn tại.");
                    } else {
                        users.add(new User(newUserId, newUserName));
                        System.out.println("Người dùng đã được thêm.");
                    }
                    break;

                case 7:
                    // Tạo thêm sách
                    System.out.print("Nhập loại sách (1 - Sách giáo khoa, 2 - Sách tham khảo): ");
                    int bookType = scanner.nextInt();
                    scanner.nextLine(); // Consume newline left-over
                    System.out.print("Nhập tiêu đề sách: ");
                    String title = scanner.nextLine();
                    System.out.print("Nhập tác giả sách: ");
                    String author = scanner.nextLine();
                    System.out.print("Nhập ISBN sách: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Nhập thông tin bổ sung (chủ đề đối với sách giáo khoa, lĩnh vực đối với sách tham khảo): ");
                    String additionalInfo = scanner.nextLine();
                    
                    if (bookType == 1) {
                        books.add(new TextBook(title, author, isbn, additionalInfo));
                    } else if (bookType == 2) {
                        books.add(new ReferenceBook(title, author, isbn, additionalInfo));
                    } else {
                        System.out.println("Loại sách không hợp lệ.");
                    }
                    System.out.println("Sách đã được thêm.");
                    break;

                case 8:
                    System.out.println("Thoát...");
                    running = false;
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn từ 1 đến 8.");
                    break;
            }
        }

        scanner.close();
    }

    // Hàm tạo dữ liệu giả
    private static void initializeData() {
        // Tạo sách
        books.add(new TextBook("Sách Giáo Khoa Toán", "Nguyễn Văn A", "123456789", "Toán học"));
        books.add(new ReferenceBook("Sách Tham Khảo Khoa Học", "Trần Văn B", "987654321", "Khoa học"));
        books.add(new TextBook("Sách Giáo Khoa Vật Lý", "Lê Văn C", "112233445", "Vật lý"));
        books.add(new ReferenceBook("Sách Tham Khảo Hóa Học", "Hoàng Thị D", "556677889", "Hóa học"));
        books.add(new TextBook("Sách Giáo Khoa Hóa Học", "Nguyễn Thị E", "998877665", "Hóa học"));
        books.add(new ReferenceBook("Sách Tham Khảo Toán Học", "Trương Văn F", "223344556", "Toán học"));

        // Tạo người dùng
        users.add(new User("U001", "Nguyễn Văn G"));
        users.add(new User("U002", "Trần Thị H"));
        users.add(new User("U003", "Lê Văn I"));
        users.add(new User("U004", "Hoàng Thị J"));
        users.add(new User("U005", "Nguyễn Thị K"));
    }

    // Tìm người dùng theo ID
    private static User findUserById(String userId) {
        for (User user : users) {
            if (user.getUserId().equalsIgnoreCase(userId)) {
                return user;
            }
        }
        return null;
    }

    // Tìm sách theo tiêu đề
    private static Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
	   
}
