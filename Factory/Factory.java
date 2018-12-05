public abstract class Factory {
	public Product getProduct(String owner){
		Product p=createProduct(owner);
		return p;
	}
	public abstract Product createProduct(String owner);
}