import static org.junit.Assert.*;

import java.util.Scanner;
import java.util.regex.Pattern;

import org.junit.Test;

public class BookstoreTest {
	static Scanner scanner = new Scanner(System.in);
	
	@Test
	public void testSetAtributionManualy() {
		
		Book book = new Book();
		String[] expected = new String[4];
		String[] actual = new String[4];

		System.out.print("Title : ");
		expected[0] = scanner.nextLine();
		
		System.out.print("Author : ");
		expected[1] = scanner.nextLine();
		
		System.out.print("Publisher : ");
		expected[2] = scanner.nextLine();
				
		boolean isNumber;
		int v = 0;
		do {
			System.out.print("Page count : \n");
			expected[3] = scanner.nextLine().trim();
			isNumber =  Pattern.matches("[0-9]+", expected[3]);
			if(isNumber) {
				v = Integer.parseInt(expected[3]);
			} else continue;
		} while ( v < 1);
		
		book.setBook(expected[0], expected[1], expected[2], Integer.parseInt(expected[3]));
		
		actual[0] = book.getTitle();
		actual[1] = book.getAuthor();
		actual[2] = book.getPublisher();
		actual[3] = Integer.toString(book.getPageCount());
				
		assertArrayEquals((Object[])expected, (Object[])actual);
		
	}

}
