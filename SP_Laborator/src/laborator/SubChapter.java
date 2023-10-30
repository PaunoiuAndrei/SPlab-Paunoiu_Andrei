package laborator;

import java.util.ArrayList;

public class SubChapter {

	public String name;
	ArrayList<Image> images = new ArrayList<>();
	ArrayList<Paragraph> paragraphs = new ArrayList<>();
	ArrayList<Table> tables = new ArrayList<>();
	
	public SubChapter(String name) {
		this.name=name;
	}
	public void print() {
		System.out.println("SubChapter name: "+this.name);
		
		for(Paragraph prgh: this.paragraphs) {
			prgh.print();
		}
		
		for(Image img: this.images) {
			img.print();
		}
		
		for(Table tbl: this.tables) {
			tbl.print();
		}
	}
	
	public void createNewParagraph(String paragraphName) {
		
		Paragraph newParagraph = new Paragraph(paragraphName);
		this.paragraphs.add(newParagraph);
	}
	
	public void createNewImage(String imageName) {
		
	    Image newImage = new Image(imageName);
	    this.images.add(newImage);
	}
	
	public void createNewTable(String tableName) {
		
	    Table newTable = new Table(tableName);
	    this.tables.add(newTable);
	}
	
	
}
