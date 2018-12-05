public class ConcreteProduct extends Product {
	private String owner;
	public ConcreteProduct(String owner) {
		this.owner = owner;
		System.out.println(owner + "来购买了此产品");
	}
	public void destory() {
		System.out.println(owner+"的产品坏了,请维修人员进行维修");
	}
}