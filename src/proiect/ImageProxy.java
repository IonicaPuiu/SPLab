package proiect;

import java.util.concurrent.TimeUnit;

public class ImageProxy extends Element implements Picture{
	private String url;
	private Image realImg;
	
	public ImageProxy(String url) {
		this.url = url;
		this.realImg = null;

	}
	
	public Image loadImage() {
		if(realImg == null) {
			realImg = new Image(url);
		}
		return realImg;
	}
	
	public void print() {
		loadImage();
		 realImg.print();
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
	        return this.url;
	    }

}
