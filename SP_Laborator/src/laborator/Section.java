package laborator;

import java.util.ArrayList;

public class Section extends Element{

	protected String title;
	protected ArrayList<Element> elements = new ArrayList<>();
	public Section(String title) {
		this.title = title;
	}
	
	@Override
	public void print() {
		System.out.println(this.title);
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

	@Override
	public void accept(Visitor v) {
		v.visitSection(this);	
		for(Element el : this.elements)
			el.accept(v);
	}
}
