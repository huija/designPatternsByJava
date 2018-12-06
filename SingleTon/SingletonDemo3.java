public class SingletonDemo3 {
	//解决方案一:双重锁机制(volatile+synchronized里再if)
	private static volatile SingletonDemo3 demo3 = null;
	private SingletonDemo3() {
		System.out.println("生成了一个实例3");
	}
	public static SingletonDemo3 getInstance() {
		if (demo3 == null) {
			synchronized (SingletonDemo3.class) {
				if (demo3 == null) {
					demo3 = new SingletonDemo3();
				}
			}
		}
		return demo3;
	}
}