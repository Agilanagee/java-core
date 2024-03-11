package com.learning.core.day1;

public class D01P01 {
	private String Book_title;
	private String Book_price;

	public String getBook_title() {
		return Book_title;
	}

	public void setBook_title(String book_title) {
		Book_title = book_title;
	}

	public String getBook_price() {
		return Book_price;
	}

	public void setBook_price(String book_price) {
		Book_price = book_price;
	}
	
public static void main (String[] args) {
	D01P01 b= new D01P01();
	b.Book_title="Java Programming";
	b.Book_price="350";
	System.out.println("BookTitle:" + b.Book_title +" and " +"Price:" + b.Book_price);
}
	
}