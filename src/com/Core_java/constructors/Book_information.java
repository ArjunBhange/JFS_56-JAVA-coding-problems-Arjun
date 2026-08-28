package com.Core_java.constructors;

public class Book_information {

	int book_id,price;
	String author,title;
	
	public Book_information() {
		book_id=101;
		title= "Java Programming";
		author="James Gosling";
		price=650;
	}
	
	public void display() {
		System.out.println("Book Id : "+book_id);
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
		System.out.println("Price : "+price);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book_information b=new Book_information();
		b.display();
	}

}
