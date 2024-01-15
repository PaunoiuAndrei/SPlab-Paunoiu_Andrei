package laborator;

public class Paragraph extends Element implements AlignStrategy{

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
	@Override
	public void setAlignStrategy(AlignStrategy algStrat) {

		if(algStrat instanceof AlignCenter) {
			
			AlignCenter center= new AlignCenter();
			center.setAlignStrategy(center);
			this.text = "	"+this.text;
		} 
		else if(algStrat instanceof AlignLeft) {
				
				AlignLeft left= new AlignLeft();
				left.setAlignStrategy(left);
				this.text.replaceFirst("\\s", "");
				
		} else if(algStrat instanceof AlignRight ) {
			
			AlignRight right= new AlignRight();
			right.setAlignStrategy(right);
			this.text = "		"+this.text;	
		}
		
		
	}
	
}
