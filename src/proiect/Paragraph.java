package proiect;

public class Paragraph extends Element {
	private String text;
	private SubChapter subChapter;
	private AlignStrategy textAlignment;
	
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
	 
	 public void setText(String text) {
	        this.text = text;
	    }
	 
	 public void setAlignStrategy(AlignStrategy alst) {
	       this.textAlignment = alst;
	       setText(alst.render(this.text));
	    }

	 public AlignStrategy getTextAlignment() {
	       return textAlignment;
	   }

	 public String getText() {
	       return text;
	    }

}
