package proiect;

import java.util.ArrayList;
import java.util.List;


public class Book {
	private String name;
	private List<Author> authors = new ArrayList<>();
	private List<Chapter> chapters = new ArrayList<>();
	private TableOfContents toc;
	
	public Book(String name) {
		this.name = name;
	}
	
	public void print() {
		
		 System.out.println( "Name: " + name );
		 System.out.print("Authors: ");
		 for(Author author : authors)
			 author.print();
	}
	
	public void addAuthor(Author author) {
		this.authors.add(author);
	}
	
	public int createChapter(String chapter) {
		Chapter c = new Chapter(chapter, this);
		this.chapters.add(c);
		return chapters.indexOf(c);
	}
	
	public Chapter getChapter(int indexChapter) {
		return chapters.get(indexChapter);
	}
	
}
