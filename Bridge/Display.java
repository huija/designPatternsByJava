//功能层次
public class Display {
    private DisplayImpl impl;//滑扣.让功能层次调用实现层次的桥梁
    public Display(DisplayImpl impl) {
        this.impl = impl;
    }
    public void open() {
        impl.rawOpen();
    }
    public void print() {
        impl.rawPrint();
    }
    public void close() {
        impl.rawClose();
    }
    public final void display() {//上述四个方法是基础功能
        open();
        print();                    
        close();
    }
}