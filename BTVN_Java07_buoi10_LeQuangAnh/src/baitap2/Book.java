package baitap2;

public class Book {
	 protected String title;
	    protected String author;
	    protected String isbn;

	    protected Book(String title, String author, String isbn) {
	        this.title = title;
	        this.author = author;
	        this.isbn = isbn;
	    }

	    public void display_info() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("ISBN: " + isbn);
	    }
}
class TextBook extends Book {
    private String subject;

    protected TextBook(String title, String author, String isbn, String subject) {
        super(title, author, isbn);
        this.subject = subject;
    }

    @Override
    public void display_info() {
        super.display_info();
        System.out.println("Subject: " + subject);
    }
}
class ReferenceBook extends Book {
    private String field;

    protected ReferenceBook(String title, String author, String isbn, String field) {
        super(title, author, isbn);
        this.field = field;
    }

    @Override
    public void display_info() {
        super.display_info();
        System.out.println("Field: " + field);
    }
}
