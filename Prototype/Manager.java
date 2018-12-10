package prototype;

import java.util.HashMap;

public class Manager {
	private HashMap showcase = new HashMap();
	
	public void register(String name,Product product) {
		showcase.put(name, product);
	}
	
	public Product create(String name) {
		Product p=(Product)showcase.get(name);
		return p.createClone();
	}

}
