package laborator;

import java.util.concurrent.TimeUnit;

public class ImageProxy extends Element implements Picture{

	private String url;
	protected Image realImage = new Image(null);
	public ImageProxy(String url) {
		this.url = url;
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void print() {
		System.out.println("Imagine with name: "+this.url);
		this.realImage = new Image(this.url);
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
	@Override
	public String getUrl() {
		
		return this.url;
	}
	@Override
	public String pictureContent() {
		return "Contents of the image";
	}
	
	public Image loadImage() {
		if(this.realImage == null) {
			this.realImage = new Image(this.url);
		}
		return this.realImage;
	}

}
