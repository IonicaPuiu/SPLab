package proiect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Book extends Section implements Visitee {
	private String title;
	private List<Author> authors = new ArrayList<>();
	List<Element> elementList = new LinkedList<>();
	
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
	 
	public List<Author> getAuthor() {
	    return this.authors;
	}
	
	public void render() {
        System.out.println("Book: " + this.title + "\n");

        System.out.println("Authors:");
        for (Author aut : authors) {
            aut.print();
        }

        System.out.println();

        for (Element el : elementList) {
            el.print();
        }
    }

	@Override
	public void accept(Visitor visitor) {
	    visitor.visit(this);
	    for (Element el : elementList) {
	         el.accept(visitor);
	    }
	}
	
}
