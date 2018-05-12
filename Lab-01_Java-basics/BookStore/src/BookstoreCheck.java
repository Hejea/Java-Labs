
public class BookstoreCheck {

	private Book[] books;

	public static void main(String[] args) {

		BookstoreCheck bookstoreCheck = new BookstoreCheck();
		Book[] books = bookstoreCheck.makeBookstore();

		bookstoreCheck.showBookstore();
		
		Book book = books[6];
		Book book2 = books[5];
		
		System.out.println("\nIs multiple :\n\t" + book.getTitle() + " is " + ((bookstoreCheck.isMultiple(book))?"multiple":"not multiple"));
		
		System.out.println("\nThe biggest book from ( " + book.getTitle() + " - " + book2.getTitle() + " )\n\t" +
				((bookstoreCheck.wichIsBigger(book, book2) == -1)?book.getTitle() + " is bigger": 
					(((bookstoreCheck.wichIsBigger(book, book2) == 1)?book2.getTitle() + " is bigger": 
						("They are equal"))))    );
		
	}

	public boolean isMultiple(Book book) {
		
		int i = 0;
	
		for (Book book1 : this.books) {
			if ((book1.getTitle().equals(book.getTitle())) &&
				(book1.getAuthor().equals(book.getAuthor())) &&
				(book1.getPublisher().equals(book.getPublisher())) && 
				(book1.getPageCount() == book.getPageCount()) ) 
			{
				i++;
			}
		}
		
		if (i > 1) {
			return true;
		}
		
		return false;

	}

	public int wichIsBigger(Book book1, Book book2) {

		if (book1.getPageCount() > book2.getPageCount()) {
			return -1;
		}
		if (book1.getPageCount() < book2.getPageCount()) {
			return 1;
		}
		return 0;

	}

	public Book[] getBooks() {
		return books;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	public BookstoreCheck() {
		super();
	}

	public Book[] makeBookstore() {
		this.books = new Book[10];
		
		for(int i = 0; i < 7; i++) { 
			 this.books[i] = new Book();
			 this.books[i].setBook("Book " + (i+1), "Author " + (i+1), "Publisher " + (i+1), (i+1)*(i+1)); 
		} 
		for(int i = 7; i < 10; i++) {
			this.books[i] = new Book();
			this.books[i].setBook("Book " + 1, "Author " + 1, "Publisher " + 1, 1); 
		}
		return this.books;
	}

	public void showBookstore() {
		int i = 0;
		if (this.books != null) {
			for (i = 0; i < 10; i++) {
				if (this.books[i] != null) {
					System.out.println("Book " + (i+0) + ":" + 
							"\n\tTitle      : " + this.books[i].getTitle() + 
							"\n\tAuthor     : " + this.books[i].getAuthor() + 
							"\n\tPublisher  : " + this.books[i].getPublisher() + 
							"\n\tPage count : " + this.books[i].getPageCount()
					);
				}
			}
			
		}
	}
	
	public void showBook(Book book) {
		if (book != null) {
			System.out.println("Book :" + 
				"\n\tTitle      : " + book.getTitle() + 
				"\n\tAuthor     : " + book.getAuthor() + 
				"\n\tPublisher  : " + book.getPublisher() + 
				"\n\tPage count : " + book.getPageCount()
			);
		}
	}

	public BookstoreCheck(Book[] books) {
		super();
		this.books = books;
	}

}
