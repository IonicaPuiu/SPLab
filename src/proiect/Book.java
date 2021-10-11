package proiect;

import java.util.ArrayList;
import java.util.List;


public class Book {
	private String name;
	private List<String> paragraphs = new ArrayList<>();
	private List<String> images = new ArrayList<>();
	private List<String> tables = new ArrayList<>();
	private Author author;
	
	public Book(String name, List<String> paragraphs) {
		this.name = name;
		this.paragraphs = paragraphs;
	}
	
	public Book(String name) {
		this.name = name;
	}
	
	public void print() {
		
		 System.out.println( "Name: " + name );
		 System.out.print("Author name:");
		 author.print();
		 System.out.println( "Paragraphs: " + paragraphs );
		 System.out.println( "Images: " + images );
		 System.out.println( "Tables: " + tables);
	}
	
	public void createNewParagraph(String paragraph) {
		this.paragraphs.add(paragraph);
	}
	
	public void createNewImage(String image) {
		this.images.add(image);
	}
	
	public void createNewTable(String table) {
		this.tables.add(table);
	}
	
	public void addAuthor(Author author) {
		this.author = author;
	}
	
}
