package com.constructor;

import java.util.Scanner;

public class Book {
	Scanner in = new Scanner(System.in);
	String book_name;
	String book_author;
	double book_price;
	int book_quantity;
	int total;
	public Book()
	{
		System.out.println("Enter the Book name -> ");
		book_name = in.nextLine();
		System.out.println("Enter the Book price -> ");
		book_price = in.nextDouble();
		System.out.println("Enter the book quantity -> ");
		book_quantity = in.nextInt();
		System.out.println("Enter the Book author -> ");
		book_author = in.next();
	}
	public void display()
	{
		System.out.println("The book name is -> "+book_name);
		System.out.println("The name of book author is -> "+book_author);
		System.out.println("The price of book is -> "+book_price);
		System.out.println("The quantity of book is -> "+book_quantity);
		System.out.println("The total of books is -> "+(book_price*book_quantity));
	}
}
