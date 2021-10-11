package proiect;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
	private String name;
	private List<SubChapter> subChapters = new ArrayList<>();
	
	public Chapter(String name) {
		this.name = name;
	}
	
	public void print() {
		 System.out.println( name );
	}
	
	public int createSubChapter(String subChapter) {
		SubChapter sc = new SubChapter(subChapter);
		this.subChapters.add(sc);
		return subChapters.indexOf(sc);
	}
	
	public SubChapter getSubChapter(int indexSubChapter) {
		return subChapters.get(indexSubChapter);
	}

}