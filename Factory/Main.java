public class Main {
	public static void main(String[] args) {
		Factory factory=new ConcreteFactory();//创建一个工厂类用来获取对象
		Product p1=factory.getProduct("小明");
		Product p2=factory.getProduct("小红");
		System.out.println("-------1年后-------");
		p1.destory();
		p2.destory();
	}
}