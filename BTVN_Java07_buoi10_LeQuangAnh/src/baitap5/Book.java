package baitap5;

public class Book {
	 protected String title;
	    protected String author;
	    protected String isbn;

	    public Book(String title, String author, String isbn) {
	        this.title = title;
	        this.author = author;
	        this.isbn = isbn;
	    }

	    public void display_info() {
	        System.out.println("Tiêu đề: " + title);
	        System.out.println("Tác giả: " + author);
	        System.out.println("ISBN: " + isbn);
	    }
}
class TextBook extends Book {
    private String subject;

    public TextBook(String title, String author, String isbn, String subject) {
        super(title, author, isbn);
        this.subject = subject;
    }

    @Override
    public void display_info() {
        super.display_info();
        System.out.println("Môn học: " + subject);
    }
}
class ReferenceBook extends Book {
    private String field;

    public ReferenceBook(String title, String author, String isbn, String field) {
        super(title, author, isbn);
        this.field = field;
    }

    @Override
    public void display_info() {
        super.display_info();
        System.out.println("Lĩnh vực: " + field);
    }
}