public class Main 
{
	public static void main(String[] args) 
	{
		SingletonDemo s1=SingletonDemo.singletonDemo;//枚举类单例超级简单
		SingletonDemo s2=SingletonDemo.singletonDemo;
		System.out.println(s1 == s2);//枚举类型判断两者地址是否相等
	
		SingletonDemo1 s3=SingletonDemo1.getInstance();//类加载的时候进行初始化
		SingletonDemo1 s4=SingletonDemo1.getInstance();
		
		SingletonDemo2 s5=SingletonDemo2.getInstance();//懒加载,get的时候再初始化,但是会有线程安全问题
		SingletonDemo2 s6=SingletonDemo2.getInstance();
		
		SingletonDemo3 s7=SingletonDemo3.getInstance();//双重锁
		SingletonDemo3 s8=SingletonDemo3.getInstance();
		
		SingletonDemo4 s9=SingletonDemo4.getInstance();//IoDH单例,内部类加载时初始化
		SingletonDemo4 s10=SingletonDemo4.getInstance();
	}
}