package myApp;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Annotations @XmlRootElement and @XmlType are allowing for the communication with book object
 * by automatic binding. It must have default or empty constructor 
 * Getters and Setters must be defined 
 */
@XmlRootElement(name="book")

@XmlType(propOrder = { "id", "author", "title", "year" } )
public class Book {

	private int id;
	private String title;
	private String author;
	private int year;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}	
}
