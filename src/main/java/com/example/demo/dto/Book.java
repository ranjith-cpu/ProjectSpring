package com.example.demo.dto;

public class Book {
	String Bname, Author, Subject;
	int Price, Bid;
	public Book (String Bname, String Author, String Subject, int Price, int Bid) {
		this.Bname=Bname;
		this.Author=Author;
		this.Subject=Subject;
		this.Price=Price;
		this.Bid=Bid;
	}
	
	public String getBname() {
		return Bname;
	}

	public int getBid() {
		return Bid;
	}

	public void setBid(int bid) {
		Bid = bid;
	}

	public void setBname(String bname) {
		Bname = bname;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		Subject = subject;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Book [Bname=" + Bname + ", Author=" + Author + ", Subject=" + Subject + ", Price=" + Price + ", Bid="
				+ Bid + "]";
	}

	

}
