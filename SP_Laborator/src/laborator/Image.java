package laborator;

import java.util.concurrent.TimeUnit;

public class Image extends Element{

	private String url;
	
	public Image(String url) {
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
	}
	@Override
	public void add(Element el) {
		// TODO Auto-generated method stub
	}
	@Override
	public void remove(Element el) {
		// TODO Auto-generated method stub
	}
	@Override
	public Element get(int elNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
