package laborator;

public class Paragraph extends Element{

	private String text;
	public Paragraph(String text) {
		
		this.setText(text);
	}
	@Override
	public void print() {
		System.out.println("Paragraph: "+this.text);
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

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
