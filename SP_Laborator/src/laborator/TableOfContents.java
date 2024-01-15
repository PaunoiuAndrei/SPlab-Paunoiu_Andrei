package laborator;

import java.util.ArrayList;

public class TableOfContents extends Element{

	protected ArrayList<String> table = new ArrayList<>();
	
	public TableOfContents(ArrayList<String> table) {
		this.table = table;
	}
	
	@Override
	public void print() {
		System.out.println("Table of contents: ");
		for(String el : this.table) {
			System.out.println(el);
		}
	}
	@Override
	public void add(Element el) {
		this.table.add(el.toString());
	}
	@Override
	public void remove(Element el) {
			
	}
	@Override
	public Element get(int elNumber) {
		return null;
	}
	@Override
	public void accept(Visitor v) {
		v.visitTableOfContents(this);
	}

}
