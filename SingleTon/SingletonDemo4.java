public class SingletonDemo4 {
    //解决方案二:内部类,需要时加载且仅加载一次
    private SingletonDemo4() {
        System.out.println("生成了一个实例4");
    }

    private static class SingleTon{
        private static SingletonDemo4 demo4 = new SingletonDemo4();
    }
    public static SingletonDemo4 getInstance() {
        return SingleTon.demo4;
        //return null;
    }
}