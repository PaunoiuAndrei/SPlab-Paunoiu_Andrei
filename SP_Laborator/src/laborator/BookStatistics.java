package laborator;

public class BookStatistics implements Visitor{

	protected int nrImg, nrTable, nrParagraph;
	public BookStatistics() {
		this.nrImg = 0;
		this.nrTable = 0;
		this.nrParagraph = 0;
	}
	@Override
	public void visitBook(Book book) {
		// TODO Auto-generated method stub
	}
	@Override
	public void visitSection(Section section) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void visitParagraph(Paragraph paragraph) {
		
		this.nrParagraph += 1;
	}
	@Override
	public void visitTable(Table table) {
		
		this.nrTable += 1;
	}
	@Override
	public void visitImage(Image image) {
		
		this.nrImg += 1;
	}
	@Override
	public void visitImageProxy(ImageProxy imgProxy) {
		this.nrImg += 1;
		
	}
	@Override
	public void visitTableOfContents(TableOfContents tableOfContents) {
		// TODO Auto-generated method stub
		
	}
	public void printStatistics() {
		System.out.println("*** Number of images: "+this.nrImg);
		System.out.println("*** Number of tables: "+this.nrTable);
		System.out.println("*** Number of paragraphs: "+this.nrParagraph);
	}
}
