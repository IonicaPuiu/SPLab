package proiect;

public class Image {
	private String imageName;
	private SubChapter subChapter;
	private Paragraph paragraph;
	
	public Image(String name, SubChapter sc) {
		this.imageName = name;
		this.subChapter = sc;
	}
	
	public void print() {
		 System.out.println( "Image with name: " + imageName );
	}

}
