public class MilkyTea implements Product {
	private int pearl;
	private int water;
	private int milk;

	public MilkyTea() {
		// 空杯奶茶,无良商家
	}

	public MilkyTea(int pearl, int water, int milk) {
		// 拿齐原材料,开始做奶茶
		this.pearl = pearl;
		this.water = water;
		this.milk = milk;
	}

	@Override
	public void cost() {
		System.out.println("======================");
		System.out.println("你有新的饿了么订单,顾客点了一杯奶茶!");
		System.out.println("使用" + pearl + "克的珍珠");
		System.out.println("使用" + water + "ml的水");
		System.out.println("使用" + milk + "ml的牛奶");
		System.out.println("铛铛铛铛,一杯奶茶完成啦!");
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
