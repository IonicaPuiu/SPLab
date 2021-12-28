package proiect;

import java.util.LinkedList;
import java.util.List;

public class TableOfContents extends Element implements Visitee {
    String title;
    List<Element> listaElemente = new LinkedList<>();

    public TableOfContents(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("TableOfContents with title: " + this.title);
    }

    @Override
    public void add(Element el) {
    	if (el.parent == null) {
            this.listaElemente.add(el);
            el.parent = this;
        }

    }

    @Override
    public void remove(Element el) {
    	this.listaElemente.remove(el);

    }

    @Override
    public Element get(int num) {
    	return this.listaElemente.get(num);
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    public void render() {
        System.out.println("TableOfContents with title: " + this.title);
        for (Element el:listaElemente) {
            el.print();
        }
    }
}
