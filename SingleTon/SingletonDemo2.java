public class SingletonDemo2 {
	private static SingletonDemo2 demo2 = null;
	//并不提前声明
	
	private SingletonDemo2() {//私有化构造器
		System.out.println("生成了一个实例2");
	}
	public static SingletonDemo2 getInstance() {
		if (demo2 == null) {
			demo2 = new SingletonDemo2();
			//懒加载,在我们调用getInstance的时候根据条件给这个对象赋值
			//但是是有线程安全问题的
		}
		return demo2;
	}
}