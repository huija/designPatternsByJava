public class Hamburger implements Product {
	private int Bread;
	private int meat;
	private int Vegetable;

	public Hamburger() {
		// 你是要让我吃空气吗
	}

	public Hamburger(int bread, int meat, int vegetable) {
		this.Bread = bread;
		this.meat = meat;
		this.Vegetable = vegetable;
	}

	@Override
	public void cost() {
		System.out.println("======================");
		System.out.println("你有新的美团订单,顾客点了一个汉堡包!");
		System.out.println("使用" + Bread + "片面包");
		System.out.println("使用" + meat + "片肉片");
		System.out.println("使用" + Vegetable + "片菜叶");
		System.out.println("铛铛铛铛,一个汉堡包完成啦!");
		System.out.println("======================");

	}

	@Override
	public Product createClone() {
		// 3d打印机,直接打印
		Product p = null;
		try {
			p = (Product) clone();// add cast to Product
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
}
