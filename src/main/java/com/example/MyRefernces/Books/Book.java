package com.example.MyRefernces.Books;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer id;;
  private String name;
  private String author;
  private String category;
  private Long price;
  
  public Book() {}
  public Book(String name, String author, String category, Long price) {
	super();
	this.name = name;
	this.author = author;
	this.category = category;
	this.price = price;
  }
  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
  public String getAuthor() {
	return author;
  }
  public void setAuthor(String author) {
	this.author = author;
  }
  public String getCategory() {
	return category;
  }
  public void setCategory(String category) {
	this.category = category;
  }
  public Long getPrice() {
	return price;
  }
  public void setPrice(Long price) {
	this.price = price;
  }
  @Override
  public String toString() {
	return "Book [id=" + id + ", name=" + name + ", author=" + author + ", category=" + category + ", price=" + price
			+ "]";
  }
  
  
  
}
