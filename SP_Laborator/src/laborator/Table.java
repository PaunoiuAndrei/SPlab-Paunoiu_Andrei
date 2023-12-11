package laborator;

public class Table extends Element{

	private String title;
	public Table(String title) {
		this.title=title;
	}
	@Override
	public void print() {
		System.out.println("Table with Title: "+this.title);
	}
	@Override
	public void add(Element el) {
		
	}
	@Override
	public void remove(Element el) {
		
	}
	@Override
	public Element get(int elNumber) {
		
		return null;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
