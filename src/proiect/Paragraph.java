package proiect;

public class Paragraph {
	private String text;
	private SubChapter subChapter;
	
	public Paragraph(String text, SubChapter sc) {
		this.text = text;
		this.subChapter = sc;
	}
	
	public void print() {
		 System.out.println( "Paragraph: " + text );
	}

}
