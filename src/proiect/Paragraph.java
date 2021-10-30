package proiect;

public class Paragraph extends Element {
	private String text;
	private SubChapter subChapter;
	
	public Paragraph(String text) {
		this.text = text;
//		this.subChapter = sc;
	}
	
	public void print() {
		 System.out.println( "Paragraph: " + text );
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
