package proiect;

public class Table extends Element {
	private String title;
	private SubChapter subChapter;
	private Paragraph paragraph;
	
	public Table(String title) {
		this.title = title;
//		this.subChapter = sc;
	}
	
	public void print() {
		 System.out.println( "Table with Title: " + title );
	}
	
	@Override
	 public void add(Element el) {}

	 @Override
	 public void remove(Element el) {}

	 @Override
	 public Element get(int num) {
	      return null;
	 }

}
