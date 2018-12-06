public class SingletonDemo1 {
	private static SingletonDemo1 demo1 = new SingletonDemo1();
	//提前声明私有化单例
	private SingletonDemo1() {//私有化构造器
		System.out.println("生成了一个实例1");
		//无论我们调用多少次getInstance(),这句话之后在类加载的时候打印一次而已
	}
	public static SingletonDemo1 getInstance() {
		return demo1;//获取单例
	}
}