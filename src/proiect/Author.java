package proiect;

import java.util.ArrayList;
import java.util.List;

public class Author {
	private String name;
	private List<Book> books = new ArrayList<>();
	
	public Author(String name) {
		this.name = name;
	}
	
	public void print() {
		 System.out.println("Author: " + name );
	}

}
