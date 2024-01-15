package laborator;

import java.util.ArrayList;

public class Book extends Element{

	public String title;
	public ArrayList<Author> authors = new ArrayList<>();
	public ArrayList<Element> content = new ArrayList<>();
	public int pageNumber;
	
	public Book(String title) {
		this.title=title;
		this.pageNumber = 1;
	}
	@Override
	public void print() {
		System.out.println("Book name: "+this.title);
		System.out.println("\nAuthos:");
		for(Author ath: this.authors) {
			ath.print();
		}
		for(Element cont: this.content) {
			cont.accept(new RenderContentVisitor());
		}
	}
	
	public void addAuthor(Author author) {
		this.authors.add(author);
	}
	public void addContent(Element el) {
		this.content.add(el);
	}

	@Override
	public void add(Element el) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remove(Element el) {
		// TODO Auto-generated method stub	
	}
	@Override
	public Element get(int elNumber) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void accept(Visitor v) {
		v.visitBook(this);
	}
}
