package laborator;

public interface Visitor {
	
	public void visitBook(Book book);
	
	public void visitSection(Section section);
	
	public void visitParagraph(Paragraph paragraph);
	
	public void visitTable(Table table);
	
	public void visitImage(Image image);
	
	public void visitImageProxy(ImageProxy imgProxy);

	public void visitTableOfContents(TableOfContents tableOfContents);
}
