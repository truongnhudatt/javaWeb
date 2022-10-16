package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test_db.books")
public class Book {
	@Id
	@Column(name = "bookID" )
	private String bookID;
	private String title;
	private String author;
	private String description;
	private String releaseDate;
	private int numOfPage;
	private String category;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String bookID, String title, String author, String description, String releaseDate, int numOfPage,
			String category) {
		super();
		this.bookID = bookID;
		this.title = title;
		this.author = author;
		this.description = description;
		this.releaseDate = releaseDate;
		this.numOfPage = numOfPage;
		this.category = category;
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getNumOfPage() {
		return numOfPage;
	}

	public void setNumOfPage(int numOfPage) {
		this.numOfPage = numOfPage;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	

	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", title=" + title + ", author=" + author + ", description=" + description
				+ ", releaseDate=" + releaseDate + ", numOfPage=" + numOfPage + ", category=" + category + "]";
	}
	
	
}
