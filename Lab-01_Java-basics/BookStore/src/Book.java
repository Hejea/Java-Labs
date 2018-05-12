
public class Book {
	
	private String title;
	private String author;
	private String publisher;
	private int pageCount;
	
	public Book() {
		super();
		this.setBook("Unknown", "Unknown", "Unknown", 0);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public Book(String title, String author, String publisher, int pageCount) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.pageCount = pageCount;
	}
	
	public void setBook(String title, String author, String publisher, int pageCount) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.pageCount = pageCount;
	}
	/*
	public void setManuatlyBook(Book book) {
		Scanner scanner = new Scanner(System.in);
	    String value = new String(); 
	    
	    System.out.println("Title : ");
	    value = scanner.nextLine();
		book.setTitle(value);
	    
		System.out.println("Author : ");
		value = scanner.nextLine();
		book.setAuthor(value);
		
		System.out.println("Publisher : ");
		value = scanner.nextLine();
		book.setPublisher(value);
		
		System.out.println("Page count : ");
		value = scanner.nextLine();
		book.setPageCount(Integer.parseInt(value));
	}
	//*/
	
}
