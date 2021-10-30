package proiect;

import java.util.ArrayList;
import java.util.List;


public class Book extends Section {
	private String title;
	private List<Author> authors = new ArrayList<>();
	private List<Chapter> chapters = new ArrayList<>();
	List<Element> elementList = new ArrayList<>();
	private TableOfContents toc;
	
	public Book(String title) {
		super(title);
		this.title = title;
	}
	
	public void print() {
		
		 System.out.println( "Book: " + title + "\n");
		 System.out.println("Authors: ");
		 for(Author author : authors)
			 author.print();
		 System.out.println();

	     for (Element el : elementList) {
	         el.print();
	     }
	}
	
	public void addAuthor(Author author) {
		this.authors.add(author);
	}
	
	 public void addContent(Element el) {
	        this.elementList.add(el);
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
