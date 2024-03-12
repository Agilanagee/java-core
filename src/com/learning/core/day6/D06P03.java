package com.learning.core.day6;

import java.util.*;

class Book implements Comparable<Book> {
    private int bookId;
    private String title;
    private double price;
    private String author;
    private Date publicationDate;

    public Book(int bookId, String title, double price, String author, Date publicationDate) {
        this.setBookId(bookId);
        this.title = title;
        this.price = price;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return getBookId() + " " + title + " $" + price + " " + author + " " + publicationDate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookId(), title, price, author, publicationDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return getBookId() == book.getBookId() &&
                Double.compare(book.price, price) == 0 &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(publicationDate, book.publicationDate);
    }

    @Override
    public int compareTo(Book otherBook) {
        return Integer.compare(this.getBookId(), otherBook.getBookId());
    }

	int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
}

public class D06P03 {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        // Create a TreeSet to store book details with natural ordering based on book ID
        TreeSet<Book> bookSet = new TreeSet<>();

        
        bookSet.add(new Book(1001, "Python learning", 715.0, "Martin C.Brown", new Date(2, 1, 20)));
        bookSet.add(new Book(1002, "Modern mainframe", 295.0, "Sharad", new Date(19, 4, 97)));
        bookSet.add(new Book(1003, "Java Programming", 523.0, "Gilad Bracha", new Date(23, 10, 84)));
        bookSet.add(new Book(1004, "Read C++", 295.0, "Henry Harvin", new Date(19, 10, 84)));
        bookSet.add(new Book(1005, "Net Platform", 3497.0, "Mark J Price", new Date(6, 2, 84)));

        // Print all the book details
        System.out.println("Book Details:");
        for (Book book : bookSet) {
            System.out.println(book);
        }
    }
}
