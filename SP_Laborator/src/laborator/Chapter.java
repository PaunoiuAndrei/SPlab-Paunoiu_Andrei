package laborator;

import java.util.ArrayList;

public class Chapter {
	
	public String name;
	ArrayList<SubChapter> subChapters = new ArrayList<>();
	
	public Chapter(String name) {
		this.name=name;
	}
	
	public void print() {
		
		System.out.println("Chapter name: "+this.name);
		for(SubChapter subChp : this.subChapters) {
			subChp.print();
		}
	}
	public int createSubChapter(String subChapterName) {
		
		SubChapter newSubChapter = new SubChapter(subChapterName);
		this.subChapters.add(newSubChapter);
		return this.subChapters.size();
	}
	
	public SubChapter getSubChapter(int subChapterNumber) {
		
		return this.subChapters.get(subChapterNumber-1);
	}
}
