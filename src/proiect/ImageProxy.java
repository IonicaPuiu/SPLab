package proiect;

import java.awt.*;

public class ImageProxy extends Element implements Picture, Visitee{
	private String url;
	private Image realImg;
	
	public ImageProxy(String url) {
		this.url = url;
	}
	
	public Image loadImage() {
		if(realImg == null) {
			realImg = new Image(url);
		}
		return realImg;
	}
	
	@Override
	void print() {
		loadImage();
		realImg.print();
	}
	
	void render() {
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
	 
	 @Override
	 public PictureContent content() {
	      return null;
	 }

	 @Override
	 public void accept(Visitor visitor) {
	       visitor.visit(this);
	 }

}
