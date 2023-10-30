package laborator;

public class Image {

	public String imageName;
	public Image(String imgName) {
		this.imageName = imgName;
	}
	
	public void print() {
		System.out.println("Imagine with name: "+this.imageName);
	}
}
