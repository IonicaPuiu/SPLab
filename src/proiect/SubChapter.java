package proiect;

import java.util.ArrayList;
import java.util.List;

public class SubChapter {
	private String name;
	private List<Paragraph> paragraphs = new ArrayList<>();
	private List<Image> images = new ArrayList<>();
	private List<Table> tables = new ArrayList<>();
	private Chapter chapter;
	
	public SubChapter(String name, Chapter chapter) {
		this.name = name;
		this.chapter = chapter;
	}
	
	public void print() {
		 System.out.println( "Subchapter: " + name );
		 for(Paragraph p : paragraphs)
			 p.print();
		 for(Image i : images)
			 i.print();
		 for(Table t : tables)
			 t.print();
	}
	
	public void createNewParagraph(String p) {
		Paragraph paragraph = new Paragraph(p, this);
		this.paragraphs.add(paragraph);
	}
	
	public void createNewImage(String i) {
		Image image = new Image(i, this);
		this.images.add(image);
	}
	
	public void createNewTable(String t) {
		Table table = new Table(t, this);
		this.tables.add(table);
	}

}