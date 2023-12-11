package laborator;

import java.util.ArrayList;

public class Section extends Element{

	private String title;
	private ArrayList<Element> elements = new ArrayList<>();
	public Section(String title) {
		this.title = title;
	}
	
	public void setTitle(String title) {
		this.title =  title;
	}
	public String getTitle() {
		return this.title;
	}

	@Override
	public void print() {
		System.out.println(this.title);
		for(Element el : elements) {
			el.print();
		}
	}
	@Override
	public void add(Element el) {
		this.elements.add(el);
		
	}
	@Override
	public void remove(Element el) {
		this.elements.remove(el);
		
	}
	@Override
	public Element get(int elNumber) {
		
		return this.elements.get(elNumber);
	}
}
