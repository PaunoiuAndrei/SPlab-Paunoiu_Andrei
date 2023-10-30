package laborator;

import java.util.ArrayList;

public class Book {

	public String title;
	public ArrayList<Author> authors = new ArrayList<>();
	public ArrayList<Chapter> chapters = new ArrayList<>();
	
	public Book(String title) {
		this.title=title;
	}
	
	public void print() {
		System.out.println("Book name: "+this.title);
		
		for(Author ath: this.authors) {
			ath.print();
		}
		for(Chapter cht: this.chapters) {
			cht.print();
		}
	}
	
	public void addAuthor(Author author) {
		this.authors.add(author);
	}
	
	public int createChapter(String chapterName) {
		
		Chapter newChapter = new Chapter(chapterName);
		this.chapters.add(newChapter);
		return this.chapters.size();
	}
	
	public Chapter getChapter(int chapterNumber) {
		
		return this.chapters.get(chapterNumber-1);
	}
}
