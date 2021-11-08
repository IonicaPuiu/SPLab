package proiect;

import java.util.concurrent.TimeUnit;

public class Image extends Element  {
	private String imageName;
//	private SubChapter subChapter;
//	private Paragraph paragraph;
	
	public Image(String name) {
		this.imageName = name;
//		this.subChapter = sc;
		try {
		TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
	}
	
	public void print() {
		 System.out.println( "Image with name: " + imageName );
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
