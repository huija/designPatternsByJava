public class Hamburger implements Product {
	private int Bread;
	private int meat;
	private int Vegetable;

	public Hamburger() {
		// ����Ҫ���ҳԿ�����
	}

	public Hamburger(int bread, int meat, int vegetable) {
		this.Bread = bread;
		this.meat = meat;
		this.Vegetable = vegetable;
	}

	@Override
	public void cost() {
		System.out.println("======================");
		System.out.println("�����µ����Ŷ���,�˿͵���һ��������!");
		System.out.println("ʹ��" + Bread + "Ƭ���");
		System.out.println("ʹ��" + meat + "Ƭ��Ƭ");
		System.out.println("ʹ��" + Vegetable + "Ƭ��Ҷ");
		System.out.println("��������,һ�������������!");
		System.out.println("======================");

	}

	@Override
	public Product createClone() {
		// 3d��ӡ��,ֱ�Ӵ�ӡ
		Product p = null;
		try {
			p = (Product) clone();// add cast to Product
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
}
