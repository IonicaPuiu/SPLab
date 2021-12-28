package proiect;

import java.util.concurrent.TimeUnit;

public class Image extends Element implements Picture {
	private String imageName;
	
	public Image(String name) {
		this.imageName = name;
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
	 
	 @Override
	    public String url() {
	        return this.imageName;
	    }
	 
	   public void render() {
	        System.out.println("Image with name: " + this.imageName);
	        content().renderImage();
	    }
	   
	   @Override
	    public PictureContent content() {
	        return new PictureContent(this.imageName);
	    }

	    @Override
	    public void accept(Visitor visitor) {
	        visitor.visit(this);
	    }

	    public String getImageName() {
	        return imageName;
	    }

}
