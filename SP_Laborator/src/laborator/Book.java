package laborator;

import java.util.ArrayList;

public class Book {

	public String title;
	public ArrayList<Author> authors = new ArrayList<>();
	public ArrayList<Element> content = new ArrayList<>();
	
	public Book(String title) {
		this.title=title;
	}
	
	public void print() {
		System.out.println("Book name: "+this.title);
		System.out.println("\nAuthos:");
		for(Author ath: this.authors) {
			ath.print();
		}
		System.out.println();
		for(Element cont: this.content) {
			cont.print();
		}
	}
	
	public void addAuthor(Author author) {
		this.authors.add(author);
	}
	public void addContent(Element el) {
		this.content.add(el);
	}
}
