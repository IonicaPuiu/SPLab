package proiect;

public class Table extends Element implements Visitee {
	private String title;
	private Paragraph paragraph;
	
	public Table(String title) {
		this.title = title;
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
	 
	 public void render() {
	        System.out.println("Table with Title: " + this.title);
	 }
	 
	 @Override
	 public void accept(Visitor visitor) {
	      visitor.visit(this);
	 }

	 public String getTitle() {
	     return title;
	 }

}
