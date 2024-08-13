package baitap5;

import java.util.ArrayList;
import java.util.List;

public class User {
	 private String userId;
	    private String name;
	    private List<Book> borrowedBooks;

	    public User(String userId, String name) {
	        this.userId = userId;
	        this.name = name;
	        this.borrowedBooks = new ArrayList<>();
	    }
	    

	    public String getUserId() {
			return userId;
		}


		public void setUserId(String userId) {
			this.userId = userId;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public List<Book> getBorrowedBooks() {
			return borrowedBooks;
		}


		public void setBorrowedBooks(List<Book> borrowedBooks) {
			this.borrowedBooks = borrowedBooks;
		}


		public void borrow(Book book) {
	        borrowedBooks.add(book);
	        System.out.println(name + " đã mượn sách: " + book.title);
	    }

	    public void return_book(Book book) {
	        if (borrowedBooks.remove(book)) {
	            System.out.println(name + " đã trả sách: " + book.title);
	        } else {
	            System.out.println("Sách không tồn tại trong danh sách mượn của " + name);
	        }
	    }

	    public void display_info() {
	        System.out.println("ID người dùng: " + userId);
	        System.out.println("Tên: " + name);
	        System.out.println("Sách đã mượn:");
	        if(borrowedBooks.isEmpty()) {
	        	System.out.println("none");
	        }
	        else System.out.println("===================");
	        for (Book book : borrowedBooks) {
	            book.display_info();
	            System.out.println("===================");
	        }
	    }
}
