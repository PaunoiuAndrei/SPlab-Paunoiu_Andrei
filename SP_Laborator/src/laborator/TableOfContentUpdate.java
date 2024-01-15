package laborator;

public class TableOfContentUpdate implements Visitor{

	public Book book;
	TableOfContentUpdate(Book book){
		
		this.book = book;
	}
	@Override
	public void visitBook(Book book) {
		
		System.out.println("TableOfCotent");
		System.out.println();
		
		for(Element cont: book.content) {
			cont.accept(new TableOfContentUpdate(book));
		}
		
	}

	@Override
	public void visitSection(Section section) {
		
		System.out.println(section.title+"..................."+this.book.pageNumber);
	}

	@Override
	public void visitParagraph(Paragraph paragraph) {

		this.book.pageNumber++;
	}

	@Override
	public void visitTable(Table table) {
		
		this.book.pageNumber++;
	}

	@Override
	public void visitImage(Image image) {
		
		this.book.pageNumber++;
	}

	@Override
	public void visitImageProxy(ImageProxy imgProxy) {
		
		this.book.pageNumber++;
	}

	@Override
	public void visitTableOfContents(TableOfContents tableOfContents) {
		// TODO Auto-generated method stub
		
	}

}
