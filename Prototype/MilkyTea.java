public class MilkyTea implements Product {
	private int pearl;
	private int water;
	private int milk;

	public MilkyTea() {
		// �ձ��̲�,�����̼�
	}

	public MilkyTea(int pearl, int water, int milk) {
		// ����ԭ����,��ʼ���̲�
		this.pearl = pearl;
		this.water = water;
		this.milk = milk;
	}

	@Override
	public void cost() {
		System.out.println("======================");
		System.out.println("�����µĶ���ô����,�˿͵���һ���̲�!");
		System.out.println("ʹ��" + pearl + "�˵�����");
		System.out.println("ʹ��" + water + "ml��ˮ");
		System.out.println("ʹ��" + milk + "ml��ţ��");
		System.out.println("��������,һ���̲������!");
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
