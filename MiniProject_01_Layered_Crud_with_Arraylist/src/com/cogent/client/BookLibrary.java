/**
 * 
 */
package com.cogent.client;

import java.util.Scanner;

import com.cogent.bean.BookBean;
import com.cogent.service.BookService;
import com.cogent.service.BookServiceImpl;

/**
 * @author Jayant Surya
 * @date: Sep 28, 2022
 * 
 */
public class BookLibrary {
	public static void main(String[] args) {
		BookService bookService = new BookServiceImpl();

		Scanner scanner = new Scanner(System.in);


		BookBean bookBean = null;
        // Add New Book
		bookBean = new BookBean();
		System.out.println("Enter book Id");
		bookBean.setBookId(scanner.nextInt());
		System.out.println("Enter Book title");
		bookBean.setBookTitle(scanner.next());
		System.out.println("Enter Book Author");
		bookBean.setBookAuthor(scanner.next());
		System.out.println("Enter Book Price");
		bookBean.setPrice(scanner.nextDouble());
		bookService.addBook(bookBean);

		
		//Search Book
		System.out.println("Please enter the book Id");
		BookBean book = bookService.findBookById(scanner.nextInt());
		if (book != null) {
			System.out.println(
					book.getBookId() + " " + book.getBookTitle() + " " + book.getBookAuthor() + " " + book.getPrice());
		} else {
			System.out.println("Book not found!");
		}

	}
}
