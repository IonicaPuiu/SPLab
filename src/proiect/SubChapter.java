package proiect;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
	private String name;
	private List<String> paragraphs = new ArrayList<>();
	private List<String> images = new ArrayList<>();
	private List<String> tables = new ArrayList<>();
	
	public SubChapter(String name) {
		this.name = name;
	}
	
	public void print() {
		 System.out.println( "Subchapter: " + name );
		 for(String p : paragraphs)
			 System.out.println( "Paragraph: " + p );
		 for(String i : images)
			 System.out.println( "Image with name: " + i );
		 for(String t : tables)
			 System.out.println( "Table with Title: " + t);
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

}