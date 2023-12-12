package laborator;

public abstract class Element {

	public abstract void print();
	public abstract void add(Element el);
	public abstract void remove(Element el);
	public abstract Element get(int elNumber);
	public abstract void accept(Visitor v);
}
