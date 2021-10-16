package proiect;

public class Table {
	private String title;
	private SubChapter subChapter;
	private Paragraph paragraph;
	
	public Table(String title, SubChapter sc) {
		this.title = title;
		this.subChapter = sc;
	}
	
	public void print() {
		 System.out.println( "Table with Title: " + title );
	}

}
