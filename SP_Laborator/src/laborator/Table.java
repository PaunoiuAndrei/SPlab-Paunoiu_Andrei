package laborator;

public class Table {

	public String title;
	public Table(String title) {
		this.title=title;
	}
	public void print() {
		System.out.println("Table with Title: "+this.title);
	}
}
