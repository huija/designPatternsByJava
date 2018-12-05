public class ConcreteFactory extends Factory {
	public Product createProduct(String owner) {
		return new ConcreteProduct(owner);
	}
}